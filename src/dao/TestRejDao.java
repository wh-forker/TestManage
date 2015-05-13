package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.StuInfo;
import model.TestRej;

import util.DBManager;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class TestRejDao{
	
  
 	public static void main(String args[]){
		TestRejDao tr= new TestRejDao();
//		tr.addTestRej("1","1","1","1","1","1",1);
	//    tr.updateState("2011210610", 1);
//		System.out.println(tr.getTestRej("2011210610").account+":  ×´Ì¬£º"+tr.getTestRej("2011210610").state);
		List<TestRej> list=tr.getAllTestRej();
		for(TestRej a : list)
		{
			System.out.println("account "+a.getAccount()+" state:"+a.getState()+a.getComposer());
		}
	//	tr.updateState("2011210610",1);
	} 

	
	//Ìí¼Ó×¢²áÐÅÏ¢
	public void addTestRej(String account ,String name, String professional,String course,String term,String workname,String composer,String type,int state){
		Connection con = (Connection) DBManager.getCon();
		PreparedStatement pstmt = null;
		String sql = "insert into test_rej values (?,?,?,?,?,?,?,?,?)";
		try {
			pstmt = (PreparedStatement) con.prepareStatement(sql);	
				
				pstmt.setString(1, account);
				pstmt.setString(2, name);
				pstmt.setString(3, professional);
				pstmt.setString(4,course);
				pstmt.setString(5,term);
				pstmt.setString(6,workname);
				pstmt.setString(7,composer);
				pstmt.setString(8,type);
				pstmt.setInt(9,state);
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
	
	
	public TestRej getTestRej(String account) {		
		Connection con = (Connection) DBManager.getCon();
		PreparedStatement pstmt = null;
		String sql = "select * from test_rej where account = ?";
		ResultSet rs = null;
		TestRej cus = new TestRej();
		try {
			pstmt = (PreparedStatement) con.prepareStatement(sql);
			pstmt.setString(1, account);
			rs = pstmt.executeQuery();      
			if(rs.next()){
				cus.setAccount(rs.getString(1));
				cus.setName(rs.getString(2));
				cus.setProfessional(rs.getString(3));
				cus.setCourse(rs.getString(4));
				cus.setTerm(rs.getInt(5));
				cus.setWorkname(rs.getString(6));
				cus.setComposer(rs.getString(7));
				cus.setType(rs.getString(8));
				cus.setState(rs.getInt(9));
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
	
 
	
	public void updateState(String account,int s) {  //¸üÐÂ×¢²áÉóºË×´Ì¬
		Connection con=(Connection) DBManager.getCon();
		PreparedStatement pstmt=null;
		String sql="update test_rej set state=? where account=?";
		try {
			pstmt=(PreparedStatement) con.prepareStatement(sql);
			pstmt.setInt(1,s);
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
	
	public void delTestRej(String account) {
		Connection con = (Connection) DBManager.getCon();
		PreparedStatement pstmt = null;
		String sql = "delete from test_rej where account = ?";
		TestRej cus = new TestRej();
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
	
	public List<TestRej> getAllTestRej() {	
		List<TestRej> list=new ArrayList<TestRej>();
		Connection con = (Connection) DBManager.getCon();
		PreparedStatement pstmt = null;
		String sql = "select * from test_rej";
		ResultSet rs = null;
		try {
			pstmt = (PreparedStatement) con.prepareStatement(sql);
			rs = pstmt.executeQuery();     			
			while(rs.next()){		
				TestRej cus = new TestRej();
				cus.setAccount(rs.getString(1));
				cus.setName(rs.getString(2));
				cus.setProfessional(rs.getString(3));
				cus.setCourse(rs.getString(4));
				cus.setTerm(rs.getInt(5));
				cus.setWorkname(rs.getString(6));
				cus.setComposer(rs.getString(7));
				cus.setType(rs.getString(8));
				cus.setState(rs.getInt(9));
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
