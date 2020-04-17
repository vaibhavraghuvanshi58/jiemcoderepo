package session7;



// Singleton Design Pattern
public class DBConnection {

	private static DBConnection obj = null;
	private DBConnection() {

	}

	public static DBConnection getInstance() {
		if(obj == null) {
			obj = new DBConnection();
			System.out.println("Connection created");
		}else {
			System.out.println("Object already created");
		}
		return obj;
	}

}

class ConnectionDemo {
	public static void main(String[] args) {
		DBConnection t1 = DBConnection.getInstance();
		DBConnection t2 =DBConnection.getInstance();
		DBConnection t3 =DBConnection.getInstance();
		DBConnection t4 =DBConnection.getInstance();
		DBConnection t5 =DBConnection.getInstance();

		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
		System.out.println(t5);
	}
}
