package exceptionhandling;

public class OwnExceptionDemo {
	public static void main(String[] args) {
		Demo1 d1 = new Demo1();
		try {
			d1.checkTime(8);
		} catch (WontBeAvailablePost7Exception e) {
			e.printStackTrace();
		}
	}
}

class Demo1{
	public void checkTime(int time) {
		
			if(time > 7) {
				throw new WontBeAvailablePost7Exception("beacuse time is " + time);
			}else {
				System.out.println("Happy to join this class");
			}
		
	}
}

class WontBeAvailablePost7Exception extends RuntimeException{
	String msg;
	WontBeAvailablePost7Exception(String msg){
		this.msg = msg;
	}

	@Override
	public String getMessage() {
		return this.msg;
	}
	
	
}