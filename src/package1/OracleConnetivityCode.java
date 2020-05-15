package package1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class OracleConnetivityCode {
	public static void main(String[] args) {

		Connection conn = null;
		try {

			// creating connection
			String connectionString =
					"Server=myServerAddress;Database=myDataBase;Uid=myUsername;Pwd=myPassword;Encrypt=true";
			conn = DriverManager.getConnection(connectionString);

			// Craete stetement
			//Statement stmt = conn.createStatement();

			String query ="insert into xyz (name, age, address) values(?,?,?)";

			PreparedStatement stmt = conn.prepareStatement(query);
			
			
			for(int i = 1; i < 100000 ; i++) {
				stmt.setString(1, "name"+i);
				stmt.setInt(2, 1);
				stmt.setString(3, "address"+i);
				
				stmt.execute();
				
			}
			// DML - insert, update and delete, Select 
			// DDL - create , drop alter truncate
			// DCL - grant

			ResultSet rs = stmt.executeQuery(query); // select
			//			stmt.execute(query); //  insert 
			//			stmt.executeUpdate(query); 
			//			// update

			while(rs.next()) {
				String name = rs.getString("name");

			}


		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(conn != null) {
				try {
					conn.close();
				}catch(Exception e) {

				}
			}
		}


	}
}
