package Proyecto1;
import java.sql.*;

public class PostgreSQLJDBC {
	public static void main(String args[]) {
		Connection c = null;
		Statement stmt = null;
		try {
			Class.forName("org.postgresql.Driver");
			c = DriverManager
					.getConnection("jdbc:postgresql://localhost:5432/First",
							"postgres", "");
			System.out.println("Opened database successfully");
			/*
			stmt = c.createStatement();
			String sql = "DROP TABLE COMPANY";
			stmt.executeUpdate(sql);
			stmt.close();
			c.close(); */
		} catch (Exception e) {
			System.err.println( e.getClass().getName()+": "+ e.getMessage() );
	        System.exit(0);
		}

	}

}