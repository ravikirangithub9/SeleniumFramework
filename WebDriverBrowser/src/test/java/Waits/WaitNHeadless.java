package Waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitNHeadless{
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		//Headless Chrome--Browser won't open
		ChromeOptions options= new ChromeOptions();
		options.addArguments("headless");
		
		WebDriver driver=new ChromeDriver(options);



		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); //Implicit wait like sleep

		//Explicit wait
		WebDriverWait wait =new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("name")));


		//Fluent Wait
		//Waiting 30 seconds for an element to be present on the page, checking
		// for its presence once every 5 seconds.
		/*
 Wait wait = new FluentWait<WebDriver>(driver)
	       .withTimeout(30, TimeUnit.SECONDS)
	       .pollingEvery(5, TimeUnit.SECONDS)
	       .ignoring(NoSuchElementException.class);

	   WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
	     public WebElement apply(WebDriver driver) {
	       return driver.findElement(By.id("foo"));

	     }
	   });  */
	}
}


