package Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReports {


	public static void main(String[] args) {
	      
ExtentHtmlReporter htmlReporter= new ExtentHtmlReporter("reports.html");
// create ExtentReports and attach reporter(s)
ExtentReports extent = new ExtentReports();
extent.attachReporter(htmlReporter);
ExtentTest test = extent.createTest("MyFirstTest", "Sample description");

}

	private ExtentTest createTest(String string, String string2) {
		// TODO Auto-generated method stub
		return null;
	}

	private void attachReporter(ExtentHtmlReporter htmlReporter) {
		// TODO Auto-generated method stub
		
	}

}