//import lib.postgresql.org.Driver;

import java.sql.*;

public class Main{
	public static Connection getCon(){
Connection con = null;
		try{
			Class.forName("org.mariadb.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mariadb://localhost/TESTE2","root","12345");
		} catch(Exception e){
			System.out.println("erro:"+e);
		}
		return con;
	}
	public static void main(String[] args){
		System.out.println(getCon());
	}
}
