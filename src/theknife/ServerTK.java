package theknife;

import java.util.Scanner;
import java.sql.*;

public class ServerTK {


	public static void main(String[] args) throws SQLException {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("ACCESSO AL DATABASE\n");
		System.out.print("Inserire host: ");	//localhost:5432 (5432 è la porta che usa di solito postgre) oppure indirizzo_ip:numero_porta
		String host = in.nextLine().trim().toLowerCase();
		System.out.print("\nInserire nome utente: "); // legge l'utente di PostgreSQL (di solito postgres)
		String utente = in.nextLine().trim();
		System.out.print("\nInserire password: ");
		String password = in.nextLine(); // legge la password (senza trim: potrebbe contenere spazi)
		
		DatabaseConnection.configura(host,utente,password);
		
		try (Connection c = DatabaseConnection.getConnection()) {
		    System.out.println("Connessione al database riuscita!");
		} catch (SQLException e) {
		    System.out.println("Connessione non riuscita! \n" + e.getMessage());
		    return;
		}
	}

}
