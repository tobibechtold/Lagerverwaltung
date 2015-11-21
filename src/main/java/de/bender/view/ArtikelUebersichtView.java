package de.bender.view;

import de.bender.controller.ArtikelController;
import de.bender.controller.ArtikelUebersichtController;

import javax.swing.*;

public class ArtikelUebersichtView extends JFrame implements ArtikelView {

    private ArtikelUebersichtController controller;


    private JTable tableUebersicht;

    public ArtikelUebersichtView(ArtikelUebersichtController controller)
    {
        this.controller = controller;
        init();
    }

    private void init() {
        add(getTableUebersicht());
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public JTable getTableUebersicht() {
        if(tableUebersicht == null)
        {
            tableUebersicht = new JTable(new ArtikelTableModel(controller.getArtikel()));
        }
        return tableUebersicht;
    }

}
