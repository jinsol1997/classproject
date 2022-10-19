package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class DeleteTest {

	public static void main(String[] args) {
		
		
		try {
			
			String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection conn = DriverManager.getConnection(dbUrl, "scott", "tiger");
			
			if(conn != null) {
				System.out.println("데이터베이스 연결");
			}
			
			String sql = "delete from dept where deptno=?";

			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,  60);
			
			int result = pstmt.executeUpdate();
			
			if(result>0) {
				System.out.println("삭제되었습니다.");
			}
			
			pstmt.close();
			conn.close();
			
			// 4. ResultSet
			
			
			
		}  catch (SQLException e) {
			e.printStackTrace();
		}
		
		// 2. Connection 객체 생성
		// 3. Statement / PreparedStatement
		// 4. ResultSet
		
		
		
	}
}
