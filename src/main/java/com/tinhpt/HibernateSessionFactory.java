package com.tinhpt;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateSessionFactory {
	
	private static SessionFactory sessionFactory;
	static {
		try {

			Configuration configuration = new Configuration();

			configuration.configure("src/main/resources/hibernate.cfg.xml");

			StandardServiceRegistryBuilder standardServiceRegistryBuilder = new StandardServiceRegistryBuilder();

			standardServiceRegistryBuilder.applySettings(configuration.getProperties());

			ServiceRegistry serviceRegistry = standardServiceRegistryBuilder.build();

			setSessionFactory(configuration.buildSessionFactory(serviceRegistry));
		} catch (HibernateException hex) {
			hex.printStackTrace();
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void setSessionFactory(SessionFactory sessionFactory) {
		HibernateSessionFactory.sessionFactory = sessionFactory;
	}

	public static void shutdown() {
		getSessionFactory().close();
	}
}
