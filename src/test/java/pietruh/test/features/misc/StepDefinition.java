package pietruh.test.features.misc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java8.En;
import junit.framework.Assert;

public class StepDefinition implements En {
   private WebDriver driver;

   public StepDefinition() {
      Given("^^I am on main page$", () -> {
         driver.navigate().to("https://tristar.gdynia.pl");
      });

      And("^I close browser$", () -> {
      });

      When("^I click on ([^\"]*)$", (String link) -> {
         List<WebElement> findElements = driver.findElements(By.cssSelector(".commandLink"));
         findElements.stream().filter(we -> we.getText().equals(link.toUpperCase())).findFirst().ifPresent(we -> {
            we.click();
         });

      });
      Then("^I chceck I am on ([^\"]*)$", 100, (String url) -> {
         Assert.assertEquals(url, driver.getCurrentUrl());
      });

      Before(new String[] { "@webFirefox" }, () -> {
         System.setProperty("webdriver.gecko.driver",
               "C:/Users/ppietrucha/Programy/geckodriver-v0.11.1-win64/geckodriver.exe");
         driver = new FirefoxDriver();
      });

      Before(new String[] { "@webChrome" }, () -> {
         System.setProperty("webdriver.chrome.driver",
               "C:/Users/ppietrucha/Programy/chromedriver_win32/chromedriver.exe");
         driver = new ChromeDriver();
      });

      After(() -> {
         driver.close();
      });
   }
}
