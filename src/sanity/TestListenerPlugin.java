package sanity;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListenerPlugin implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("I am in testStart Listener");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("I am in onTestSuccess Listener");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("I am in onTestFailure Listener");
		System.out.println(result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("I am in onTestSkipped Listener");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	
}	
