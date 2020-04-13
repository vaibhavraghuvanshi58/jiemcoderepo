package test;

public class OperatorDemo {
	public static void main(String[] args) {
		// Ternary Operator(?:)
		int age = 19;

		String isAllowed1 = age < 18 ? "NO" : "YES";
//		System.out.println(isAllowed1);
		
		
		//		String isAllowed = "";
		//		if(age < 18) {
		//			isAllowed = "NO";
		//		}else {
		//			isAllowed = "YES";
		//		}

		
		// Arithmatic
		// + - * / %
		float i = 10;
		float j = 7;
		float k = i%j;
//		System.out.println(k);

		
		// ++ , -- 
		// postincrement i++ , i-- (first assign then increase)
		// preincrement ++i , --i (first increase then assign)
		int x = 10;
		int m = x++ + x++ + x++;
		   //  10   + 11 + 12
	       //x = 11 , 12 , 13
		System.out.println(m);
		System.out.println(x);
		

	}
}
