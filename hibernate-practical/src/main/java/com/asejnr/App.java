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
        Alien alien = new Alien();
//        alien.setAid(103);
//        alien.setName("IronMan");
//        alien.setColor("white");
//        alien.setAge(35);

        Configuration config = new Configuration().configure().addAnnotatedClass(Alien.class);

        StandardServiceRegistryBuilder registryBuilder = new StandardServiceRegistryBuilder().applySettings(config.getProperties());
        ServiceRegistry serviceRegistry = registryBuilder.build();
        SessionFactory sessionFactory = config.buildSessionFactory(serviceRegistry);
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(alien);

        // fetching data from db
//        alien = (Alien) session.get(Alien.class, 102);
        transaction.commit();

        System.out.println(alien);
}
}
