package de.bender.data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Artikel {

    @Id
    private String artikelNummer;
    private String name;
    private String hersteller;
    private int stueckzahl;
    private int lagerplatz;
    private int bestellgrenze;

    public String getArtikelNummer() {
        return artikelNummer;
    }

    public void setArtikelNummer(String artikelNummer) {
        this.artikelNummer = artikelNummer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHersteller() {
        return hersteller;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public int getStueckzahl() {
        return stueckzahl;
    }

    public void setStueckzahl(int stueckzahl) {
        this.stueckzahl = stueckzahl;
    }

    public int getLagerplatz() {
        return lagerplatz;
    }

    public void setLagerplatz(int lagerplatz) {
        this.lagerplatz = lagerplatz;
    }

    public int getBestellgrenze() {
        return bestellgrenze;
    }

    public void setBestellgrenze(int bestellgrenze) {
        this.bestellgrenze = bestellgrenze;
    }
}
