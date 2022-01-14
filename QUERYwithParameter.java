package Qwp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QUERYwithP {

	public static void main(String[] args) {
		String jdbcUrl = "jdbc:sqlite:/C:\\Users\\RAJDEEP GOGOI\\Desktop\\My\\sqlite\\sqlite-tools-win32-x86-3370200\\moviedb.db";
		try {
			Connection connection = DriverManager.getConnection(jdbcUrl);
			String sql = "SELECT Name FROM movies WHERE Actor ='Tom Hanks'";
			
			
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery(sql);
			
			while (result.next()) {
				String Name = result.getString("Name");

				
				System.out.println(Name);
		
			}
		
		} catch (SQLException e) {
			System.out.println("Error connecting to SQlite Database");
			
			e.printStackTrace();
		}

	}

}
