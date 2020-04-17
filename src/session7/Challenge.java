package session7;

public class Challenge {
	public static void main(String[] args) {
		Task t1 = Task.createInstance();
		t1.taskMethod();
		
		int h = t1.sum(10, 20);
		System.out.println(h);
		
		Task.t1.taskMethod();
		
	}
}
/* 
 	If constructor is private, then how can
	i call non-static methods of that class
	
	hint -  you can create static method
*/

class Task{
	
	int i = 10;
	static Task t1 = new Task();
	
	
	// Constructor is private
	private Task(){
		
	}
	
	public void taskMethod() {
		System.out.println("Hello");
	}
	
	public static Task createInstance() {
		Task t = new Task();
		return t;
	}
	
	public int sum(int i, int j) {
		int k = i+j;
		return k;
	}
	
}