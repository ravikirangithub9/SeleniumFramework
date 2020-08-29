package Java;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserCheck {  //Class name and Java file name should be same and should Start with uppercase
	public static void main(String[] args) {

		WebDriverManager.chromedriver().browserVersion("2.36").setup();

		WebDriver a= new ChromeDriver(); //creating variable of type WebDrier. New is a keyword.
		a.get("https://www.google.com/");

		a.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("Janasena Theme song");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		a.close();
	}
}

/*
 
1)Class: It is a collection of variables and methods(main method and user defined methods).only the code inside clsass will execute.
***Variables fields and attributes all are same. (Local and Global variables.. Inside and outside methods
method and function are same.
2)method is a block of code which only runs when it is called.(either directly or by using objects)
You can pass data, known as parameters, into a method.
Methods are used to perform certain actions, and they are also known as functions.
Why use methods? To reuse code: define the code once, and use it many times.
A method must be declared within a class.Should start with lowercase

3)Object:In Java, an object is created from a class using a new keyword which initiates new object
use:We call/access variables/Non static methods by creating objects and then using '.'
. is used to access varibales and non static methods
##We should create object in main method only.

public class MyClass {
	  int x = 5;

	  public static void main(String[] args) {
	    MyClass myObj = new MyClass();
	    System.out.println(myObj.x);
	  }
	}



If you don't want the ability to override existing values, declare the attribute as final:

Example
public class MyClass {
  final int x = 10;

  public static void main(String[] args) {
    MyClass myObj = new MyClass();
    myObj.x = 25; // will generate an error: cannot assign a value to a final variable
    System.out.println(myObj.x);
  }
}
*/