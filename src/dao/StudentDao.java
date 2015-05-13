package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import model.Student;

import util.DBManager;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class StudentDao {
	public Student getStudent(String account) {		
		
		Connection con = (Connection) DBManager.getCon();
		PreparedStatement pstmt = null;
		String sql = "select * from st_ud_en where acc_ou_nt = ?";
		ResultSet rs = null;
		Student cus = new Student();
		try {
			pstmt = (PreparedStatement) con.prepareStatement(sql);
			pstmt.setString(1, account);
			rs = pstmt.executeQuery();      
			if(rs.next()){
				cus.setAccount(rs.getString(1));
				cus.setPassword(rs.getString(2));
				cus.setName(rs.getString(3));
				cus.setGender(rs.getString(4));
				cus.setProfessional(rs.getString(5));
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
		String sql="update st_ud_en set pa_ssw_ord=? where ac_co_unt=?";
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
}
