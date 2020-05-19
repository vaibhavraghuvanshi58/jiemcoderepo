package sanity;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Listeners(ReporterPlugin.class)
public class Test1 {

	@BeforeTest
	public void setup(){
		System.out.println("Test1.@BeforeTest");
	}
	
	@AfterTest
	public void teardown(){
		System.out.println("Test1.@AfterTest");
	}
	
	@BeforeMethod
	public void beforemethod(){
		System.out.println("Test1.@BeforeMethod");
	}
	
	@AfterMethod
	public void aftermethod(){
		System.out.println("Test1.@AfterMethod");
	}
	
	@Parameters("browser")
	@Test(groups={"smoke"})
	public void login_functionality_test1(String browser){
		System.out.println("test1 " + browser);
	}
	@Test(groups={"sanity"},alwaysRun=true)
	public void login_functionality_test(){
		System.out.println("test1");
	}
	
	@Test(groups={"sanity"})
	public void register_functionality_test(){
		System.out.println("test1");
	}
	
	
	
}
