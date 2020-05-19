package sanity;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class MethodListenerPlugin implements IInvokedMethodListener{

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		System.out.println("before invcation " + method.getTestMethod().getMethodName());
		
	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		System.out.println("after invcation " + method.getTestMethod().getMethodName());
	}

}
