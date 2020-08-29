package Java;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch2 { //class is a keyword to create class

	public static void main(String[] args) {
		googleSearch(); //if we don't give static in method.. we need to create object and call.check Google Search3
		//Static method we call directly withput creating object
		
	}

	public static void googleSearch(){  //method starts with lowercase and then uppercase from 2nd word
		WebDriverManager.chromedriver().browserVersion("2.36").setup();

		WebDriver a= new ChromeDriver();
		a.get("https://www.google.com/");

		//a.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("Janasena Theme song");
		a.findElement(By.name("q")).sendKeys("Janasena Foundation Day");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			a.findElement(By.name("btnK")).sendKeys(Keys.RETURN);

			//a.findElement(By.name("btnk")).click();


		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		a.close();
		System.out.println("Success ayindi jaffa");
	}
}
