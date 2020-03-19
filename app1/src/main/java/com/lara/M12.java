package com.lara;

import org.hibernate.Session;

public class M12 {
	public static void main(String[] args) 
	{
		Session s1 = Util.getSession();
		Employee e1 = new Employee();
		e1.setEmpId(15);
		e1.setLastName("Changed last Name");
		s1.beginTransaction();
		s1.saveOrUpdate(e1);
		s1.getTransaction().commit();
		System.out.println("done");
	}
}
