package de.bender.view;

import de.bender.data.Artikel;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class ArtikelTableModel extends AbstractTableModel {

    private final List<Artikel> artikel;
    private String[] columnNames = {"Artikelnummer",
                                    "Name",
                                    "Hersteller",
                                    "Lagerplatz",
                                    "Stückzahl",
                                    "Bestellgrenze"};
    private Object[][] data;

    public ArtikelTableModel(List<Artikel> artikel)
    {
        this.artikel = artikel;
        this.data = getArtikelAsArray();
    }

    public int getRowCount() {
        return artikel.size();
    }

    public int getColumnCount() {

        return columnNames.length;
    }

    private Object[][] getArtikelAsArray()
    {
        Object[][] data = new Object[artikel.size()][6];

        for(int i = 0; i < artikel.size(); i++)
        {
            Artikel a = artikel.get(i);
            data[i][0] = a.getArtikelNummer();
            data[i][1] = a.getName();
            data[i][2] = a.getHersteller();
            data[i][3] =  a.getLagerplatz();
            data[i][4] = a.getStueckzahl();
            data[i][5] = a.getBestellgrenze();
        }

        return data;
    }

    @Override
    public String getColumnName(int column) {

        return columnNames[column];
    }

    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        return data[rowIndex][columnIndex];
    }
}
