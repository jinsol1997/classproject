package dept.dao;

import java.util.List;
import dept.domain.Dept;
import java.sql.Connection;
import java.sql.SQLException;

public interface Dao {

	List<Dept> select(Connection conn) throws SQLException;
	Dept selectByDeptno(Connection conn, int deptno) throws SQLException;
	
	// DML => int 결과 (반영된 갯수)
	int insert(Connection conn, Dept dept) throws SQLException;
	int update(Connection conn, Dept dept) throws SQLException;
	int delete(Connection conn, int deptno) throws SQLException;
	
	
}
