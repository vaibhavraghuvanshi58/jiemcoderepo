package exceptionhandling;

public class CalculatorDemo {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		try {
			int i = c1.devide(10, 0);
			
			String hj = "";
			hj.substring(18);
			System.out.println(i);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("expected because my devident is 0");
		}
	}	

}




class Calculator{

	public int devide(int i , int j)throws Exception {
		return i/j;
	}

}