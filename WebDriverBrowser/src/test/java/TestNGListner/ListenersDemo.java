package TestNGListner;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNGListner.TestNGListners.class) //we can remove here once we convert this .xml(there in class it automatically comes
public class ListenersDemo {

	@Test(priority = 3)
	public void test1() {
		System.out.println("This is test1");	
	}

	@Test(priority = 3)
	public void est2() {
		System.out.println("This is test2");	

	}
	@Test
	public void test3() {
		System.out.println("This is test3");	

	}

}
