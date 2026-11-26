package theknife;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PreferitiDAO {

	public boolean aggiungi(String cliente, int idRistorante) throws SQLException {
		
		String query = "INSERT INTO Preferiti(cliente,ristorante) VALUES (?,?) "; 
		try(Connection c = DatabaseConnection.getConnection();
				PreparedStatement p = c.prepareStatement(query)){
			
			p.setString(1, cliente.toLowerCase());
			p.setInt(2, idRistorante);
			p.executeUpdate();
			return true;
			
		}catch(SQLException e) {
			if("23505".equals(e.getSQLState()) || "23503".equals(e.getSQLState())) {
				//23505: il ristorante e' gia' nei preferiti
				//23503: il ristorante o il cliente non esiste
					return false;
				}
			throw e;
		}
	}
	
	public boolean rimuovi(String cliente, int idRistorante) throws SQLException {
			
			String query = "DELETE FROM Preferiti WHERE cliente = ? AND ristorante = ?";
			try(Connection c = DatabaseConnection.getConnection();
					PreparedStatement p = c.prepareStatement(query)){
				p.setString(1, cliente.toLowerCase());
				p.setInt(2, idRistorante);
				int righe = p.executeUpdate();
				return righe>0;
			}
	}
	
	public List<Ristorante> visualizza(String cliente) throws SQLException {
		
		String query = "SELECT r.* FROM Preferiti p JOIN RistorantiTheKnife r "
			+"ON r.id = p.ristorante WHERE p.cliente = ? ORDER BY r.nome";
		List<Ristorante> lista = new ArrayList<>();
		
		try(Connection c = DatabaseConnection.getConnection();
				PreparedStatement p = c.prepareStatement(query)){
			
			p.setString(1, cliente.toLowerCase());
			
			try(ResultSet result = p.executeQuery()){
				while(result.next()) {
					Ristorante r = new Ristorante();
					r.setId(result.getInt("id"));
					r.setNome(result.getString("nome"));
					r.setNazione(result.getString("nazione"));
					r.setCitta(result.getString("citta"));
					r.setIndirizzo(result.getString("indirizzo"));
					r.setLatitudine(result.getDouble("latitudine"));
					r.setLongitudine(result.getDouble("longitudine"));
					r.setFascia(result.getInt("fascia"));
					r.setDelivery(result.getBoolean("delivery"));
					r.setPrenotazioneOnline(result.getBoolean("prenotazione_online"));
					r.setProprietario(result.getString("proprietario"));
					lista.add(r);
				}
			}
			
		}
		return lista;
	}
}
