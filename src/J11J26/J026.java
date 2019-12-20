package J11J26;

import java.sql.*;






public class J026 {

	public static void main(String[] args) throws SQLException {
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/jdbc";
			String username="password";
			String password="password";
			conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/11","root","123456");
			stmt=conn.createStatement();
			String sql="select * from xx";
			rs=stmt.executeQuery(sql);
			System.out.println("id  |  name  |  sex  "
					+"  email    |  birthday");
			while (rs.next()) {
				int id=rs.getInt("id");
				String name=rs.getString("name");
				String sex=rs.getString("sex");
				String email=rs.getString("email");
				Date birthday=rs.getDate("birthday");
				System.out.println(id+"  |  "+name+"  |  "+sex+"  |  "+email+"  |  "+birthday);
				
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			if (rs !=null) {
				rs.close();
			}
			if (conn !=null) {
				conn.close();
			}
			if (stmt !=null) {
				stmt.close();
			}
		}

	}

}
