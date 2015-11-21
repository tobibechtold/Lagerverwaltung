package de.bender.database;

import de.bender.data.Artikel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.ArrayList;
import java.util.List;

public class ArtikelService {

    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    public void saveArtikel(Artikel artikel)
    {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(artikel);
        session.getTransaction().commit();
        session.close();
    }

    public List<Artikel> getArtikel()
    {
        List<Artikel> artikel = new ArrayList<Artikel>();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        artikel = session.createQuery("from Artikel").list();
        session.getTransaction().commit();
        session.close();

        return artikel;
    }

}
