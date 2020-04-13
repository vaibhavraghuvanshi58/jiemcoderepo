package test;

public class KeywordDemo {
	public static void main(String[] args) {

		int i = 0X30; // number system - Decimal
		// if we add 0 then it became octal
		// if we add 0X then hexadecimal 
//		System.out.println(i);
		byte bt = 12_1;
		short s1 = 90;
		int j = 34_5;
		long lng = 237_3_2_4_7_8_2_73l;
//		System.out.println(lng);
//		System.out.println(bt);
		
		float ft = 647.8f; // 4 byte
		double db = 45.90d; // 8 byte
		
		char ch = 'g';
		// every char is a integer
		int ch1 = ch;
		System.out.println(ch1);
		
		int kl = 67; //4byte
		char asciichar = (char)kl; // 1 byte
		System.out.println(asciichar);
		
		boolean bool = true;
		boolean bool1 = false;
		
	}
	
}

// such language provide obfuscation
