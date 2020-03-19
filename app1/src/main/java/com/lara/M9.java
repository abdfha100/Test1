package com.lara;

import org.hibernate.Session;

public class M9 {
	public static void main(String[] args) 
	{
		Session s1 = Util.getSession();
		Employee e1 = (Employee) s1.load(Employee.class, 3);
		e1.setLastName("Changed lastName");
		s1.beginTransaction();
		s1.update(e1);
		s1.getTransaction().commit();
		System.out.println("done");
	}
}
