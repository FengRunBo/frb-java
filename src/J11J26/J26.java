package J11J26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class J26 {

	public static void main(String[] args) throws ClassCastException,Exception{
		// TODO 自动生成的方法存根
		Class.forName("com.mysql.jdbc.Driver");
		Connection Conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/11","root","123456");
		Statement yuju=Conn.createStatement();
		String sql="UPDATE xx SET email = 'jack@qq.com' WHERE id=1";
		yuju.execute(sql);
	}
}
