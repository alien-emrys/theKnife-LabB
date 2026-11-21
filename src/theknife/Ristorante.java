package theknife;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;

public class Ristorante implements Serializable {
	
    /** Versione della classe per la serializzazione. */
    private static final long serialVersionUID = 1L;
    
    private int id;
    private String nome;
    private String nazione;
    private String citta;
    private String indirizzo;
    private double latitudine;
    private double longitudine;
    private int fascia;
    private boolean delivery;
    private boolean prenotazioneOnline;
    private String proprietario;
    private List <String> cucine = new ArrayList<>();
    private double mediaStelle;
    private int numeroRecensioni;
    
    public Ristorante() {
    }
    
    public Ristorante(int id, String nome, String nazione, String citta, String indirizzo, double latitudine, double longitudine, int fascia, boolean delivery, boolean prenotazioneOnline, String proprietario, List <String> cucine, double mediaStelle, int numeroRecensioni) {
        this.id = id;
        this.nome = nome;
        this.nazione = nazione;
        this.citta = citta;
        this.indirizzo = indirizzo;
        this.latitudine = latitudine;
        this.longitudine = longitudine;
        this.fascia = fascia;
        this.delivery = delivery;
        this.prenotazioneOnline = prenotazioneOnline;
        this.proprietario = proprietario;
        this.cucine = cucine;
        this.mediaStelle = mediaStelle;
        this.numeroRecensioni = numeroRecensioni;
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

	public double getLatitudine() {
		return latitudine;
	}

	public void setLatitudine(double latitudine) {
		this.latitudine = latitudine;
	}

	public double getLongitudine() {
		return longitudine;
	}

	public void setLongitudine(double longitudine) {
		this.longitudine = longitudine;
	}
	
	public static int fasciaDaPrezzo(int prezzo) {
		if (prezzo < 15) {
			return 1;
		} else if (prezzo < 30) {
			return 2;
		} else if (prezzo < 60) {
			return 3;
		} else {
			return 4;
		}
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

	public boolean isprenotazioneOnline() {
		return prenotazioneOnline;
	}

	public void setprenotazioneOnline(boolean prenotazioneOnline) {
		this.prenotazioneOnline = prenotazioneOnline;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public List<String> getCucine() {
		return cucine;
	}

	public void setCucine(List<String> cucine) {
		this.cucine = cucine;
	}

	public double getMediaStelle() {
		return mediaStelle;
	}

	public void setMediaStelle(double mediaStelle) {
		this.mediaStelle = mediaStelle;
	}

	public int getnumeroRecensioni() {
		return numeroRecensioni;
	}

	public void setnumeroRecensioni(int numeroRecensioni) {
		this.numeroRecensioni = numeroRecensioni;
	}

	@Override
	public String toString() {
		return "Ristorante [id=" + id + ", nome=" + nome + ", nazione=" + nazione + ", citta=" + citta + ", indirizzo="
				+ indirizzo + ", latitudine=" + latitudine + ", longitudine=" + longitudine + ", fascia=" + fascia
				+ ", delivery=" + delivery + ", prenotazioneOnline=" + prenotazioneOnline + ", proprietario="
				+ proprietario + ", cucine=" + cucine + ", mediaStelle=" + mediaStelle + ", numeroRecensioni="
				+ numeroRecensioni + "]";
	}
}