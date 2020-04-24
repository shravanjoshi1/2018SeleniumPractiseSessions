import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded");
		 DriverManager.getConnection("jdbc://mysql://localhost:3306/selenium","root","Dhruv-0115");
		System.out.println("Connected to MySQL Database");
		
		
	}

}
