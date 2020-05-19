package regression;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	@DataProvider(name="logincredsr")
	public static Object[][] datasheet(){
		Object[][] obj = new Object[10][2];
		for(int i = 0; i < 10 ; i++){
			obj[i][0] = "user"+i;
			obj[i][1] = "password"+i;
		}
		return obj;
	}
}
