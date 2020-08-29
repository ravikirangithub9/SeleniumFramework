package TestNG;

import org.testng.annotations.Test;


@Test(groups= {"All test"})  //class level grouping
public class TestNGrouping {


	@Test(groups= {"windows.sanity"})
	public void Test1() {
		System.out.println("This is test1");
	}

	@Test(groups= {"sanity","Regression"}) 
	public void Test2() {
		System.out.println("This is test2");
	}

	@Test(groups= {"sanity","Regression"}) 
	public void Test3() {
		System.out.println("This is test3");
	}
	@Test
	public void Test4() {
		System.out.println("This is test3");
	}
}
