package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Student;
import model.Teacher;

import util.DBManager;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class TeacherDao {
	
/*	
  public static void main(String args[]){
	  Connection con=(Connection) DBManager.getCon();
		System.out.println(""+con);
		TeacherDao td=new TeacherDao();
		List<String> a=td.getStudentByTeacherName("Õı–¶∫œ");
		for(String i : a){
			System.out.println("name=="+i.);
		} 
		
		
  }
	
	public List<String> getStudentByTeacherName(String teacherName) {		
		Connection con = (Connection) DBManager.getCon();
		PreparedStatement pstmt = null;
		String sql = "select na_me from st_uin_fo where m_ain_teacher = ?";
		ResultSet rs = null;
		List<String> cus = new ArrayList<String>();
		try {
			pstmt = (PreparedStatement) con.prepareStatement(sql);
			pstmt.setString(1, teacherName);
		//	pstmt.setString(2, teacherName);
		//	pstmt.setString(3, teacherName);
			rs = pstmt.executeQuery();      
			if(rs.next()){
			//	Student s=new Student();
			//	s.setAccount(rs.getString(1));
				cus.add(rs.getString(1));
			//	s.setGender(rs.getString(3));
			//	s.setProfessional(rs.getString(4));
			//	cus.add(s);
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
	}*/
	
	
	public Teacher getTeacher(String account) {		
		Connection con = (Connection) DBManager.getCon();
		PreparedStatement pstmt = null;
		String sql = "select * from tea_ch_er where acc_ou_nt = ?";
		ResultSet rs = null;
		Teacher cus = new Teacher();
		try {
			pstmt = (PreparedStatement) con.prepareStatement(sql);
			pstmt.setString(1, account);
			rs = pstmt.executeQuery();      
			if(rs.next()){
				cus.setAccount(rs.getString(1));
				cus.setPassword(rs.getString(2));
				cus.setName(rs.getString(3));
				cus.setGender(rs.getString(4));
				cus.setCourse(rs.getString(5));
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
		String sql="update tea_ch_er set pas_sw_ord=? where acc_ou_nt=?";
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
