package session7;

public class MethodOverloadingDemo {
	public static void main(String[] args) {
		Calculator calc  = new Calculator();
		int i = 10;
		long j = 20;
		System.out.println(calc.sum(i, j));
	}
}

class Calculator{
	
	// same method name, but different params, count or type
	
	public long sum(int i , int j) {
		System.out.println("int,int");
		return i+j;
	}
	
	public long sum(int i , long j) {
		System.out.println("int,long");
		return i+j;
	}
	
	public long sum(long i , int j) {
		System.out.println("long,int");
		return i+j;
	}
	
	public long sum(long i , long j) {
		System.out.println("long,long");
		return i+j;
	}
	
}
