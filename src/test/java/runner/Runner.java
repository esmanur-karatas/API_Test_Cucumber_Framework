package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = {"stepdefinitions", "hooks"},
        //tags = "@get",
        dryRun = false,
        plugin = {"pretty", "html:target/cucumber-reports/cucumber.html"}
)
public class Runner {

}
