package exceptionhandling;


public class CompileTimeExceptionDemo {
	public static void main(String[] args) {
		
		
		M1 m1 = new M1();
		try {
			m1.method1(null);
		}catch(Exception e) {
			
		}
	}
}

// How to create compile time exception

class M1{
	public void method1(String s) throws Exception{
		s.toUpperCase();
	}
}


// own Exception
