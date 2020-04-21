package solutionpack;

public class A {
	int x;// instance
	static int y; // static
	int[] z; //instance
	
	public void hello() {
		int a ; // local (we must declear it before using it)
//		System.out.println(a);
		System.out.println(x);
		int x = 10;
		int u = x++ + ++x;
		
		System.out.println(y);
		z = new int[2];
		System.out.println(z[1]);
		
		System.out.println(z[2]);
				
	}
	public static void main(String[] args) {
		A a1 = new A();
		a1.hello();
	}
}
