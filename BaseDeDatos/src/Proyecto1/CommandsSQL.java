package Proyecto1;

public interface CommandsSQL {
	public boolean Connect(String username, String password);
	public boolean SELECT(String select,String fromTable);
	public boolean DROP(String name);
	public boolean CREATETABLE (String name);
	public String CREATEDB(String name);
}
