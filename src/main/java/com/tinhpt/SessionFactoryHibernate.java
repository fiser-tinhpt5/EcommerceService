package com.tinhpt;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

/**
 * @author tinhpt5
 * @version 1.0 21-11-2015
 */

public class SessionFactoryHibernate {

	private final SessionFactory sessionFactory = getSessionFactory();
	private Session session = sessionFactory.openSession();

	public Session getSession() {
		return session;
	}

	private SessionFactory getSessionFactory() {
		Configuration configuration = new Configuration();
		configuration.configure("src/main/java/hibernate.cfg.xml");
		return new AnnotationConfiguration().configure().buildSessionFactory();
	}

}
