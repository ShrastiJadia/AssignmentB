package AssignmentD.question2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Question2 {

	public static void main(String[] args) {
     String url="jdbc:mysql://localhost:3306/connectionPractise";
     String user="root";
     String pass="Shrasti@2705";
     Connection conn=null;
     Statement stmt=null;
     try {
    	 Class.forName("com.mysql.cj.jdbc.Driver");
    	 conn=DriverManager.getConnection(url,user,pass);
    	 stmt=conn.createStatement();
    	 String insert1="INSERT into Students values(9,'Shr',211,9.5)";
    	 String insert2="INSERT into Students values(10,'ciy',221,9.5)";
    	 String insert3="INSERT into Students values(11,'R',211,9)";
    	 stmt.executeUpdate(insert1);
    	 stmt.executeUpdate(insert2);
    	 stmt.executeUpdate(insert3);
  System.out.println("record insert suceesfuly");
    	  }
     catch (Exception e) {
    	 e.printStackTrace();
		// TODO: handle exception
	}
     finally {
		try {
			if(stmt!=null)
			{
				stmt.close();
			}
		 if (conn!=null) {
			conn.close();
		}
		} catch (Exception e2) {
              e2.printStackTrace();
		}
	}
   

	}

}
