package session14;

public class StaticVariableDemo {
	public static void main(String[] args) {
		P1 p = new P3();
		p.common();
	}
}

class P1{
	public static  void common() {
		System.out.println("p1.common");
	}
}

class P2 extends P1{
	public static void common() {
		System.out.println("p2.common");
	}
}

class P3 extends P2{
	
}
