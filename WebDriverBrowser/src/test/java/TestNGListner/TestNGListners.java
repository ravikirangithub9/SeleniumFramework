package TestNGListner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListners implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("********* Test started now: "+result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("********* Test is success: "+result.getName()+"\n");
	
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("********* Test is failed: "+result.getName()+"\n");


	}

	public void onTestSkipped(ITestResult result) {
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	public void onTestFailedWithTimeout(ITestResult result) {
	}

	public void onStart(ITestContext context) {
	}

	public void onFinish(ITestContext context) {
		System.out.println("********* Test is finished: "+context.getName());

	} 	

}
