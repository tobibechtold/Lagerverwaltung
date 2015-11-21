package de.bender.controller;

import de.bender.data.Artikel;
import de.bender.database.ArtikelService;
import de.bender.view.ArtikelUebersichtView;
import de.bender.view.ArtikelView;

import java.util.List;

public class ArtikelUebersichtController implements ArtikelController {

    public ArtikelService artikelService;

    public ArtikelUebersichtController()
    {
        artikelService = new ArtikelService();
        new ArtikelUebersichtView(this);
    }

    public List<Artikel> getArtikel()
    {
        return artikelService.getArtikel();
    }
}
