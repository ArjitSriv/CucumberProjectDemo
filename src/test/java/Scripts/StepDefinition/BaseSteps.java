package Scripts.StepDefinition;

import com.swag.utilities.FileReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class BaseSteps extends Generic{

    @Before
    public void before() throws IOException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        FileReader reader = new FileReader();
        String loginUrl = reader.readIniFile("src/test/java/Scripts/EnvironmentConfig/Login.ini", "url", "loginPage");
        driver.get(loginUrl);
    }

    @After
    public void after(){
        driver.close();
        driver.quit();
    }
}
