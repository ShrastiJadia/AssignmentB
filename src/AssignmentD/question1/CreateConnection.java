package AssignmentD.question1;

import java.sql.*;

public class CreateConnection {
	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/connectionPractise";
		String username = "root";
		String pass = "Shrasti@2705";
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, username, pass);
			if (conn != null) {
				System.out.println("Connection is successfull");
			} else {
				System.out.println("unable to connect");
			}
		} catch (Exception e) {
			System.out.println("unable to connect ");
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}

		}
	}
}
