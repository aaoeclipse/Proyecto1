package Proyecto1;


public class PostgreSQLJDBC {
	
	public static void main(String args[]) {
		implementCommands impl = new implementCommands();
		if (impl.Connect())
			System.out.println("success");
		
	}
}