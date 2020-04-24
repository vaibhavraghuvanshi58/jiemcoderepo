package session12;

public class MultipleInheritanceDemo {
	
}

class H1{
	public void hello() {
		System.out.println("hello i am H1");
	}
}

class L1 extends H1{
	public void hello1() {
		System.out.println("hello i am L1");
	}
}


class H2 extends L1{
	
}
