package util;
 
public class SqlPageSQL {
	/**
	 *@param sql ԭʼsql���
	 *@param curPage �ڼ�ҳ
	 *@param rowsPerPage ÿҳ������ 
	 */
	// SqlServer��ҳsql���
	public static String getPageSQLServer(String sql,int curPage,int rowsPerPage){
		String afterFrom = sql.toLowerCase().substring(sql.indexOf("from"));
		String pageSql = null;
		if(afterFrom.indexOf("where")==-1)
			 pageSql = "select top "+ rowsPerPage + " * "+afterFrom
			+" where id not in(select top "+rowsPerPage*(curPage-1)+" id "
			+afterFrom+" order by id desc)"+"order by id desc";
		else
			pageSql = "select top "+ rowsPerPage + " * "+afterFrom
			+" and id not in(select top "+rowsPerPage*(curPage-1)+" id "
			+afterFrom+" order by id desc)"+"order by id desc";
		
		return pageSql;
	}
	
	//MySql��ҳsql���
	public static String getPageMySQL(String sql,int curPage,int rowsPerPage){
		String pageSql = sql+" limit "+ (curPage-1)*rowsPerPage+","+rowsPerPage;
		return pageSql;
	}
	
	//Oracle��ҳsql���
	public static String getPageOracle(String sql,int curPage,int rowsPerPage){
		int begin = (curPage-1)*rowsPerPage;
		int end = begin + rowsPerPage;
		StringBuffer pagingSelect = new StringBuffer(100);
		pagingSelect.append("select * from ( select row_.*, rownum rownum_ from ( ");
		pagingSelect.append(sql);
		pagingSelect.append(" ) row_ where rownum <= "+end+") where rownum_ > "+begin);
		return pagingSelect.toString();
	}
	
	public static void main(String[] args){
		System.out.println(getPageMySQL("select * from customer",3,5));
	}
}
