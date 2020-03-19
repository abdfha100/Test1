package com.lara;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Util 
{
	private static SessionFactory factory;
	
	static
	{
		Configuration cfg = new Configuration();
		cfg.setProperty("hibernate.dialect", "org.hibernate.dialect.OracleDialect");
		cfg.setProperty("hibernate.connection.driver_class", "oracle.jdbc.driver.OracleDriver");
		cfg.setProperty("hibernate.connection.url", "jdbc:oracle:thin:@localhost:1521:XE");
		cfg.setProperty("hibernate.connection.username", "system");
		cfg.setProperty("hibernate.connection.password", "Lara123");
		cfg.setProperty("hibernate.hbm2ddl.auto", "none");
		cfg.setProperty("hibernate.show_sql", "true");
		cfg.addAnnotatedClass(Person.class);
		cfg.addAnnotatedClass(Employee.class);
		
		factory = cfg.buildSessionFactory();
	}

	public static Session getSession() 
	{
		return factory.openSession();
	}
}