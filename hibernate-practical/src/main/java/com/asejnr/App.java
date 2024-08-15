package com.asejnr;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class App
{
    public static void main( String[] args )
    {
        Alien thanos = new Alien();
        thanos.setAid(106);
        thanos.setName("Black Panther");
        thanos.setColor("black");

        Configuration config = new Configuration().configure().addAnnotatedClass(Alien.class);

        StandardServiceRegistryBuilder registryBuilder = new StandardServiceRegistryBuilder().applySettings(config.getProperties());
        ServiceRegistry serviceRegistry = registryBuilder.build();
        SessionFactory sessionFactory = config.buildSessionFactory(serviceRegistry);
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(thanos);
        transaction.commit();
    }
}
