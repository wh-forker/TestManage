package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {
	/**
	 * 获取与数据库的连接
	 * 
	 * @param args
	 */
	public static Connection getCon() {
		Connection con = null;
		try {
			// 加载驱动，考入对应的驱动程序
			Class.forName("com.mysql.jdbc.Driver");
			// 指定服务器的位置，账号和口令
			String url = "jdbc:mysql://localhost:3306/testmanage?user=root&password=kxjh";
			// 验证成功后返回一个与服务器的连接
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


