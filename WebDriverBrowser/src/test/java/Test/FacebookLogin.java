package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import myobjects.FbLoginObjectsPOM2;


public class FacebookLogin {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();  //New Chrome Browser launches.and We created reference variable of type WebDrier.can call it as object

		FbLoginObjectsPOM2 obj= new FbLoginObjectsPOM2(driver);  //passing arguments for constructor

		driver.get("https://www.google.com/"); //http is mandatory
		driver.manage().window().maximize();

		driver.findElement(By.name("q")).sendKeys("facebook login");
		Thread.sleep(500);
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		driver.findElement(By.xpath("//h3[contains(text(),'Facebook - Log In or Sign Up')]")).click();   //Linktext & partial LinkText are not working
		
		
		//POM2
		obj.firstName("Ravikiran");
		obj.lastName("lastname");
		obj.regEmail("1234567890");
		obj.Password("1234567890");

		Select a=new Select(driver.findElement(By.id("day")));  //Select is a class. We need to create a object.
		a.selectByValue("3");
		Select b= new Select(driver.findElement(By.id("month")));    
		b.selectByIndex(5);
		Select c =new Select(driver.findElement(By.id("year")));
		c.selectByVisibleText("1994");

		driver.findElement(By.xpath("//*[@id=\"u_0_5\"]")).click(); //Id available but sometimes not working
		driver.findElement(By.name("websubmit")).click();	
		//driver.findElement(By.name("websubmit")).submit();	////both are same .but sometime click wont work
		Thread.sleep(5000);
		driver.close();
		//driver.quit();
		System.out.println("working as expected");
	}
}
