package com.lara.pack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class M14 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(901);
		list.add(910);
		list.add(190);
		list.add(0);
		list.add(9);
		System.out.println(list); 
		ListIterator it = list.listIterator();  // it is extending to Iterator. it has more methods..
		
		while(it.hasNext())
		{
			System.out.print(it.next() + ", ");
		}
		System.out.println();
		System.out.println("---------------------------");
		
		while(it.hasPrevious())
		{
			System.out.print(it.previous() + ", ");
		}
		System.out.println();
		
		System.out.println(list);
	}
}


/*

[90, 901, 910, 190, 0, 9]
90, 901, 910, 190, 0, 9, 
---------------------------
9, 0, 190, 910, 901, 90, 
[90, 901, 910, 190, 0, 9] 
 

E:\JDK8.0>javap java.util.ListIterator
Compiled from "ListIterator.java"
public interface java.util.ListIterator<E> extends java.util.Iterator<E> {
  public abstract boolean hasNext();
  public abstract E next();
  public abstract boolean hasPrevious();
  public abstract E previous();
  public abstract int nextIndex();
  public abstract int previousIndex();
  public abstract void remove();
  public abstract void set(E);
  public abstract void add(E);
}
 
 
 
 */
