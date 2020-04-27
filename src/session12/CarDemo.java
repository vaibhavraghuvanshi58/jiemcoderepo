package session12;

public class CarDemo {
	public static void main(String[] args) {
		Maruti c1 = new Maruti();
		// abstract class cannot be instantiate // abstract class doesnt provide HAS A Relationship
		System.out.println(c1.maxSpeed());
		System.out.println(c1.parentMaxSpeed());
	}
}


abstract class Abs{
	
	public int i;
	
	public abstract String s1();
	public abstract String s2();
}

interface Abs1{
	public String s1();
	public String s2();
}
interface Abs2{
	public String s1();
	public String s3();
}

class G implements Abs1,Abs2{

	@Override
	public String s1() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String s2() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String s3() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}

abstract class Car{
	public abstract String tyresType();
		
	
	
	public int maxSpeed() {
		return 0;
	}
	
	public int offer() {
		return 20;
	}
	
}

class Maruti extends Car{
	
	public String tyresType(){
		return "JK Tyre";
	}
	
	public int maxSpeed() {
		return 150;
	}
	
	public int offer() {
		return super.offer()+10;
	}
	
	public int parentMaxSpeed() {
		return super.maxSpeed();
	}
	
	
}

class Audi extends Car{

	@Override
	public String tyresType() {
		return "MRF";
	}

	@Override
	public int maxSpeed() {
		return 250;
	}
	
	
	
}

class TATA extends Car{
	public String tyresType(){
		return "Goodyear";
	}
	public int maxSpeed() {
		return 200;
	}
}