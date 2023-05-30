import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConn {
	public static Connection dbConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb1","root","dongyang");
			System.out.println("입력완료");
			return conn;
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			System.out.println("db연결 에러");
			return null;
		}
	}
}
