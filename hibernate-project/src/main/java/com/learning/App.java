package com.learning;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;



public class App 
{
    public static void main( String[] args )
    {
    	StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
    	SessionFactory factory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
    	
//    	Configuration config = new Configuration().configure().addAnnotatedClass(Laptop.class);
//    	SessionFactory sessionfactory = config.buildSessionFactory();

    	System.out.println("Session Opening");

    	Session session = factory.openSession();
    	session.beginTransaction();
    	
    	
    	 
    	
    	session.getTransaction().commit();  
    	session.close();
    }
}
