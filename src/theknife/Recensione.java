package theknife;

import java.io.Serializable;

public class Recensione implements Serializable {

    private static final long serialVersionUID = 1L;

    private String cliente;
    private int idRistorante;
    
    /*Nome del ristorante recensito. 
    
    *Questo dato non e' salvato nella tabella Recensioni, che contiene solo
    * l'id del ristorante. Serve per mostrare al cliente, nella schermata
    * delle sue recensioni, il nome del ristorante invece del suo numero.
    * 
    * Lo riempie il server quando legge le recensioni dal database, prendendo
    * il nome dalla tabella RistorantiTheKnife. Quando invece il cliente scrive
    * una nuova recensione, questo campo non serve e puo' restare null.
    * 
    * */
    
    private String nomeRistorante;
    private int stelle;
    private String testo;
    private String risposta;

    public Recensione() {
    }

    public Recensione(String cliente, int idRistorante, String nomeRistorante, int stelle,
                      String testo, String risposta) {
        this.cliente = cliente;
        this.idRistorante = idRistorante;
        this.nomeRistorante = nomeRistorante;
        this.stelle = stelle;
        this.testo = testo;
        this.risposta = risposta;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getIdRistorante() {
        return idRistorante;
    }

    public void setIdRistorante(int idRistorante) {
        this.idRistorante = idRistorante;
    }

    public String getNomeRistorante() {
        return nomeRistorante;
    }

    public void setNomeRistorante(String nomeRistorante) {
        this.nomeRistorante = nomeRistorante;
    }

    public int getStelle() {
        return stelle;
    }

    public void setStelle(int stelle) {
        this.stelle = stelle;
    }

    public String getTesto() {
        return testo;
    }

    public void setTesto(String testo) {
        this.testo = testo;
    }

    public String getRisposta() {
        return risposta;
    }

    public void setRisposta(String risposta) {
        this.risposta = risposta;
    }

    @Override
    public String toString() {
        return "Recensione [cliente=" + cliente + ", idRistorante=" + idRistorante
                + ", nomeRistorante=" + nomeRistorante + ", stelle=" + stelle
                + ", testo=" + testo + ", risposta=" + risposta + "]";
    }
}