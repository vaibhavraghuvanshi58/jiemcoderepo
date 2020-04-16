package session7;

public class Challenge {
	public static void main(String[] args) {
		
	}
}
/* 
 	If constructor is private, then how can
	i call non-static methods of that class
	
	hint -  you can create static method
*/

class Task{
	
	// Constructor is private
	private Task(){
		
	}
	
	public void taskMethod() {
		System.out.println("Hello");
	}
	
}