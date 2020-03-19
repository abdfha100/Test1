package com.lara;

import org.hibernate.Session;

public class M15 {
	public static void main(String[] args) 
	{
		Session s1 = Util.getSession();
		Employee e1 = new Employee();
		e1.setEmpId(13);
		e1.setFirstName("hello");
		e1.setLastName("check");
		e1.setAge(33);
		e1.setEmail("c@c.com");
		
		s1.beginTransaction();
		s1.persist(e1);
		s1.getTransaction().commit();
		System.out.println("done");
	}

}
