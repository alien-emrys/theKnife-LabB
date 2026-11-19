package theknife;

import java.util.Scanner;
import java.sql.*;

public class ServerTK {


	public static void main(String[] args) throws SQLException {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("ACCESSO AL DATABASE\n");
		System.out.print("Inserire host: ");	//localhost:numero_porta oppure indirizzo_ip:numero_porta
		String host = in.nextLine().trim().toLowerCase();
		System.out.print("\nInserire nome utente: "); // legge l'utente di PostgreSQL (di solito postgres)
		String utente = in.nextLine().trim();
		System.out.print("\nInserire password: ");
		String password = in.nextLine(); // legge la password (senza trim: potrebbe contenere spazi)
		
		DatabaseConnection.configura(host,utente,password);
		//Connection c = DatabaseConnection.getConnection();
	}

}
