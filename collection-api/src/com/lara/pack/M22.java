package com.lara.pack;

import java.util.Enumeration;
import java.util.Vector;

public class M22 {
	public static void main(String[] args) {
		Vector v1 = new Vector();
		v1.add(9000);
		v1.add(100);
		v1.add(90000);
		v1.add(9000);
		v1.add(0);
		Enumeration e1 = v1.elements();
		
		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}
		System.out.println("-------------------------------");
		System.out.println(v1);
		
		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}
		System.out.println("-------------------------------");
		System.out.println(v1);
	}
}

/*
 
9000
100
90000
9000
0
-------------------------------
[9000, 100, 90000, 9000, 0]

 

E:\JDK8.0>javap java.util.Enumeration
Compiled from "Enumeration.java"
public interface java.util.Enumeration<E> {
  public abstract boolean hasMoreElements();
  public abstract E nextElement();
} 
 
 has only one time reading... 
 
 */
 