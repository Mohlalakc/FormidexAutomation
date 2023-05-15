package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="src/test/java/featureFiles"
        , glue = {"StepDefinitions"}
        , tags = ""
        ,plugin = { "pretty", "html: ExecutionReport/cucumber-reports.html"}
)
public class TestRunner {
}
