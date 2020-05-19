package sanity;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class TestSuitePlugin implements ISuiteListener {

	@Override
	public void onStart(ISuite suite) {
		System.out.println("Running my suite ->  "+suite.getName());
		
	}

	@Override
	public void onFinish(ISuite suite) {
		System.out.println("Finish my suite ->  "+suite.getName());
		
	}

}
