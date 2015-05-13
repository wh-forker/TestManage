package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import model.Admin;
import model.Announcement;

import util.DBManager;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class AdminDao {
	
	public Admin getAdmin(String account) {		
		Connection con = (Connection) DBManager.getCon();
		PreparedStatement pstmt = null;
		String sql = "select * from a_dm_i where ac_co_unt = ?";
		ResultSet rs = null;
		Admin cus = new Admin();
		try {
			pstmt = (PreparedStatement) con.prepareStatement(sql);
			pstmt.setString(1, account);
			rs = pstmt.executeQuery();      
			if(rs.next()){
				cus.setAccount(rs.getString(1));
				cus.setPassword(rs.getString(2));
				cus.setName(rs.getString(3));
				cus.setGender(rs.getString(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return cus;
	}
	
	
	public void updatePWD(String account, String password) {
		Connection con=(Connection) DBManager.getCon();
		PreparedStatement pstmt=null;
		String sql="update a_dm_i set pa_ssw_ord=? where ac_co_unt=?";
		try {
			pstmt=(PreparedStatement) con.prepareStatement(sql);
			pstmt.setString(1, password);
			pstmt.setString(2,account);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public Announcement getAnnouncement(){
		Connection con = (Connection) DBManager.getCon();
		PreparedStatement pstmt = null;
		String sql = "select * from announ_cement";
		ResultSet rs = null;
		Announcement cus = new Announcement();
		try {
			pstmt = (PreparedStatement) con.prepareStatement(sql);
			rs = pstmt.executeQuery();      
			if(rs.next()){
				cus.setText(rs.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return cus;
	}
	
/*	public static void main(String[] args){
		Connection con=(Connection) DBManager.getCon();
		System.out.println(""+con);
		AdminDao dao=new AdminDao();
		dao.updateAnnouncement("111111111");
	}*/
	
	public void updateAnnouncement(String text){
		Connection con=(Connection) DBManager.getCon();
		PreparedStatement pstmt=null;
		String sql="update announ_cement set text=? where id=1";
		try {
			pstmt=(PreparedStatement) con.prepareStatement(sql);
			pstmt.setString(1,text);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
		
	
}




