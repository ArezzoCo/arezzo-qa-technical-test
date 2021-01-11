package run;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/_features",
    glue = "steps",
    plugin = {"json:target/cucumber.json"}
)
public class RunTest {

}
