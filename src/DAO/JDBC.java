package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

// DAO: DATA ACCESS OBJECT
//JDBC: JAVA DATABASE CONNECTIVITY
public class JDBC {
	
	String URL = "jdbc:mysql://localhost/mvc";
	String driver= "com.mysql.cj.jdbc.Driver";
	String user = "root";
	String password="";
	
	//Import java connection (api java.sql) 
	public Connection co= null;	
	public Statement sta=null;
	
	// Methode contenant l'essemble des actions à réaliser
	public void connect() {
		
	//Gerer les erreurs( exceptions)
	try {
	//1 etape: chargement du driver avec la methode Forname
	Class.forName(driver);
		
	//2 etape: Connection à la base		
	co=DriverManager.getConnection(URL,user,password);
	
	//3 etape: Statement 
	sta=co.createStatement();
		
	}
	// si le try ne marche pas la machine va utiliser le catch
	catch(Exception e) {
	e.printStackTrace();
	
	}
		
	}

}
