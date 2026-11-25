package theknife;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

//ciao
public class CriteriRicerca implements Serializable {
	
    /** Versione della classe per la serializzazione. */
    private static final long serialVersionUID = 1L;
     
    private String nazione;
    private String citta;
    private List <String> cucine = new ArrayList<>();
    private Integer prezzoMin;
    private Integer prezzoMax;
    private boolean soloDelivery;
    private boolean soloPrenotazione;
    private Integer stelleMin;
    
    public CriteriRicerca() {
    	
    }
    
    public CriteriRicerca(String nazione, String citta, List <String> cucine, Integer prezzoMin, Integer prezzoMax, boolean soloDelivery, boolean soloPrenotazione, Integer stelleMin) {
        this.nazione = nazione;
    	this.citta = citta;
        this.cucine = cucine;
        this.prezzoMin = prezzoMin;
        this.prezzoMax = prezzoMax;
        this.soloDelivery = soloDelivery;
        this.soloPrenotazione = soloPrenotazione;
        this.stelleMin = stelleMin;
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

	public List<String> getCucine() {
		return cucine;
	}

	public void setCucine(List<String> cucine) {
		this.cucine = cucine;
	}

	public Integer getPrezzoMin() {
		return prezzoMin;
	}

	public void setPrezzoMin(Integer prezzoMin) {
		this.prezzoMin = prezzoMin;
	}

	public Integer getPrezzoMax() {
		return prezzoMax;
	}

	public void setPrezzoMax(Integer prezzoMax) {
		this.prezzoMax = prezzoMax;
	}

	public boolean isSoloDelivery() {
		return soloDelivery;
	}

	public void setSoloDelivery(boolean soloDelivery) {
		this.soloDelivery = soloDelivery;
	}

	public boolean isSoloPrenotazione() {
		return soloPrenotazione;
	}

	public void setSoloPrenotazione(boolean soloPrenotazione) {
		this.soloPrenotazione = soloPrenotazione;
	}

	public Integer getStelleMin() {
		return stelleMin;
	}

	public void setStelleMin(Integer stelleMin) {
		this.stelleMin = stelleMin;
	}

	@Override
	public String toString() {
		return "CriteriRicerca [nazione= " + nazione + ", citta=" + citta + ", cucine=" + cucine + ", prezzoMin=" + prezzoMin
				+ ", prezzoMax=" + prezzoMax + ", soloDelivery=" + soloDelivery + ", soloPrenotazione="
				+ soloPrenotazione + ", stelleMin=" + stelleMin + "]";
	}
	

}
