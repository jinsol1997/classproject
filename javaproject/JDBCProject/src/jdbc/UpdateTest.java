package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class UpdateTest {

	public static void main(String[] args) {
		
		
		try {
			
			String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection conn = DriverManager.getConnection(dbUrl, "scott", "tiger");
			
			if(conn != null) {
				System.out.println("데이터베이스 연결");
			}
			
			String sql = "update dept set dname=?, loc=? where deptno=?";

			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1,  "기획");
			pstmt.setString(2,  "제주");
			pstmt.setInt(3,  60);
			
			int result = pstmt.executeUpdate();
			
			if(result>0) {
				System.out.println("수정되었습니다.");
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
