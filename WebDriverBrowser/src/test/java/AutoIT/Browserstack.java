package AutoIT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class  Browserstack {


	public static final String AUTOMATE_USERNAME = "ravikiran53";   //my browserstack username
	public static final String AUTOMATE_ACCESS_KEY = "hmu4eAakrPYff6qewdya";  //my access key
	public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";


	public static void main(String[] args) throws Exception {
		
		//desired capablities of what we need to test
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("os_version", "11");
		caps.setCapability("device", "iPhone 8 Plus");
		caps.setCapability("real_mobile", "true");
		caps.setCapability("build", "1");
		caps.setCapability("name", "Test1");
		caps.setCapability("browserstack.local", "false");
		caps.setCapability("browserstack.debug", "true");
		caps.setCapability("deviceOrientation", "landscape");
		

		
		WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps); //take url--change to java.net.url
		driver.get("https://www.google.com");
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("BrowserStack");
		element.submit();   //clicking on enter...try once
		System.out.println(driver.getTitle());
		driver.quit();
	}

}


