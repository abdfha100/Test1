package com.lara;

import org.hibernate.Session;

public class M4 {

	public static void main(String[] args) 
	{
		Person p1 = new Person ();
		p1.setPersonId(102);
		p1.setFirstName("Ramu");
		p1.setLastName("xyz");
		
		Session s1 = Util.getSession();
		s1.beginTransaction();
		s1.save(p1);
		s1.getTransaction().commit();
		System.out.println("done");
	}
}