package HOME1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Home_Connect {

	public static void main(String[] args) {
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String driver="oracle.jdbc.driver.OracleDriver";
		String id="scott";
		String pw="tiger";
		String sql="select*from customer";
		Connection con=null;
		PreparedStatement st=null;
		ResultSet rs=null;
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,id,pw);
			st = con.prepareStatement(sql);
			rs = st.executeQuery();

			
			while(rs.next()) {
				int num=rs.getInt("num");
				String email=rs.getString("email");
				String tel=rs.getString("tel");
				
				System.out.printf("%d \t %s \t %s\n",num,email,tel);
			};
			
			
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	
		
		try {
			if(rs!=null)rs.close();
			if(st!=null)st.close();
			if(con!=null)con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
