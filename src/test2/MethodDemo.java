package test2;

public class MethodDemo {
	public static void main(String[] args) {
		// how to create object
		int i = 10;
		A obj = new A();
		obj.add();

		B obj2 = new B();
		obj2.add();
		Kitchen kit = new Kitchen();
		int k = kit.add(10, 20);
		System.out.println();
		
	}	
}

class A{
	public void add() {
		System.out.println("Hello there.");
	}



}

class Kitchen{
	// method always contain paranthesis after name , and we can give some params 
	String cooking(){
		return "panner";  
	}

	int add1(int i, int j){
		int k = i + j;
		return k ;
	}
	
	int add(int i, int j){
		int k = i + j;
		return k ;
	}

}

class B{
	public void add() {
		System.out.println("Hello there. i am in B");
	}


}

