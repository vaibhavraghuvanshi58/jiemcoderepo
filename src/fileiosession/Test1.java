package fileiosession;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test1 extends Parent{
	
	public void test1() {
	
	}
	
	public static void main(String[] args) {
		// Write a file
		
		try {
		
			FileWriter fw = 
					new FileWriter("C:\\Users\\Vaibhav\\Desktop\\Training\\Corp\\files\\test.txt", true);
			fw.write("second line\r\n");
			fw.close();
			
			
			FileReader fr = new FileReader(new File("C:\\Users\\Vaibhav\\Desktop\\Training\\Corp\\files\\test.txt"));
			BufferedReader br = new BufferedReader(fr);
			String temp = null;
			while( (temp=br.readLine()) != null) {
				System.out.println(temp);	
			}
			
			 br.close();
			 fr.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
