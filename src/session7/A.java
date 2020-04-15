package session7;

public class A {
	
	/**
	 * hello this is a method.lets check in java doc
	 */
	public void amethod() {
		
	}
	
	static {
		Human.country = "India";
	}
	
	{
		System.out.println("instance block of A");	
	}
	public static void main(String[] args) {
		Human.walk("XYZ");
		

//	Human h1 = new Human();
//	h1.name = "Ankit";
//	h1.talk("Hey Guys");
//	Human.walk(h1.name);
		
		/*
		 * this is multiline
		 */
		
		
		Human h2 = new Human();
		h2.name = "pooja";
		
		
		h2.talk(" Hello there");
		Human.walk(h2.name);
		
		Human h3 = new Human();
		h3.name = "Deepak";
		h3.talk(" Good morning!");
		h2.talk("Come for ludo..");
		Human.walk(h3.name);
		
		
	}
	
	
}

class Human{
	
	String name;  // inside class and outside methods ,instance variable
	int age;      // inside class and outside methods ,instance variable
	static String country; // inside class and outside methods, class variables
	
	int j = i+20;
	static int i = 10;
	
	static{
		System.out.println("hello i am static block");
	}
	
	{
		System.out.println("Hello i am instance block");	
	}
	
	public static void walk(String name) {
		System.out.println(name + " is walking in " + country);
	}
	
	/**
	 * this is documentation comment. lets start commenting
	 * @param content
	 */
	public void talk(String content) {
		System.out.println(name + " saying that " + content);
	}
	
}






