package session14;

public class Test1 {

	public static void main(String[] args) {
		
		final B7 b = new B7();
		System.out.println(b);
		A5 a = new A5();
		a.enjoy(b);
		System.out.println(b);
		System.out.println(b.name);
		
		
		
		
		b.name = "tesyu";
		
		long l = System.currentTimeMillis();
		for(int i = 1 ;i <10000000 ;i++) {
			a.hello1("","");
		}
		System.out.println((System.currentTimeMillis()-l));


		long l1 = System.currentTimeMillis();
		for(int i = 1 ;i <10000000 ;i++) {
			a.hello2("","");
		}
		System.out.println((System.currentTimeMillis()-l1));
	}
}

class A5{
	public String hello1(final String i,final String j) {
		 String z = i+j;
		return z;
	}

	public String hello2( String i, String j) {
		 String z = i+j;
		return z;
	}
	
	public B7 enjoy( B7 b) {
		b.increaseAgeValuebyOne();
		b.name = "test";
		b = null;
	 return b;
	}
	
}

class B7{
	String name;
	int age;
	
	public void increaseAgeValuebyOne() {
		age++;
	}
	public void printInfo() {
		System.out.println("Name :  " + name);
		System.out.println("Age :  " + age);
	}

}

class J1{
	public String hello1(final String i,final String j) {
		 String z = i+j;
		return z;
	}

}

class J2 extends J1{
	public String hello1(String i, String j) {
		 String z = i+j;
		return z;
	}

}