package TestNG;

import org.testng.annotations.Test;

public class TestNGDependencies
{


	@Test(dependsOnMethods = {"Test2"},priority = -1)
	public void Test1() {
		System.out.println("This is test1");
	}

	@Test 
	public void Test2() {
		System.out.println("This is test2");
	}

	@Test
	public void Test3() {
		System.out.println("This is test3");
	}

}
