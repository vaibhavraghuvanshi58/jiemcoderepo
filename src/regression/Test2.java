package regression;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void login2(){
		System.setProperty("webdriver.chrome.driver", "C:\\PorgramData\\workspace10\\testngdemo\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Vaibhav/Desktop/Training/Corp/site/test1.html");
		
		StringBuffer strbuf = new StringBuffer();
		try{
			FileReader fr = new FileReader(new File("C:\\Users\\Vaibhav\\Desktop\\Training\\Corp\\site\\data.txt"));
			BufferedReader br = new BufferedReader(fr);
			String temp = "";
			while((temp = br.readLine()) != null){
				strbuf.append(temp);
			}
			br.close();
			fr.close();
		}catch(Exception e){
			
		}
		
		driver.findElement(By.id("txt")).sendKeys(strbuf.toString());
		//driver.close();
	}
	
}
