package Java;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch3 {

	public static void main(String[] args) {
GoogleSearch3 a=new GoogleSearch3();
		a.googleSearch();
		
	}

	public void googleSearch(){  //method starts with lowercase and then uppercase from 2nd word
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

/*
Static methods can call directly.. Non Static methods we should by creating objects
public class MyClass {
	  // Static method
	  static void myStaticMethod() {
	    System.out.println("Static methods can be called without creating objects");
	  }

	  // Public method
	  public void myPublicMethod() {
	    System.out.println("Public methods must be called by creating objects");
	  }

	  // Main method
	  public static void main(String[] args) {
	    myStaticMethod(); // Call the static method
	    // myPublicMethod(); This would compile an error

	    MyClass myObj = new MyClass(); // Create an object of MyClass
	    myObj.myPublicMethod(); // Call the public method on the object
	  }
	}

*/