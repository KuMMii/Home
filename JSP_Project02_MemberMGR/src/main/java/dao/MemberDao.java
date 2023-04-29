package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
				mdto.setUserid(rs.getString("userid"));
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

	public int insertMember(MemberDto mdto) {
		int result=0;
		con=DBManager.getConnection();
		String sql="insert into memberh(userid, pwd, name, phone, email, admin) values(?,?,?,?,?,?)";
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, mdto.getUserid());
			ps.setString(2, mdto.getPwd());
			ps.setString(3, mdto.getName());
			ps.setString(4, mdto.getPhone());
			ps.setString(5, mdto.getEmail());
			ps.setInt(6, mdto.getAdmin());
			
			result=ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {DBManager.close(con, ps, rs);}
		return result;
	}

	public ArrayList<MemberDto> selectMember() {
		ArrayList<MemberDto> list=new ArrayList<MemberDto>();
		con=DBManager.getConnection();
		String sql="select * from memberh";
		
		try {
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				MemberDto mdto=new MemberDto(); 
				mdto.setName(rs.getString("name"));
				mdto.setUserid(rs.getString("userid"));
				mdto.setPwd(rs.getString("pwd"));
				mdto.setPhone(rs.getString("phone"));
				mdto.setEmail(rs.getString("email"));
				mdto.setAdmin(rs.getInt("admin"));
			
				list.add(mdto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBManager.close(con, ps, rs);
		}
		return list;
	}

	public void editAdmin(String userid, String admin) {

		con=DBManager.getConnection();
		String sql="update memberh set admin=? where userid=?";
		try {
			ps=con.prepareStatement(sql);
			ps.setInt(1, Integer.parseInt(admin));
			ps.setString(2, userid);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBManager.close(con, ps, rs);
		}
	}

	public int deleteMember(String userid) {
		int result=0;
		con=DBManager.getConnection();
		String sql="delete from memberh where userid=?";
		
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, userid);
			result=ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBManager.close(con, ps, rs);
		}
		return result;
	}


	public int updateMember(MemberDto mdto) {
		int result=0;
		con=DBManager.getConnection();
		String sql="update memberh set name=?, pwd=?, phone=?, email=?, admin=? where userid=?";
		
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, mdto.getName());
			ps.setString(2, mdto.getPwd());
			ps.setString(3, mdto.getPhone());
			ps.setString(4, mdto.getEmail());
			ps.setInt(5, mdto.getAdmin());
			ps.setString(6, mdto.getUserid());
			
			result=ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {DBManager.close(con, ps, rs);}
		return result;
	}



	
}
