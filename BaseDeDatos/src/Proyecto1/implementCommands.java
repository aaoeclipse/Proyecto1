package Proyecto1;
import java.sql.*;

public class implementCommands implements CommandsSQL{
	Connection c = null;
	Statement statement = null;
	String sql = null;
	
	@Override
	public String SELECT(String name) {
		/**
		stmt = c.createStatement();
		String sql = "DROP TABLE COMPANY";
		stmt.executeUpdate(sql);
		stmt.close();
		c.close(); 
		**/
		return null;
	}

	@Override
	public boolean DROP(String name) {
		try {
			statement = c.createStatement();
			sql = "DROP TABLE "+name;
			statement.executeUpdate(sql);
			statement.close();
			c.close(); 
		} catch (SQLException e) {
			System.err.println( e.getClass().getName()+": "+ e.getMessage() );
			return false;
		}
		return true;
	}
	public boolean CREATETABLE (String name){
		try {
			statement = c.createStatement();
			sql = "CREATE TABLE "+name;
			statement.executeUpdate(sql);
			statement.close();
			c.close(); 
		} catch (SQLException e) {
			System.err.println( e.getClass().getName()+": "+ e.getMessage() );
			return false;
		}
		return true;
	}
	@Override
	public String CREATEDB(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean Connect() {
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
	        return false;
		}
		return true;
	}

}
