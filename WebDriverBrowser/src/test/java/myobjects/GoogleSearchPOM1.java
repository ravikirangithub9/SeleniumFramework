package myobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPOM1 {

	private static WebElement ele=null;  //Instead of creating each time in each function. We can define once in class level
	//private static WebElement ele; Both are same.. We give null just to save some memory

	public static WebElement textbox(WebDriver dri) {
	
		ele=dri.findElement(By.name( "q")); //WebElement ele= dri.findElement.... if we don't define as public
		return ele;
	}
	
	public static WebElement button(WebDriver dri) {
		
		ele=dri.findElement(By.name( "btnK"));
		return ele;
	}
}

