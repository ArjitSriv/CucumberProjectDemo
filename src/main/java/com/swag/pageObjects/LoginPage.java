package com.swag.pageObjects;

import com.swag.utilities.FileReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class LoginPage extends BasePage{

    WebDriver driver;
    @FindBy(xpath = "//input[@id='user-name']")
    private WebElement usernameTextBox;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordTextBox;

    @FindBy(xpath = "//input[@id='login-button']")
    private WebElement loginButton;

    @FindBy(xpath = "//button[@id=\"add-to-cart-sauce-labs-backpack\"]")
    private WebElement Cart;


    private String loginLogoLocator = "//div[@class='login_logo']";

    public String loginTestDataFilePath = "src/test/java/Scripts/EnvironmentConfig/Login.ini";
    FileReader reader = new FileReader();

    public LoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void navigateToLoginPage(String url) throws IOException {
        String loginUrl= reader.readIniFile(loginTestDataFilePath, url, "loginPage");
        System.setProperty("webdriver.chrome.driver", "./CucumberProjectDemo/Drivers/chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        this.driver.get(loginUrl);
    }
    public void login(String loginCredentials) throws IOException {
        FileReader reader = new FileReader();
        String username = reader.readIniFile(loginTestDataFilePath, loginCredentials, "username");
        String password = reader.readIniFile(loginTestDataFilePath, loginCredentials, "password");
        usernameTextBox.sendKeys(username);
        passwordTextBox.sendKeys(password);
        loginButton.click();

    }
    public String getLoginLogoLocator(){
        return loginLogoLocator;


    }


}
