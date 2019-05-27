package com.example.Db.Connectin.Util;

import org.hibernate.SessionFactory;

import java.io.File;

public class HibernateUtil {
    private static SessionFactory sessionFactory =BuildSessionFactory();

    public static SessionFactory BuildSessionFactory(){
        SessionFactory sessionFactory =new org.hibernate.cfg.Configuration()
                .configure(new File("src/main/resources/hibernate.cfg.xml"))
                .buildSessionFactory();
        return sessionFactory;
    }
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }

}
