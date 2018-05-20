package TestNGClasses;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener{


	public void onFinish(ITestContext Result) {
		
		System.out.println("Test is complete");
	}

	public void onStart(ITestContext Result) {
		
		System.out.println("Test is Starting");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult Result) {
		
		System.out.println("Test has failed with success percent");
	}

	public void onTestFailure(ITestResult Result) {
		
		System.out.println("Test has failed");
	}

	public void onTestSkipped(ITestResult Result) {
		System.out.println("Test was skipped");
		
	}

	public void onTestStart(ITestResult Result) {
		System.out.println("Test is Started");
		
	}

	public void onTestSuccess(ITestResult Result) {
		
		System.out.println("Test completed with success");
	}
}
