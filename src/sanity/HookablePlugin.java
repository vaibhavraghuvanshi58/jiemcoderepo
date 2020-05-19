package sanity;

import org.testng.IHookCallBack;
import org.testng.IHookable;
import org.testng.ITestResult;

public class HookablePlugin implements IHookable{

	@Override
	public void run(IHookCallBack callBack, ITestResult testResult) {
		System.out.println("Hookable inteface");
		
	}
	
}
