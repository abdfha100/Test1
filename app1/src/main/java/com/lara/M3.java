package com.lara;

import org.hibernate.Session;

public class M3 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();
		System.out.println(s1);
	}
}
