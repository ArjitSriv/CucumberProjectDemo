package Scripts.StepDefinition;

import com.swag.pageObjects.InventoryPage;
import com.swag.pageObjects.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class LoginSteps extends Generic {

    @Given("^User is on login page$")
    public void openLoginPage(){
        System.out.println("Need to validate Login Page");
    }

    @When("^user login using valid \"(.*)\"$")
    public void enterUsernameAndPassword(String loginCredentials) throws IOException {
        LoginPage lp = new LoginPage(this.driver);
        lp.login(loginCredentials);
    }


    @Then("^Menu button should display at the home Page$")
    public void verifyMenuButton() {
        InventoryPage ip = new InventoryPage(this.driver);
        String menuButtonLocator = ip.getMenuButtonLocator();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement element = wait
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(menuButtonLocator)));
        boolean status = element.isDisplayed();
        Assert.assertTrue("Unable to verify menu button after login with valid user.", status);
    }



}
