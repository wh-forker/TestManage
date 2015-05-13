package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import model.StuScore;
import util.DBManager;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class StuScoreDao {
	
	
	/*public static void main(String[] args){
		Connection con=(Connection) DBManager.getCon();
		System.out.println(""+con);
		StuScoreDao dao=new StuScoreDao();
		dao.updateStuScore("2011210610", 1, "1ŶŶ", 100.00, "ŶŶ1", 88.99, "2ŶŶ", 25,56, "ŶŶ2",70, "ŶŶŶ2",66, "ŶŶŶŶŶ2", 90,58);
		System.out.println(""+ss.getFinalgrade());
		for(StuScore s:ss)
		{
			System.out.println("getAccount=="+s.getAccount()+"getFinalgrade=="+s.getFinalgrade()+"getMidwork2=="+s.getMidwork2()+"getGrade2=="+s.getGrade2());
		}
	}*/
	
	public StuScore[] getStuAllScore(String account) {
		Connection con = (Connection) DBManager.getCon();
		PreparedStatement pstmt = null;
		String[] sql=new String[8];
	 	sql[0] = "select * from ter1m where acc_ou_nt = ?";
	 	sql[1] = "select * from ter2m where acc_ou_nt = ?";
 	    sql[2] = "select * from ter3m where acc_ou_nt = ?";
	    sql[3] = "select * from ter4m where acc_ou_nt = ?";
        sql[4] = "select * from ter5m where acc_ou_nt = ?";
	    sql[5] = "select * from ter6m where acc_ou_nt = ?";
 	    sql[6] = "select * from ter7m where acc_ou_nt = ?";
 	    sql[7] = "select * from ter8m where acc_ou_nt = ?";
		
		ResultSet rs = null;
	    StuScore[] list = new StuScore[8];
		try {
			for(int i=0;i<8;i++){
				pstmt = (PreparedStatement) con.prepareStatement(sql[i]);
				pstmt.setString(1, account);
				rs = pstmt.executeQuery(); 		 
				while(rs.next()){
					StuScore cus=new StuScore();
					cus.setAccount(rs.getString(1));
					cus.setTerm(rs.getInt(2));
					cus.setMaincourse(rs.getString(3));
					cus.setType1(rs.getString(4));
					cus.setUsualperformance(rs.getDouble(5));
					cus.setMidwork(rs.getString(6));
					cus.setQuiz(rs.getDouble(7));
					cus.setFinalwork(rs.getString(8));
					cus.setFinalgrade(rs.getDouble(9));
					cus.setGrade(rs.getDouble(10));
					
					cus.setSecondcourse(rs.getString(11));
					cus.setType2(rs.getString(12));
					cus.setUsualperformance2(rs.getDouble(13));
					cus.setMidwork2(rs.getString(14));
					cus.setQuiz2(rs.getDouble(15));
					cus.setFinalwork2(rs.getString(16));
					cus.setFinalgrade2(rs.getDouble(17));
					cus.setGrade2(rs.getDouble(18));
					
					cus.setSecondcourse3(rs.getString(19));
					cus.setType3(rs.getString(20));
					cus.setUsualperformance3(rs.getDouble(21));
					cus.setMidwork3(rs.getString(22));
					cus.setQuiz3(rs.getDouble(23));
					cus.setFinalwork3(rs.getString(24));
					cus.setFinalgrade3(rs.getDouble(25));
					cus.setGrade3(rs.getDouble(26));
					
					list[i]=cus;
			}
			
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
	
	public StuScore getStuScore(String account,int term) {
		Connection con = (Connection) DBManager.getCon();
		PreparedStatement pstmt = null;
		String sql="";
		if(term==1)
		sql = "select * from ter1m where acc_ou_nt = ?";
		else if(term==2)
		sql = "select * from ter2m where acc_ou_nt = ?";
		else if(term==3)
			sql = "select * from ter3m where acc_ou_nt = ?";
		else if(term==4)
			sql = "select * from ter4m where acc_ou_nt = ?";
		else if(term==5)
			sql = "select * from ter5m where acc_ou_nt = ?";
		else if(term==6)
			sql = "select * from ter6m where acc_ou_nt = ?";
		else if(term==7)
			sql = "select * from ter7m where acc_ou_nt = ?";
		else if(term==8)
			sql = "select * from ter8m where acc_ou_nt = ?";
		ResultSet rs = null;
		StuScore cus = new StuScore();
		try {
			pstmt = (PreparedStatement) con.prepareStatement(sql);
			pstmt.setString(1, account);
			rs = pstmt.executeQuery(); 		 
			if(rs.next()){
				cus.setAccount(rs.getString(1));
				cus.setTerm(rs.getInt(2));
				cus.setMaincourse(rs.getString(3));
				cus.setType1(rs.getString(4));
				cus.setUsualperformance(rs.getDouble(5));
				cus.setMidwork(rs.getString(6));
				cus.setQuiz(rs.getDouble(7));
				cus.setFinalwork(rs.getString(8));
				cus.setFinalgrade(rs.getDouble(9));
				cus.setGrade(rs.getDouble(10));
				
				cus.setSecondcourse(rs.getString(11));
				cus.setType2(rs.getString(12));
				cus.setUsualperformance2(rs.getDouble(13));
				cus.setMidwork2(rs.getString(14));
				cus.setQuiz2(rs.getDouble(15));
				cus.setFinalwork2(rs.getString(16));
				cus.setFinalgrade2(rs.getDouble(17));
				cus.setGrade2(rs.getDouble(18));
				
				cus.setSecondcourse3(rs.getString(19));
				cus.setType3(rs.getString(20));
				cus.setUsualperformance3(rs.getDouble(21));
				cus.setMidwork3(rs.getString(22));
				cus.setQuiz3(rs.getDouble(23));
				cus.setFinalwork3(rs.getString(24));
				cus.setFinalgrade3(rs.getDouble(25));
				cus.setGrade3(rs.getDouble(26));
				
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
	
	public void updateStuScore(String account,int term,String maincourse,String type1,double usualperformance,String midwork,double quiz,String finalwork,double finalgrade,double grade,String secondcourse,String type2,double usualperformance2,String midwork2,double quiz2,String finalwork2,double finalgrade2,double grade2,String secondcourse3,String type3,double usualperformance3,String midwork3,double quiz3,String finalwork3,double finalgrade3,double grade3){
		Connection con = (Connection) DBManager.getCon();
		PreparedStatement pstmt = null;
		String sql="";
		if(term==1)
        	 sql= "update ter1m set mai_nc_ourse=?,type1=?,usu_alp_erformance=?,midw_ork=?,qu_iz=?,fin_alw_ork=?,fin_alg_rade=?,g_rad_e=?,secon_dc_ourse=?,type2=?,usu_alp_erformance2=?,midw_ork2=?,qu_iz2=?,fin_alw_ork2=?,fin_alg_rade2=?,g_rad_e2=?,secon_dc_ourse3=?,type3=?,usu_alp_erformance3=?,midw_ork3=?,qu_iz3=?,fin_alw_ork3=?,fin_alg_rade3=?,g_rad_e3=? where acc_ou_nt = ?";
		else if(term==2)
			 sql= "update ter2m set mai_nc_ourse=?,type1=?,usu_alp_erformance=?,midw_ork=?,qu_iz=?,fin_alw_ork=?,fin_alg_rade=?,g_rad_e=?,secon_dc_ourse=?,type2=?,usu_alp_erformance2=?,midw_ork2=?,qu_iz2=?,fin_alw_ork2=?,fin_alg_rade2=?,g_rad_e2=?,secon_dc_ourse3=?,type3=?,usu_alp_erformance3=?,midw_ork3=?,qu_iz3=?,fin_alw_ork3=?,fin_alg_rade3=?,g_rad_e3=?  where acc_ou_nt = ?";
		else if(term==3)
			 sql= "update ter3m set mai_nc_ourse=?,type1=?,usu_alp_erformance=?,midw_ork=?,qu_iz=?,fin_alw_ork=?,fin_alg_rade=?,g_rad_e=?,secon_dc_ourse=?,type2=?,usu_alp_erformance2=?,midw_ork2=?,qu_iz2=?,fin_alw_ork2=?,fin_alg_rade2=?,g_rad_e2=?,secon_dc_ourse3=?,type3=?,usu_alp_erformance3=?,midw_ork3=?,qu_iz3=?,fin_alw_ork3=?,fin_alg_rade3=?,g_rad_e3=?  where acc_ou_nt = ?";
		else if(term==4)
			 sql= "update ter4m set mai_nc_ourse=?,type1=?,usu_alp_erformance=?,midw_ork=?,qu_iz=?,fin_alw_ork=?,fin_alg_rade=?,g_rad_e=?,secon_dc_ourse=?,type2=?,usu_alp_erformance2=?,midw_ork2=?,qu_iz2=?,fin_alw_ork2=?,fin_alg_rade2=?,g_rad_e2=?,secon_dc_ourse3=?,type3=?,usu_alp_erformance3=?,midw_ork3=?,qu_iz3=?,fin_alw_ork3=?,fin_alg_rade3=?,g_rad_e3=?  where acc_ou_nt = ?";
		else if(term==5)
			 sql= "update ter5m set mai_nc_ourse=?,type1=?,usu_alp_erformance=?,midw_ork=?,qu_iz=?,fin_alw_ork=?,fin_alg_rade=?,g_rad_e=?,secon_dc_ourse=?,type2=?,usu_alp_erformance2=?,midw_ork2=?,qu_iz2=?,fin_alw_ork2=?,fin_alg_rade2=?,g_rad_e2=?,secon_dc_ourse3=?,type3=?,usu_alp_erformance3=?,midw_ork3=?,qu_iz3=?,fin_alw_ork3=?,fin_alg_rade3=?,g_rad_e3=?  where acc_ou_nt = ?";
		else if(term==6)
			 sql= "update ter6m set mai_nc_ourse=?,type1=?,usu_alp_erformance=?,midw_ork=?,qu_iz=?,fin_alw_ork=?,fin_alg_rade=?,g_rad_e=?,secon_dc_ourse=?,type2=?,usu_alp_erformance2=?,midw_ork2=?,qu_iz2=?,fin_alw_ork2=?,fin_alg_rade2=?,g_rad_e2=?,secon_dc_ourse3=?,type3=?,usu_alp_erformance3=?,midw_ork3=?,qu_iz3=?,fin_alw_ork3=?,fin_alg_rade3=?,g_rad_e3=?  where acc_ou_nt = ?";
		else if(term==7)
			 sql= "update ter7m set mai_nc_ourse=?,type1=?,usu_alp_erformance=?,midw_ork=?,qu_iz=?,fin_alw_ork=?,fin_alg_rade=?,g_rad_e=?,secon_dc_ourse=?,type2=?,usu_alp_erformance2=?,midw_ork2=?,qu_iz2=?,fin_alw_ork2=?,fin_alg_rade2=?,g_rad_e2=?,secon_dc_ourse3=?,type3=?,usu_alp_erformance3=?,midw_ork3=?,qu_iz3=?,fin_alw_ork3=?,fin_alg_rade3=?,g_rad_e3=?  where acc_ou_nt = ?";
		else if(term==8)
			 sql= "update ter8m set mai_nc_ourse=?,type1=?,usu_alp_erformance=?,midw_ork=?,qu_iz=?,fin_alw_ork=?,fin_alg_rade=?,g_rad_e=?,secon_dc_ourse=?,type2=?,usu_alp_erformance2=?,midw_ork2=?,qu_iz2=?,fin_alw_ork2=?,fin_alg_rade2=?,g_rad_e2=?,secon_dc_ourse3=?,type3=?,usu_alp_erformance3=?,midw_ork3=?,qu_iz3=?,fin_alw_ork3=?,fin_alg_rade3=?,g_rad_e3=?  where acc_ou_nt = ?";
		
		try {
			pstmt = (PreparedStatement) con.prepareStatement(sql);			
				pstmt.setString(1, maincourse);
				pstmt.setString(2,type1);
				pstmt.setDouble(3,usualperformance);
				pstmt.setString(4,midwork);
				pstmt.setDouble(5,quiz);
				pstmt.setString(6,finalwork);
				pstmt.setDouble(7,finalgrade);
				pstmt.setDouble(8, grade);
				
				pstmt.setString(9, secondcourse);
				pstmt.setString(10,type2);
				pstmt.setDouble(11,usualperformance2);
				pstmt.setString(12,midwork2);
				pstmt.setDouble(13,quiz2);
				pstmt.setString(14,finalwork2);
				pstmt.setDouble(15,finalgrade2);
				pstmt.setDouble(16, grade2);
				
				pstmt.setString(17, secondcourse3);
				pstmt.setString(18,type3);
				pstmt.setDouble(19,usualperformance3);
				pstmt.setString(20,midwork3);
				pstmt.setDouble(21,quiz3);
				pstmt.setString(22,finalwork3);
				pstmt.setDouble(23,finalgrade3);
				pstmt.setDouble(24, grade3);
				pstmt.setString(25, account);

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
