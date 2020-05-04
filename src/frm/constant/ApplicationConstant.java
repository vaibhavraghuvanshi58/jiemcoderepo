package frm.constant;

public class ApplicationConstant {
	
	public static final String basePath = System.getProperty("user.dir")+"\\";
	
	public static final String PROJECT_NAME = "Google Automation";
	public static final String CHROME_DRIVER_PATH = basePath+"driver\\chrome\\chromedriver.exe";
	public static final String IE_DRIVER_PATH = "";
	public static final String MOZILLA_DRIVER_PATH = "";
	
	public static final String browsername= "chrome";
	public static String ApplicationURL = "http://www.google.com";
	
	public static int implecitWait = 30;
	
	public static void main(String[] args) {
		System.out.println(CHROME_DRIVER_PATH);
	}
	
}
