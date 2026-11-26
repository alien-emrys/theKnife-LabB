package theknife;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.List;

/* Implementa le operazioni dell'interfaccia TheKnifeService
 * il server crea un oggetto di questo tipo e lo registra nel registry
 * RMI chiama poi i metodi di questo oggetto quando il client fa la richiesta.
 * 
 * Ogni metodo riceve una richiesta del client e la passa al DAO che se ne
 * occupa, e poi restituisce il risultato.
 * 
 * */

public class TheKnifeServiceImpl extends UnicastRemoteObject implements TheKnifeService {

	private final UtentiDAO utentiDAO = new UtentiDAO();
	private final PreferitiDAO preferitiDAO = new PreferitiDAO();
	
	public TheKnifeServiceImpl() throws RemoteException {
		super();
		
	}

	private static final long serialVersionUID = 1L;

	@Override
	public boolean registrazione(Utente utente, String password) throws RemoteException {
		
		try {
			return utentiDAO.registrazione(utente.getUsername(), utente.getNome(),utente.getCognome(), password, utente.getDataNascita(), utente.getIndirizzo(), utente.getCitta(), utente.getRuolo());
		}catch (SQLException e) {
	        throw new RemoteException("Errore del database: " + e.getMessage());
	    }

	}

	@Override
	public Utente login(String username, String password) throws RemoteException {
		
		try {
			return utentiDAO.login(username, password);
		}catch (SQLException e) {
	        throw new RemoteException("Errore del database: " + e.getMessage());
	    }
	}

	@Override
	public boolean eliminaAccount(String username) throws RemoteException {
		
		try {
			return utentiDAO.eliminaAccount(username);
		}catch (SQLException e) {
	        throw new RemoteException("Errore del database: " + e.getMessage());
	    }
	}

	@Override
	public List<Recensione> visualizzaRecensioni(int idRistorante) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Recensione> recensioniCliente(String cliente) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean aggiungiRecensione(Recensione recensione) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminaRecensione(String cliente, int idRistorante) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean aggiungiPreferito(String cliente, int idRistorante) throws RemoteException {
		try {
			return preferitiDAO.aggiungi(cliente, idRistorante);
		}catch (SQLException e) {
	        throw new RemoteException("Errore del database: " + e.getMessage());
	    }
	}

	@Override
	public boolean rimuoviPreferito(String cliente, int idRistorante) throws RemoteException {
		try {
			return preferitiDAO.rimuovi(cliente, idRistorante);
		}catch (SQLException e) {
	        throw new RemoteException("Errore del database: " + e.getMessage());
	    }
	}

	@Override
	public List<Ristorante> visualizzaPreferiti(String cliente) throws RemoteException {
		try {
			return preferitiDAO.visualizza(cliente);
		}catch (SQLException e) {
	        throw new RemoteException("Errore del database: " + e.getMessage());
	    }
	}

	@Override
	public List<Ristorante> cercaRistorante(CriteriRicerca criteri) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ristorante> ristorantiVicini(String citta) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ristorante visualizzaRistorante(int id) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean aggiungiRistorante(Ristorante ristorante) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminaRistorante(int id, String proprietario) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Ristorante> visualizzaRiepilogo(String proprietario) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean rispostaRecensioni(String proprietario, String cliente, int idRistorante, String testo)
			throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminaRisposta(String proprietario, String cliente, int idRistorante) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

}
