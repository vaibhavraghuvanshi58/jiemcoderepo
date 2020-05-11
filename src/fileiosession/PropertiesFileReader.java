package fileiosession;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFileReader {
	public static void main(String[] args) {
		try {
			
			Properties prop = new Properties();
			InputStream stream = new FileInputStream
					(new File
							("C:\\Users\\Vaibhav\\git\\jiemcoderepo4\\files\\global.properties"));
			
			
			prop.load(stream);
			stream.close();
			
			String envToRun = prop.getProperty("env");

			Properties envProp = new Properties();
			InputStream stream1 = new FileInputStream
					(new File
							("C:\\Users\\Vaibhav\\git\\jiemcoderepo4\\files\\"+envToRun+".properties"));
			
			
			envProp.load(stream1);
			stream1.close();
			
			String urlToRun = envProp.getProperty("url");
			System.out.println(urlToRun);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
