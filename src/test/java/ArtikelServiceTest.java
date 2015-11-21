import de.bender.data.Artikel;
import de.bender.data.ArtikelBuilder;
import de.bender.database.ArtikelService;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class ArtikelServiceTest {

    @Test
    public void save_withValidArtikel_ShouldSave() {
        ArtikelBuilder artikelBuilder = new ArtikelBuilder();
        Artikel a = artikelBuilder
                .artikelNummer("1")
                .name("test")
                .hersteller("hersteller")
                .lagerplatz(13)
                .bestellgrenze(5)
                .stueckzahl(200)
                .build();

        ArtikelService adapter = new ArtikelService();
        adapter.saveArtikel(a);

    }

    @Test
    public void getArtikel_ShouldReturnAllArtikel() {
        ArtikelService service = new ArtikelService();
        List<Artikel> artikel = service.getArtikel();
        assertEquals(artikel.size(), 1);
    }
}