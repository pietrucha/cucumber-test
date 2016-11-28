package pietruh.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//@formatter:off
@RunWith(Cucumber.class)
@CucumberOptions(
   dryRun=false
   ,plugin = { "pretty", "json:target/cucumber.json","html:target/cucumber.html" }
   ,features = "src/test/java/"
)
//@formatter:on
public class CucumberRunner {
}
