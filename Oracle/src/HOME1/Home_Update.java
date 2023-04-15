package HOME1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Home_Update {

	public static void main(String[] args) {
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String driver="oracle.jdbc.driver.OracleDriver";
		String id="scott";
		String pw="tiger";
		Connection con=null;
		PreparedStatement st=null;
		
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url,id,pw);
			
			Scanner sc =new Scanner(System.in);
			System.out.print("Type a number of row to update: ");
			String stnum = sc.nextLine();
			int num=Integer.parseInt(stnum);
			
			System.out.print("1.Email 2.PhoneNumber : ");
			String input = sc.nextLine();
			
			String sql="";
			switch(input) {
			case "1":
				sql="update customer set email=? where num=? ";
				System.out.print("Type email to change : ");
				String email= sc.nextLine();
				st=con.prepareStatement(sql);
				st.setString(1, email);
				st.setInt(2, num);
				break;
			case "2":
				sql="update customer set tel=? where num=? ";
				System.out.print("Type email to change : ");
				String tel= sc.nextLine();
				st=con.prepareStatement(sql);
				st.setString(1, tel);
				st.setInt(2, num);
				break;
			}
			
			int result=st.executeUpdate();
			if(result==1)System.out.println("수정 성공");
			else System.out.println("수정 실패");
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
