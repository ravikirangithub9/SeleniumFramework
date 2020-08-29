package myobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;// Webdriver is a interface(collection of abstract methods) in Selenium WebDriver which is a API


public class FbLoginObjectsPOM2 {

	WebDriver driver=null;

	
 
	public FbLoginObjectsPOM2(WebDriver driver) { //we can also give other name like driver1
	
		this.driver=driver;   //then this.driver=driver1
	
	}

	By fb_firstname= By.xpath("//*[@name='firstname']");
	By fb_lastname=  By.name("lastname");
	By fb_email=By.name("reg_email__");
	By fb_password=By.id("password_step_input");



	public void firstName(String text) {

		driver.findElement(fb_firstname).sendKeys(text); //created custom xpath
		
	}


	public void lastName(String text){
	driver.findElement(fb_lastname).sendKeys(text);
		}


	public void regEmail(String text) {

		driver.findElement(fb_email).sendKeys(text);
		}
	public void Password(String text) {
		driver.findElement(fb_password).sendKeys(text);
		
	}

}	

