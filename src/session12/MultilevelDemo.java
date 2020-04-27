package session12;

public class MultilevelDemo {

}

class N1{
	public void n1() {

	}
}

class N2 extends N1{
	public void n1() {

	}
}

class N3 extends N2{

}

class N4 extends N3{
	public void n2() {
		super.n1();
	}
}
