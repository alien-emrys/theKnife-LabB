package theknife;

import java.sql.*;

public class DatabaseConnection {
	
	private static String url;
	private static String utente;
	private static String password;
	
	/** Costruttore privato: la classe ha solo metodi statici. */
	private DatabaseConnection() { }
	
	public static void configura(String host, String utente, String password) {
		
		 DatabaseConnection.url = "jdbc:postgresql://" + host + "/dbtk";
		 DatabaseConnection.utente = utente;
	     DatabaseConnection.password = password;
	}

	public static Connection getConnection() throws SQLException {
		
		return DriverManager.getConnection(url, utente, password);
	}

}
