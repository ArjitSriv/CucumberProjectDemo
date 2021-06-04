package Scripts.StepDefinition;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Scripts/Features", glue = {"Scripts"},
        plugin = { "html:target/cucumber-reports/cucumber.html","json:target/cucumber-reports/cucumber.json", "junit:target/cucumber-reports/cucumber.xml","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        monochrome = true
)
public class TestRunner {


}
