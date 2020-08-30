package AutoIT;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFile {

	public static void main(String[] args) throws IOException {
	test1();
	}

	public static void test1() throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//Resize window
	driver.manage().window().setSize(new org.openqa.selenium.Dimension(600,800));
		
		driver.get("http://www.tinyupload.com/");
		driver.findElement(By.xpath("//*[@class=\"pole_plik\"]")).click();
		Runtime.getRuntime().exec("C:\\AutoIT Scripts\\FileUploadScript.exe");  //need to remember this..to get .exe file of our script
		
	}
}
