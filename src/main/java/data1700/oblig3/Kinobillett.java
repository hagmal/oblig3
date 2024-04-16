package data1700.oblig3;

public class Kinobillett {
    // Attributter for kinobilletten
    private String film;
    private String antall;
    private String fornavn;
    private String etternavn;
    private String telefonnr;
    private String epost;

    // Konstruktør for å opprette en kinobillett
    public Kinobillett(String film, String antall, String fornavn, String etternavn, String telefonnr, String epost) {
        this.film = film;
        this.antall = antall;
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.telefonnr = telefonnr;
        this.epost = epost;
    }

    // Tom konstruktør, for at man skal kunne bruke BeanPropertyRowMapper
    public Kinobillett() {}

    // Gettere og settere for attributtene
    public String getFilm() {
        return film;
    }

    public void setFilm(String film) {
        this.film = film;
    }

    public String getAntall() {
        return antall;
    }

    public void setAntall(String antall) {
        this.antall = antall;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public String getTelefonnr() {
        return telefonnr;
    }

    public void setTelefonnr(String telefonnr) {
        this.telefonnr = telefonnr;
    }

    public String getEpost() {
        return epost;
    }

    public void setEpost(String epost) {
        this.epost = epost;
    }
}
