package com.chouguleindustries.hibernate.bird;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryUtil {

	private static SessionFactory factory;

	public static SessionFactory getFactory() {
		if (factory != null && factory.isClosed()) {
			throw new IllegalStateException("Closed SessionFactory,correct code");

		}
		return factory;
	}

	static {
		try {
			System.out.println("SessionFactory STRATED");
			Configuration config = new Configuration().configure();
			factory = config.buildSessionFactory();
			System.out.println("SessionFactory COMPLETED");
		} catch (HibernateException e) {
			System.out.println("Static Block session factory error");
			e.printStackTrace();
		}
	}

}
