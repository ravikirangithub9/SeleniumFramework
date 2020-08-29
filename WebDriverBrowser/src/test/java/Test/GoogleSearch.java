package Test;

import myobjects.*;

import org.openqa.selenium.By;
//import myobjects.BrowserFirst;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().browserVersion("2.36").setup();


		WebDriver dri= new ChromeDriver(); //It initiates new chrome browser
		dri.get("http://www.google.com/"); //If we don't give http, it will throw error(invalid argument)
		dri.manage().window().maximize();
		GoogleSearchPOM1.textbox(dri).sendKeys("Janasena Foundation Day");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//dri.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		GoogleSearchPOM1.button(dri).sendKeys(Keys.RETURN);

		//a.findElement(By.name("btnk")).click();

		dri.findElement(By.partialLinkText("Jana Sena Party")).click();;
		System.out.println(dri.findElements(By.tagName("img")).size());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dri.navigate().back();	
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dri.navigate().forward();
		dri.navigate().refresh();
		dri.close();
		System.out.println("Success ayindi jaffa");
	}
}

