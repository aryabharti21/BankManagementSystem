import java.sql.*;

public class Conn {

	Connection c;
	Statement s;

	public Conn() {

		// steps for JDBC connection
		// 1 Register the driver || 2 Create Connection || 3 Create Statement || 4
		// Execute Query || 5 Close Connection

		try {

			String url = "jdbc:mysql:///bankmanagementsystem";
			String username = "root";
			String password = "ab5631";
			c = DriverManager.getConnection(url, username, password);
			s = c.createStatement();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
