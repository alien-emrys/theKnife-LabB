package theknife;

import java.io.Serializable;
import java.time.LocalDate;


public class Utente implements Serializable {

    
    private static final long serialVersionUID = 1L;

    private String username;
    private String nome;
    private String cognome;
    private LocalDate dataNascita;
    private String indirizzo;
    private String citta;
    private String ruolo;

    public Utente() {
    }

    public Utente(String username, String nome, String cognome, LocalDate dataNascita,
                  String indirizzo, String citta, String ruolo) {
        this.username = username;
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.indirizzo = indirizzo;
        this.citta = citta;
        this.ruolo = ruolo;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public LocalDate getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(LocalDate dataNascita) {
        this.dataNascita = dataNascita;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public String getRuolo() {
        return ruolo;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }

    @Override
    public String toString() {
        return "Utente [username=" + username + ", nome=" + nome + ", cognome=" + cognome
                + ", dataNascita=" + dataNascita + ", indirizzo=" + indirizzo
                + ", citta=" + citta + ", ruolo=" + ruolo + "]";
    }
}