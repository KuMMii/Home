package HOME1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Home_Insert {

	public static void main(String[] args) {
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String driver="oracle.jdbc.driver.OracleDriver";
		String id="scott";
		String pw="tiger";
		Connection con=null;
		PreparedStatement st=null;
		
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,id,pw);

			Scanner sc= new Scanner(System.in);	
			System.out.print("이메일을 입력하세요 : ");
			String email =sc.nextLine();
			System.out.print("전화번호를 입력하세요 : ");
			String tel =sc.nextLine();

			String sql="insert into customer values(num_seq.nextVal,?,?)";
			st = con.prepareCall(sql);
			st.setString(1,email);
			st.setString(2, tel);
			
			int result=st.executeUpdate();
			if(result==1) System.out.println("Success");
			else System.out.println("Failed");
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
	
		
		try {
			if(st!=null)st.close();
			if(con!=null)con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
