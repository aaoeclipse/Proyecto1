package Proyecto1;

public interface CommandsSQL {
	public boolean Connect();
	public String SELECT(String name);
	public boolean DROP(String name);
	public boolean CREATETABLE (String name);
	public String CREATEDB(String name);
}
