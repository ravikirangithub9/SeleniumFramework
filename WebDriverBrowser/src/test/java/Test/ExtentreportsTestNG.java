package Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
/*
public class ExtentreportsTestNG {

	ExtentReporter htmlReporter;
	ExtentReports extent;
	
	@BeforeTest
	public void setUpTest() {
		htmlReporter = new ExtentHtmlReporter("extent.html");

		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

	}
	@Test 
	public void Test() {
		 ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
	        // log(Status, details)
	        test.log(Status.INFO, "This step shows usage of log(status, details)");

	        // info(details)
	        test.info("This step shows usage of info(details)");
	        
	        // log with snapshot
	        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
	        
	        // test with snapshot
	        test.addScreenCaptureFromPath("screenshot.png");
	        
	       
	}

	@AfterTest
	public void tearDownTest() {
		 // calling flush writes everything to the log file
        extent.flush();
	}
}
*/