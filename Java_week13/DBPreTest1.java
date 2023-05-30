package java0530;
import java.sql.*;

public class DBPreTest1 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb","root","dongyang");
			//String inId = "2023003",name="전정국",dept="BTS"; 
			// 방식1
			/*
			Statement stmt = conn.createStatement();
			String sql = "insert into studenttbl(id,name,dept)"+
					"values('"+inId+"','"+name+"', '"+dept+"');";
			stmt.executeUpdate(sql);
			*/
			String inId = "2023004",inName="전정국",inDept="BTS"; 
			String sql = "insert into studenttbl(id,name,dept)value(?,?,?);";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, inId);
			pstmt.setString(2, inName);
			pstmt.setString(3, inDept);
			pstmt.executeUpdate();
			System.out.println("입력완료");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			System.out.println("db연결 에러");
		}
	}
}
