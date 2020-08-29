package TestNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


//@Ignore   //class level Ignore..None of the methods/tests will run
@Test(groups= {"All test"})  //class level grouping
public class TestNGIgnore {


	@Test
	public void Test1() {
		System.out.println("This is test1");
	}

	@Ignore  //Test level Ignore
	@Test
	public void Test2() {
		System.out.println("This is test2");
	}

	@Test
	public void Test3() {
		System.out.println("This is test3");
	}
	@Test
	public void Test4() {
		System.out.println("This is test3");
	}
}
