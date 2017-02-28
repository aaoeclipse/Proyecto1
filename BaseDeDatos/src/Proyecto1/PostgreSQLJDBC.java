package Proyecto1;


public class PostgreSQLJDBC {
	
	public static void main(String args[]) {
		CommandsSQL impl = new implementCommands();
		impl.Connect("postgres", "");
		impl.SELECT("nombre","estudiante");
	}
}