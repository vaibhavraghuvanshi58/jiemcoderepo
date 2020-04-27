package session12;

public class SeleniumDemo {
	public static void main(String[] args) {

	}
}

class Broswer{
	public void click() {

	}
	public void write() {

	}

	public void validate() {

	}

}

class ChromeBrowser extends Broswer{
	public void click() {
		// chrome own click mechanism
	}
	public void write() {
		// chrome own write mechanism
	}
}

class MozillaBrowser extends Broswer{
	public void click() {
		// mozilla own click mechanism
	}
	public void write() {
		// mozilla own write mechanism
	}
}

class IEBrowser extends Broswer{
	public void click() {
		// IE own click mechanism
	}
	public void write() {
		// IE own write mechanism
	}
}

