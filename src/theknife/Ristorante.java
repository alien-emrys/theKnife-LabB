package theknife;

import java.io.Serializable;
import java.util.ArrayList;

public class Ristorante implements Serializable {
	
    /** Versione della classe per la serializzazione. */
    private static final long serialVersionUID = 1L;
    
    private int id;
    private String nome;
    private String nazione;
    private String citta;
    private String indirizzo;
    private double latidutine;
    private double longitudine;
    private int fascia;
    private boolean delivery;
    private boolean prenotazioniOnline;
    private String proprietario;
    private ArrayList <String> cucine;
    private int mediaStelle;
    private int numRecensioni;
    
    public Ristorante() {
    }
    
    public Ristorante(int id, String nome, String nazione, String citta, String indirizzo, double latitudine, double longitudine, int fascia, boolean delivery, boolean prenotazioniOnline, String proprietario, ArrayList <String> cucine, int mediaStelle, int numRecensioni) {
        this.id = id;
        this.nome = nome;
        this.nazione = nazione;
        this.citta = citta;
        this.indirizzo = indirizzo;
        this.latidutine = latitudine;
        this.longitudine = longitudine;
        this.fascia = fascia;
        this.delivery = delivery;
        this.prenotazioniOnline = prenotazioniOnline;
        this.proprietario = proprietario;
        this.cucine = cucine;
        this.mediaStelle = mediaStelle;
        this.numRecensioni = numRecensioni;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNazione() {
		return nazione;
	}

	public void setNazione(String nazione) {
		this.nazione = nazione;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public double getLatidutine() {
		return latidutine;
	}

	public void setLatidutine(double latidutine) {
		this.latidutine = latidutine;
	}

	public double getLongitudine() {
		return longitudine;
	}

	public void setLongitudine(double longitudine) {
		this.longitudine = longitudine;
	}

	public int getFascia() {
		return fascia;
	}

	public void setFascia(int fascia) {
		this.fascia = fascia;
	}

	public boolean isDelivery() {
		return delivery;
	}

	public void setDelivery(boolean delivery) {
		this.delivery = delivery;
	}

	public boolean isPrenotazioniOnline() {
		return prenotazioniOnline;
	}

	public void setPrenotazioniOnline(boolean prenotazioniOnline) {
		this.prenotazioniOnline = prenotazioniOnline;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public ArrayList<String> getCucine() {
		return cucine;
	}

	public void setCucine(ArrayList<String> cucine) {
		this.cucine = cucine;
	}

	public int getMediaStelle() {
		return mediaStelle;
	}

	public void setMediaStelle(int mediaStelle) {
		this.mediaStelle = mediaStelle;
	}

	public int getNumRecensioni() {
		return numRecensioni;
	}

	public void setNumRecensioni(int numRecensioni) {
		this.numRecensioni = numRecensioni;
	}

	@Override
	public String toString() {
		return "Ristorante [id=" + id + ", nome=" + nome + ", nazione=" + nazione + ", citta=" + citta + ", indirizzo="
				+ indirizzo + ", latidutine=" + latidutine + ", longitudine=" + longitudine + ", fascia=" + fascia
				+ ", delivery=" + delivery + ", prenotazioniOnline=" + prenotazioniOnline + ", proprietario="
				+ proprietario + ", cucine=" + cucine + ", mediaStelle=" + mediaStelle + ", numRecensioni="
				+ numRecensioni + "]";
	}
}