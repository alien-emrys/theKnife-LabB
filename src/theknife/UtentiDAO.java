package theknife;

import java.sql.*;

import java.time.LocalDate;

public class UtentiDAO {

	public boolean registrazione(String username,String nome,String cognome,String password,LocalDate dataNascita,
			String indirizzo,String citta,String ruolo) throws SQLException{
		
		String query = "INSERT INTO Utenti (username,nome,cognome,password,data_nascita,indirizzo,citta,ruolo) "
				+ "VALUES (?,?,?,?,?,?,?,?)";
		
		try(Connection c = DatabaseConnection.getConnection();
				PreparedStatement p = c.prepareStatement(query)){
			
			p.setString(1, username.toLowerCase());
			p.setString(2, nome.toLowerCase());
			p.setString(3, cognome.toLowerCase());
			p.setString(4, CifraPassword.cifra(password));
			p.setObject(5, dataNascita); //si usa setObject così se dataNascita è null non da problemi
			p.setString(6, indirizzo.toLowerCase());
			p.setString(7, citta.toLowerCase());
			p.setString(8, ruolo.toLowerCase());
			
			p.executeUpdate(); //esegue la query.
			return true;
			
		}catch(SQLException e) {
			
			if("23505".equals(e.getSQLState()) || "23503".equals(e.getSQLState())) {
			//23505: valore gia' presente
			//23503: riferimento a una riga che non esiste 
				return false;
			}
			
				throw e;
		}
	}
	
	public Utente login(String username,String password) throws SQLException{
		
		String query = "SELECT * FROM Utenti WHERE username = ? AND password = ?";
		
		try (Connection c = DatabaseConnection.getConnection();
				PreparedStatement p = c.prepareStatement(query)){
			
			p.setString(1, username.toLowerCase());
			p.setString(2, CifraPassword.cifra(password));
			
			try(ResultSet r = p.executeQuery()) { //result set contiene le righe trovate dalla select
				
				if(r.next()) { //si fa perchè all'inizio resultset non punta a nessuna riga, questo lo sposta sulla prima
				//da true se esiste la riga, altrimenti false.
					
					Utente utente = new Utente();
					utente.setUsername(r.getString("username"));
					utente.setNome(r.getString("nome"));
					utente.setCognome(r.getString("cognome"));
					utente.setDataNascita(r.getObject("data_nascita",LocalDate.class));
					utente.setIndirizzo(r.getString("indirizzo"));
					utente.setCitta(r.getString("citta"));
					utente.setRuolo(r.getString("ruolo"));
					
					return utente;
				}
					return null;
			}	
		}
	}
		
	public boolean eliminaAccount(String username,String password) throws SQLException{
		
		String query = "DELETE FROM Utenti WHERE username = ? AND password = ?";
		try(Connection c = DatabaseConnection.getConnection();
				PreparedStatement p = c.prepareStatement(query)){
			
			p.setString(1, username.toLowerCase());
			p.setString(2, CifraPassword.cifra(password));
			int righe = p.executeUpdate(); //esegue la query e restituisce quante righe ha modificato.
			return righe>0;
			// 1 true: ha trovato l'utente con quello username e quella password e l'ha cancellato;
			// 0 false: nessuna riga corrisponde (username inesistente o password sbagliata), quindi non ha cancellato niente.
		}
		
	}
	
}
