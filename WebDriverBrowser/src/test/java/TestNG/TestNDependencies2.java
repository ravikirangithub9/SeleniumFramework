package TestNG;

import org.testng.annotations.Test;


/*
public class TestNDependencies2 {


	@Test(dependsOnGroups = {"sanity1"} ) //used unique name,because same name is used in other class
	public void Test1() {
		System.out.println("This is test1");
	}

	@Test(groups= {"sanity1","Regression"}) 
	public void Test2() {
		System.out.println("This is test2");
	}

	@Test(groups= {"sanity1","Regression"}) 
	public void Test3() {
		System.out.println("This is test3");
	}
	@Test(priority = -1)
	public void Test4() {
		System.out.println("This is test3");
	}
}
*/

public class TestNDependencies2 {


	@Test(dependsOnGroups = {"sanity1.*"}) //used unique name,because same name is used in other class
	public void Test1() {
		System.out.println("This is test1");
	}

	@Test(groups= {"sanity1"}) 
	public void Test2() {
		System.out.println("This is test2");
	}

	@Test(groups= {"sanity1"}) 
	public void Test3() {
		System.out.println("This is test3");
	}
	@Test
	public void Test4() {
		System.out.println("This is test4");
	}
}
