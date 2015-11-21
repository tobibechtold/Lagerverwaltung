package de.bender.data;

public class ArtikelBuilder {

    private Artikel artikel;

    public ArtikelBuilder() {
        this.artikel = new Artikel();
    }

    public ArtikelBuilder artikelNummer(String artikelNummer)
    {
        artikel.setArtikelNummer(artikelNummer);
        return this;
    }

    public ArtikelBuilder name(String name)
    {
        artikel.setName(name);
        return this;
    }

    public ArtikelBuilder hersteller(String hersteller)
    {
        artikel.setHersteller(hersteller);
        return this;
    }

    public ArtikelBuilder stueckzahl(int stueckzahl)
    {
        artikel.setStueckzahl(stueckzahl);
        return this;
    }

    public ArtikelBuilder lagerplatz(int lagerplatz)
    {
        artikel.setLagerplatz(lagerplatz);
        return this;
    }

    public ArtikelBuilder bestellgrenze(int bestellgrenze)
    {
        artikel.setBestellgrenze(bestellgrenze);
        return this;
    }

    public Artikel build()
    {
        return artikel;
    }
}
