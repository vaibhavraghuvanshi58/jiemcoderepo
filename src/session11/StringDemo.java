package session11;

public class StringDemo {
	public static void main(String[] args) {
		// String - array of char
		
		String st1 = "Abc"; // literal way // directly creating object in pool
		String st2 = "abc";
		String st3 = new String("abc");
		String st4 = new String("abc");
		
		System.out.println(st1 == st2);
		System.out.println(st1 == st3);
		System.out.println(st1 == st4);
		System.out.println(st4 == st3);
		
		System.out.println(st4.equals(st1));
		
		
		char[]  ch = {'a','b','c','d'};
		System.out.println(ch.length);
		
		
		String st5 = new String(ch);
		System.out.println(st5);
		
		String st = "hello this is test";
		String hj = "hello     ";
		// String has too many method
		System.out.println("hello this is test".length());
		System.out.println(st5.toUpperCase());
		System.out.println(st5.toLowerCase());
		System.out.println(hj.trim()+"<");
		System.out.println(st5.startsWith("ab"));
		System.out.println(st1.equalsIgnoreCase(st2));
		System.out.println(st1.indexOf('b'));
		System.out.println(st1.charAt(2));
		System.out.println(st1.substring(1));
		//hello,this,is,test
		String[] at = st.split(" ");
		for(int i = 0; i < at.length ;i++) {
			System.out.println(at[i]);
		}
		
		// 2
		
		// only 2
		
		
		// immutabale object
		
	}
	
	
}

class R{
	R(String r){
		
	}
	R(String[] r){
		
	}
}
