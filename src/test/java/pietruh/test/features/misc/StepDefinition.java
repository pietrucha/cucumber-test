package pietruh.test.features.misc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java8.En;

public class StepDefinition implements En {
   private WebDriver driver = null;

   public StepDefinition() {
      Given("^^I am on main page$", () -> {
         System.setProperty("webdriver.gecko.driver",
               "C:/Users/ppietrucha/Programy/geckodriver-v0.11.1-win64/geckodriver.exe");
         System.setProperty("webdriver.chrome.driver",
               "C:/Users/ppietrucha/Programy/chromedriver_win32/chromedriver.exe");

         driver = new ChromeDriver();
         driver.navigate().to("https://tristar.gdynia.pl");
      });
      
      And("^I close browser$", () -> {
        driver.close();
     });
   }
}
