package Recording;

import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FbLogin {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	  WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
  }

  @Test
  public void testFbLogin() throws Exception {
    driver.get("https://www.google.com/");
    driver.findElement(By.name("q")).clear();
    driver.findElement(By.name("q")).sendKeys("facebook login");
    driver.findElement(By.xpath("//form[@id='tsf']/div[2]/div/div[2]/div[2]/ul/li/div/div[2]/div/span")).click();
    driver.findElement(By.xpath("//div[@id='tads']/div/ol/li/div/div/div/div/a/div/span")).click();
    driver.findElement(By.id("u_0_m")).click();
    driver.findElement(By.id("u_0_m")).clear();
    driver.findElement(By.id("u_0_m")).sendKeys("Ravi");
    driver.findElement(By.id("u_0_r")).clear();
    driver.findElement(By.id("u_0_r")).sendKeys("975336809906");
    driver.findElement(By.id("password_step_input")).click();
    driver.findElement(By.id("password_step_input")).clear();
    driver.findElement(By.id("password_step_input")).sendKeys("edygajzh");
    driver.findElement(By.xpath("//div[@id='content']/div")).click();
    driver.findElement(By.id("day")).click();
    new Select(driver.findElement(By.id("day"))).selectByVisibleText("16");
    driver.findElement(By.id("day")).click();
    driver.findElement(By.id("month")).click();
    new Select(driver.findElement(By.id("month"))).selectByIndex(7);
    driver.findElement(By.id("month")).click();
    driver.findElement(By.id("year")).click();
    new Select(driver.findElement(By.id("year"))).selectByVisibleText("2002");
    driver.findElement(By.id("year")).click();
    driver.findElement(By.xpath("//span[@id='u_0_z']/span[2]/label")).click();
    driver.findElement(By.id("u_0_13")).click();
    driver.findElement(By.id("u_0_o")).clear();
    driver.findElement(By.id("u_0_o")).sendKeys("jhazsdxjzs");
    driver.findElement(By.id("u_0_13")).click();
    driver.findElement(By.xpath("//div[@id='u_0_y']/div")).click();
    driver.close();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
