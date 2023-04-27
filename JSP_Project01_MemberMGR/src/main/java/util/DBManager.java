package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBManager {
	static String driver="oracle.jdbc.driver.OracleDriver";
	static String url="jdbc:oracle:thin:@localhost:1521:xe";
	static String id="scott";
	static String pwd="tiger";
	
	public static Connection getConnection() {
		
		Connection con=null;
		
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url,id,pwd);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}return con;
	
	}
	
	public static void close(Connection con, PreparedStatement ps, ResultSet rs) {
		try {
			if(rs!=null) {rs.close();}
			if(ps!=null) {ps.close();}
			if(con!=null) {con.close();}
		} catch (SQLException e) {
				e.printStackTrace();
			}
	}
}
	

