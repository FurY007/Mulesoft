package net.codejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQliteDB {

	public static void main(String[] args) {
		String jdbcUrl = "jdbc:sqlite:/C:\\Users\\RAJDEEP GOGOI\\Desktop\\My\\sqlite\\sqlite-tools-win32-x86-3370200\\moviedb.db";
		try {
			Connection connection = DriverManager.getConnection(jdbcUrl);
			String sql = "SELECT * FROM movies";
			
			
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery(sql);
			
			while (result.next()) {
				String Name = result.getString("Name");
				String Actor = result.getString("Actor");
				String Actress = result.getString("Actress");
				String Director = result.getString("Director");
				String YearOfRelease = result.getString("YearOfRelease");

				
				System.out.println(Name + " | " + Actor + " | " + Actress + " | " + Director + " | " + YearOfRelease);
		
			}
		
		} catch (SQLException e) {
			System.out.println("Error connecting to SQlite Database");
			
			e.printStackTrace();
		}

	}

}
