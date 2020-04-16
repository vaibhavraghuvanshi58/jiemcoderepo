package session7;

public class B {

	public static void main(String[] args) {
		C c1 = new C(10);
		c1.C();
		c1.C();
		c1.C();
		c1.C();

	}

}

class C{
	static int j;
	C(int i){
		j = i;
	}

	public static void C() {
		System.out.println("value is "+j);
	}
}
