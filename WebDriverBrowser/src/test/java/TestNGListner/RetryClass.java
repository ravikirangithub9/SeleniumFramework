package TestNGListner;

import org.testng.Assert;

public class RetryClass {
	
	@org.testng.annotations.Test(retryAnalyzer = RetryAnalyzer.class)
	public void Test() {
		System.out.println("This is for retry Analyzer");
		Assert.assertTrue(false);
	}

}
