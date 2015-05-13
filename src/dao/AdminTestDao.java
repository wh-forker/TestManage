package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.AdminTest;
import model.StuInfo;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import util.DBManager;

public class AdminTestDao {
	
	public static void main(String args[]){
		AdminTestDao dao= new AdminTestDao();
	/*	
	    List<AdminTest> at=dao.getAllTestInfo();
		for(AdminTest a:at){
			System.out.println(a.getTestTime());
		}*/
		dao.delTestInfo("2015ÈýÔÂ19-ÉÏÎç08:25");
	//	dao.addTestDao("2","1","1","1","1","1");
	}
	
	public void addTestDao(String testTime,String term,String type,String place,String num,String course,String note){
		Connection con=(Connection)DBManager.getCon();
		PreparedStatement pstmt=null;
		String sql="insert into test_info values(0,?,?,?,?,?,?,?)";
		try{
			pstmt=(PreparedStatement) con.prepareStatement(sql);
			
			pstmt.setString(1, testTime);
			pstmt.setString(2, term);
			pstmt.setString(3, type);
			pstmt.setString(4, place);
			pstmt.setString(5, num);
			pstmt.setString(6, course);
			pstmt.setString(7, note);
			pstmt.executeUpdate();
			
		}catch(Exception e){
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
	

	public List<AdminTest> getAllTestInfo() {	
		List<AdminTest> list=new ArrayList<AdminTest>();
		Connection con = (Connection) DBManager.getCon();
		PreparedStatement pstmt = null;
		String sql = "select * from test_info";
		ResultSet rs = null;
		try {
			pstmt = (PreparedStatement) con.prepareStatement(sql);
			rs = pstmt.executeQuery();     			
			while(rs.next()){		
				AdminTest cus = new AdminTest();
				cus.setTestTime(rs.getString(2));
				cus.setTerm(rs.getString(3));
				cus.setType(rs.getString(4));
				cus.setPlace(rs.getString(5));				
				cus.setNum(rs.getString(6));
				cus.setCourse(rs.getString(7));
				cus.setNote(rs.getString(8));
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

	public void delTestInfo(String place) {
		Connection con = (Connection) DBManager.getCon();
		PreparedStatement pstmt = null;
		String sql = "delete from test_info where place = ?";
		AdminTest cus = new AdminTest();
		try {
			pstmt = (PreparedStatement) con.prepareStatement(sql);
			pstmt.setString(1, place);
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

}
