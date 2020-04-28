package session14;

public class ConstructorChainingDemo {
	public static void main(String[] args) {
		C c1 = new C();
	}
}

class A{
	A(){
		System.out.println("a class constructor");
	}
	A(int i){
		System.out.println("a class constructor with "+i);
	}
	public void a1() {

	}
}

class B extends A{
	
	B(int i ){
		System.out.println();
	}
}

class C extends B{
	 C(){
		 super(10);
		 System.out.println("c class constructor");
	}

	 

}
