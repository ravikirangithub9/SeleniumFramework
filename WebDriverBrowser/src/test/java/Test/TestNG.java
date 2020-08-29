  package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG {

	WebDriver driver;
	@BeforeTest
	public void setUPTest(){

		WebDriverManager.chromedriver().setup(); //setting up the browser
		driver= new ChromeDriver();  //New Chrome Browser launches.and We created reference variable of type WebDrier.can call it as object
		
	}

	@Test

	public void fbLogin() throws InterruptedException{
		
		
		driver.get("https://www.google.com/"); //http is mandatory
		driver.manage().window().maximize();

		driver.findElement(By.name("q")).sendKeys("facebook login");
			Thread.sleep(1000);
		
		
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		driver.findElement(By.xpath("//h3[contains(text(),'Facebook - Log In or Sign Up')]")).click();  //way of writing xpath for links using methods
		Thread.sleep(1000);
		driver.findElement(By.name("//*[@id='email' and @name='email']")).sendKeys("Ravikiarn");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@*='firstname']")).sendKeys("Ravikiran");
		driver.findElement(By.name("lastname")).sendKeys("lastname");
		driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
		driver.findElement(By.id("password_step_input")).sendKeys("12345678");


		Select a=new Select(driver.findElement(By.id("day")));  //Select is a class. We need to create a object.
		a.selectByValue("3");
		Select b= new Select(driver.findElement(By.id("month")));    
		b.selectByIndex(5);
		Select c =new Select(driver.findElement(By.id("year")));
		c.selectByVisibleText("1994");

		driver.findElement(By.id("u_0_7")).click();
		driver.findElement(By.name("websubmit")).click();	
		//driver.findElement(By.name("websubmit")).submit();	////both are same .but sometime click wont work
		Thread.sleep(3000);
		
	}
	@AfterTest
	public void tearDownTest(){
		driver.close();
		//driver.quit();
		System.out.println("working as expected");
	}


}