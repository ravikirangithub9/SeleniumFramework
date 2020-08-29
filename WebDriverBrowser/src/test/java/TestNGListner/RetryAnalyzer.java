package TestNGListner;

	import org.testng.IRetryAnalyzer;
	import org.testng.ITestResult;
	 
	public class RetryAnalyzer implements IRetryAnalyzer {
	 
	  private int retryCount = 0;
	  private static final int maxRetryCount = 3; //we can give any number.. It run that many times.
	 
	  public boolean retry(ITestResult result) {
	    if (retryCount < maxRetryCount) {
	      retryCount++;
	      return true;
	    }
	    return false;
	  }
	}
