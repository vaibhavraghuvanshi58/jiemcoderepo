package solutionpack;

public class CallByValueDemo {
	public static void main(String[] args) {
		H h1 = new H(10);
		increaseValue(h1);
		System.out.println(h1.i);
	}
	
	
	public  static void increaseValue(H h1) {
		h1.i = h1.i +1;
	}
}

class H{
	int i;
	
	H(int i){
		this.i = i;
	}
}
