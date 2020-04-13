package package2;

public class Class2 {
	public void publicMethod() {
		System.out.println("i am public method");
	}
	private void privateMethod() {
		System.out.println("i am private method");
	}
	void defaultMethod() {
		privateMethod();
		System.out.println("i am default method");
	}
}
