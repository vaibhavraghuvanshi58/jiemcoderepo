package sanity;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamDemo {


	@Parameters("browser")
	@Test
	public void paramTest(String browser){
		if(browser.equals("chrome")){
			System.out.println("testcase running on " + browser );
		}
		if(browser.equals("firefox")){
			System.out.println("testcase running on " + browser );
		}
		if(browser.equals("ie")){
			System.out.println("testcase running on " + browser );
		}
	}
}
