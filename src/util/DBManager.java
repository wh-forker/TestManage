package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {
	/**
	 * ��ȡ�����ݿ������
	 * 
	 * @param args
	 */
	public static Connection getCon() {
		Connection con = null;
		try {
			// ���������������Ӧ����������
			Class.forName("com.mysql.jdbc.Driver");
			// ָ����������λ�ã��˺źͿ���
			String url = "jdbc:mysql://localhost:3306/testmanage?user=root&password=kxjh";
			// ��֤�ɹ��󷵻�һ���������������
			con = DriverManager.getConnection(url);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	public static void main(String[] args) {
		System.out.println(getCon());

	}
}


