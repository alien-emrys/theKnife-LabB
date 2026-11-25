package theknife;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/*interfaccia che contiene i metodi che il client chiama e che il server esegue (RMI)
 * il client tramite questa interfaccia sa cosa può chiedere di fare al server, senza sapere come lo fa.
 * lo stub quindi sarà di tipo TheKnifeService.
 * 
 * Estende Remote perché i suoi metodi possono essere chiamati in remoto dal client, tramite lo stub
 * 
 * RMI riceva la richiesta e chiama i metodi dell'oggetto registrato che è invece di tipo TheKnifeServiceImpl, dove 
 * i metodi sono effettivamente implementati*/

public interface TheKnifeService extends Remote {

    int PORTA = 1099;
    String NOME = "TheKnife";

    boolean registrazione(Utente utente, String password) throws RemoteException;

    Utente login(String username, String password) throws RemoteException;

    boolean eliminaAccount(String username) throws RemoteException;

    List<Recensione> visualizzaRecensioni(int idRistorante) throws RemoteException;

    List<Recensione> recensioniCliente(String cliente) throws RemoteException;

    boolean aggiungiRecensione(Recensione recensione) throws RemoteException;

    boolean eliminaRecensione(String cliente, int idRistorante) throws RemoteException;

    boolean aggiungiPreferito(String cliente, int idRistorante) throws RemoteException;

    boolean rimuoviPreferito(String cliente, int idRistorante) throws RemoteException;

    List<Ristorante> visualizzaPreferiti(String cliente) throws RemoteException;

    List<Ristorante> cercaRistorante(CriteriRicerca criteri) throws RemoteException;

    List<Ristorante> ristorantiVicini(String citta) throws RemoteException;

    Ristorante visualizzaRistorante(int id) throws RemoteException;

    boolean aggiungiRistorante(Ristorante ristorante) throws RemoteException;

    boolean eliminaRistorante(int id, String proprietario) throws RemoteException;

    List<Ristorante> visualizzaRiepilogo(String proprietario) throws RemoteException;

    boolean rispostaRecensioni(String proprietario, String cliente, int idRistorante, String testo)
            throws RemoteException;

    boolean eliminaRisposta(String proprietario, String cliente, int idRistorante) throws RemoteException;
}
