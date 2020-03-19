package com.lara;

import java.io.Serializable;

import org.hibernate.Session;

public class M5 {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setEmpId(101);
		e1.setFirstName("Ramu");
		e1.setLastName("xyz");
		e1.setAge(22);
		e1.setEmail("r@r.com");
		
		Session s1 = Util.getSession();
		s1.beginTransaction();
		Serializable id = s1.save(e1);
		s1.getTransaction().commit();
		System.out.println("done with id" + id);
	}

}
