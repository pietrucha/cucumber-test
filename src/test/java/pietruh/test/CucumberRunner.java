package pietruh.test;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//@formatter:off
@RunWith(Cucumber.class)
@CucumberOptions(
   dryRun=false
   ,plugin = { "pretty", "json:target/cucumber.json","html:target/cucumber_report" }
   ,features = "src/test/java/"
)
//@formatter:on
public class CucumberRunner {
   public final static String now = LocalDateTime.now().toString();

   public CucumberRunner() {
      new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
   }
}
