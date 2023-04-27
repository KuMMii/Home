package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dto.MemberDto;
import util.DBManager;

public class MemberDao {

	private MemberDao() {}
	private static MemberDao itc = new MemberDao();
	public static MemberDao getInstance() {return itc;}
	
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	
	public MemberDto getMember(String userid) {
		MemberDto mdto=null;
		con=DBManager.getConnection();
		String sql="select * from memberh where userid=?";
	
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, userid);
			rs=ps.executeQuery();
			if(rs.next()) { //Using 'if' because it has only one query. if not, use 'while'
				mdto=new MemberDto();
				mdto.setName(rs.getString("userid"));
				mdto.setPwd(rs.getString("pwd"));
				mdto.setName(rs.getString("name"));
				mdto.setPhone(rs.getString("phone"));
				mdto.setEmail(rs.getString("email"));
				mdto.setAdmin(rs.getInt("admin"));
			} //no 'list.add()' bc it's only one query
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBManager.close(con, ps, rs);
		}return mdto;
	
	
	
	
	}
	
}
