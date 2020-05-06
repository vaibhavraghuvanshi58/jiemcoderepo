package exceptionhandling;

public class ExceptionHandlingDemo {
	public static void main(String[] args) {
		devide(10,0);
		System.out.println("hello");
	} 

	public static void devide(int i , int j) {
		DBConnection b = new DBConnection();
		try {
			b.openConnection();
			System.out.println(i/j);
			
		}catch(Exception e) {
			System.out.println("Hello i am runtime exception");
		}finally {
			b.closeConnection();
		}
	}


}
class DBConnection{
	public void openConnection() {
		System.out.println("Connection Established");
	}
	public void closeConnection() {
		System.out.println("Connection Closed");
	}
}