package egovframework.sample.service.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCUtil {
	//모든 DAO 클래스에서 공통으로 사용할 JDBCUtil 클래스를 작성하여 Connection 획득과 해제 작업을 공동으로 처리.
	
	public static Connection getConnection(){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			return DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:49161:xe", "system", "oracle");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
	
	public static void close(Statement stmt, Connection conn) {
		
		try {
			if(stmt != null)
				stmt.close();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			stmt = null;
		}
		
		try {
			if(!conn.isClosed() || conn != null)
				conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			conn = null;
		}
		
	}
	
	public static void close(ResultSet rs, Statement stmt, Connection conn) {
		try {
			if(rs != null)
				rs.close();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			rs = null;
		}
		
		try {
			if(stmt != null)
				stmt.close();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			stmt = null;
		}
		
		try {
			if(!conn.isClosed() || conn != null)
				conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			conn = null;
		}
		
	}
	
}
