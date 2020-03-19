package com.lara;

import org.hibernate.Session;

public class M7 {

	public static void main(String[] args) 
	{
		Session s1 = Util.getSession();
		Employee e1 = (Employee) s1.get(Employee.class, 3);
		System.out.println(e1.getEmpId());
		System.out.println(e1.getFirstName());
		System.out.println(e1.getLastName());
		System.out.println(e1.getAge());
		System.out.println(e1.getEmail());
		// TODO Auto-generated method stub
	}

}
