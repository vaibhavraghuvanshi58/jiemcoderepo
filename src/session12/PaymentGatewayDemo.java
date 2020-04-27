package session12;

public class PaymentGatewayDemo {
	public static void main(String[] args) {
		String bankName = "HSBC";

		CCAvenue obj = null;

		switch(bankName) {
		case "HSBC" : obj = new HSBC();break;
		case "ICICI" : obj = new HSBC();break;
		case "PNB" : obj = new HSBC();break;
		default: obj = null;break;
		}

		int i = obj.perCallRate();
		System.out.println(i);
		obj.offer();
	}
}

class CCAvenue{
	public int perCallRate() {
		return 0;
	}
	public int offer() {
		return 0;
	}
}


class HSBC extends CCAvenue{
	public int perCallRate() {
		return 2;
	}
}

class ICICI  extends CCAvenue{
	public int perCallRate() {
		return 1;
	}
}

class PNB  extends CCAvenue{
	public int perCallRate() {
		return 3;
	}
}

