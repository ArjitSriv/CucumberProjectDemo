package Scripts.StepsDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Scripts/Features", glue = {"Scripts"},
monochrome = true,
plugin = {"pretty", "json:target/cucumber-reports/Cucumber.json"}
)
public class TestRunner {

}
