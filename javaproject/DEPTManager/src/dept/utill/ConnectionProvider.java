package dept.utill;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {

	// Connection 객체를 생성해서 제공해주는 메소드

	public static Connection getConnection() throws SQLException {
		String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";

		Connection conn = null;

		conn = DriverManager.getConnection(dbUrl, "scott", "tiger");

		return conn;
	}
}
