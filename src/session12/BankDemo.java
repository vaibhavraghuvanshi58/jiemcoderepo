package session12;

public class BankDemo {
	public static void main(String[] args) {
		
		
		
		HDFC h1 = new HDFC(); // has a relation
		// BankDemo HAS-A HDFC Obect
		
		int rate = h1.interestRate();
		System.out.println(rate);
	}
}



class Bank{
	String bankName;

	public int interestRate() {
		return 0;
	}
}
// IS-A Relationship
// IndianBank IS-A Bank
class IndianBank extends Bank{
	public void method5() {
		System.out.println("method2");
	}
}

class HDFC extends IndianBank{
	public int interestRate() {
		return 5;
	}


	public void method2() {
		System.out.println("method2");
	}
}


