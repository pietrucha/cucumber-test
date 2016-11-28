package pietruh.test.features.google;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java8.En;

public class StepDefinitions implements En {

   private WebDriver driver = null;

   public StepDefinitions() {
      Given("^I on to google\\.speedtest website$", () -> {
         System.setProperty("webdriver.gecko.driver",
               "C:/Users/ppietrucha/Programy/geckodriver-v0.11.1-win64/geckodriver.exe");
         System.setProperty("webdriver.chrome.driver",
               "C:/Users/ppietrucha/Programy/chromedriver_win32/chromedriver.exe");

         driver = new ChromeDriver();
         driver.navigate().to(
               "https://developers.google.com/speed/pagespeed/?hl=pl-PL&utm_source=PSI&utm_medium=incoming-link&utm_campaign=PSI");
      });

      When("^I click on Use PageSpeed Insights link$", () -> {
         driver.findElement(By.id("use-pagespeed-insights")).click();
      });

      When("^Populate tristar\\.gdynia\\.pl page to test$", () -> {
         driver.findElement(By.tagName("input").name("url"))
               .sendKeys("https://tristar.gdynia.pl/pages/public/detailed_map.xhtml");
         driver.findElement(By.cssSelector(".button.button-red.analyze.jfk-button.main-submit")).click();
      });

      Then("^I validate the outcomes$", () -> {
         WebDriverWait webDriverWait = new WebDriverWait(driver, 15);
         Assert.assertNotNull(webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".pagespeed-results"))));
      });
   }
}
