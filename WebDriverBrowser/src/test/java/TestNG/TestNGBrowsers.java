package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGBrowsers {

	WebDriver driver=null;
	
	@BeforeTest  //It converts our method to testNG method
	@org.testng.annotations.Parameters("browserName") //defining parameters
	public void setUp(String browserName) {

			System.out.println("Browser name is: "+browserName);
			
			if(browserName.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver= new ChromeDriver();
			}
			
			
			else if (browserName.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
			}
			
		
	}
	
	@Test
	public void test() {

		driver.get("http://www.google.com/");
		driver.manage().window().maximize();
	}
	
	@AfterTest
	public void tearDown() {
	driver.close();
	driver.quit();
	}
	
}

