package com.lara.pack;

import java.util.ArrayList;
import java.util.Iterator;


public class M6 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(901);
		list.add(910);
		list.add(190);
		list.add(0);
		list.add(9);
		System.out.println(list); 
		Iterator it = list.iterator();
		while(it.hasNext()) // check whether element is there or not
		{
			System.out.print(it.next() + ", ");
			it.remove(); // readed and removed
		}
		System.out.println();
		System.out.println(list);
	}
}


/*
Iterator interface
------------------
E:\JDK8.0>javap java.util.Iterator
Compiled from "Iterator.java"
public interface java.util.Iterator<E> {
  public abstract boolean hasNext();
  public abstract E next();
  public void remove();
  public void forEachRemaining(java.util.function.Consumer<? super E>);
 
  
  Iterator is not contanier and it doestnot have any elements...
  it is just a pointer which is pointintg to ArrayList
  
  next() = reading the connet of the Array list
  it.remove() = removing the content form  ArrayList
  
  
  
  
  
  
 */