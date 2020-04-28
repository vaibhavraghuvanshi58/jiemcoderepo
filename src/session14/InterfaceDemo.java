package session14;

public class InterfaceDemo {

}

interface i1 extends i2{
	
	int i = 10;
	
	public void a1();
	public void a2();
}


interface i2 {
	public void b1();
	public void b2();
}

class G1 implements i1{

	@Override
	public void b1() {
		// TODO Auto-generated method stub
		System.out.println(i1.i);
	}

	@Override
	public void b2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void a1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void a2() {
		// TODO Auto-generated method stub
		
	}
	
}