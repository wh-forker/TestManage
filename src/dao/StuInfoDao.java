package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.StuInfo;

import util.DBManager;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class StuInfoDao {

	/*		
	public static void main(String[] args){
		Connection con =(Connection) DBManager.getCon();
		StuInfoDao dao=new StuInfoDao();
		dao.delStuInfo("1");
		dao.updateStuInfo("2011210610","金开","男","钢琴","马老师","二胡","刘老师");
		StuInfo a =dao.getStuInfo("2011210610");
		System.out.println("name="+a.getName()+"account="+a.getAccount()+"gender="+a.getGender());
	 
	}*/
	
	public StuInfo getStuInfo(String account) {
		Connection con = (Connection) DBManager.getCon();
		PreparedStatement pstmt = null;
		String sql = "select * from st_uin_fo where acc_ou_nt = ?";
		ResultSet rs = null;
		StuInfo cus = new StuInfo();
		try {
			pstmt = (PreparedStatement) con.prepareStatement(sql);
			pstmt.setString(1, account);
			rs = pstmt.executeQuery(); 		 
			if(rs.next()){
				cus.setAccount(rs.getString(1));
				cus.setName(rs.getString(2));
				cus.setGender(rs.getString(3));
				cus.setMaincourse(rs.getString(4));
				cus.setMainteacher(rs.getString(5));
				cus.setSecondcourse(rs.getString(6));
				cus.setSecondteacher(rs.getString(7));
				cus.setSecondcourse2(rs.getString(8));
				cus.setSecondteacher2(rs.getString(9));
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
	
	public void delStuInfo(String account) {
		Connection con = (Connection) DBManager.getCon();
		PreparedStatement pstmt = null;
		String sql = "delete from st_uin_fo where acc_ou_nt = ?";
		StuInfo cus = new StuInfo();
		try {
			pstmt = (PreparedStatement) con.prepareStatement(sql);
			pstmt.setString(1, account);
			pstmt.executeUpdate();		 
			 
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			try {
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		 
	}
	
	public List<StuInfo> getStuInformation(String account) {
		Connection con = (Connection) DBManager.getCon();
		PreparedStatement pstmt = null;
		String sql = "select * from st_uin_fo where acc_ou_nt like ?";
		ResultSet rs = null;
		List<StuInfo> list=new ArrayList<StuInfo>();
		try {
			pstmt = (PreparedStatement) con.prepareStatement(sql);
			pstmt.setString(1, account+"%");
			rs = pstmt.executeQuery(); 		 
			while(rs.next()){
				StuInfo cus = new StuInfo();
				cus.setAccount(rs.getString(1));
				cus.setName(rs.getString(2));
				cus.setGender(rs.getString(3));
				cus.setMaincourse(rs.getString(4));
				cus.setMainteacher(rs.getString(5));
				cus.setSecondcourse(rs.getString(6));
				cus.setSecondteacher(rs.getString(7));
				cus.setSecondcourse2(rs.getString(8));
				cus.setSecondteacher2(rs.getString(9));
				list.add(cus);
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
		return list;
	}
	
	public void updateStuInfo(String account,String name,String gender,String maincourse,String mainteacher,String secondcourse,String secondteacher,String secondcourse2,String secondteacher2) {
		Connection con = (Connection) DBManager.getCon();
		PreparedStatement pstmt = null;
		String sql = "update st_uin_fo set na_me=?,gen_der=?,m_ain_course=?,m_ain_teacher=?,sec_ond_course1=?,sec_ond_teacher1=?,sec_ond_course2=?,sec_ond_teacher2=? where acc_ou_nt = ?";
		try {
			pstmt = (PreparedStatement) con.prepareStatement(sql);			
				pstmt.setString(1, name);
				pstmt.setString(2,gender);
				pstmt.setString(3,maincourse);
				pstmt.setString(4,mainteacher);
				pstmt.setString(5,secondcourse);
				pstmt.setString(6,secondteacher);
				pstmt.setString(7,secondcourse2);
				pstmt.setString(8,secondteacher2);
				pstmt.setString(9, account);
				pstmt.executeUpdate();			 
		 
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
		  try {
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void addStuInfo(String account,String name,String gender,String maincourse,String mainteacher,String secondcourse,String secondteacher,String secondcourse2,String secondteacher2) {
		Connection con = (Connection) DBManager.getCon();
		PreparedStatement pstmt = null;
		String sql = "insert into st_uin_fo values (?,?,?,?,?,?,?,?,?)";
		try {
			pstmt = (PreparedStatement) con.prepareStatement(sql);	
				
				pstmt.setString(1,account);
				pstmt.setString(2,name);
				pstmt.setString(3,gender);
				pstmt.setString(4,maincourse);
				pstmt.setString(5,mainteacher);
				pstmt.setString(6,secondcourse);
				pstmt.setString(7,secondteacher);
				pstmt.setString(8,secondcourse2);
				pstmt.setString(9,secondteacher2);
				pstmt.executeUpdate();			 
		 
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
		  try {
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public List<StuInfo> getAllStuInfo() {	
		List<StuInfo> list=new ArrayList<StuInfo>();
		Connection con = (Connection) DBManager.getCon();
		PreparedStatement pstmt = null;
		String sql = "select * from st_uin_fo";
		ResultSet rs = null;
		try {
			pstmt = (PreparedStatement) con.prepareStatement(sql);
			rs = pstmt.executeQuery();     			
			while(rs.next()){		
				StuInfo cus = new StuInfo();
				cus.setAccount(rs.getString(1));
				cus.setName(rs.getString(2));
				cus.setGender(rs.getString(3));
				cus.setMaincourse(rs.getString(4));
				cus.setMainteacher(rs.getString(5));
				cus.setSecondcourse(rs.getString(6));
				cus.setSecondteacher(rs.getString(7));
				cus.setSecondcourse2(rs.getString(8));
				cus.setSecondteacher2(rs.getString(9));
				list.add(cus);
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
		return list;
	}
		
}
