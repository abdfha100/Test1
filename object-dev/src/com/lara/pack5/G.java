package com.lara.pack5;

public class G implements Cloneable 
{
	int i;
	public static void main(String[] args)
	throws CloneNotSupportedException
	{
		G obj1 = new G();
		obj1.i = 10;
		G obj2 = (G) obj1.clone();
		System.out.println("a:"  + obj2.i);
		obj2.i = 20;
		System.out.println("b:" + obj1.i);
		obj1.i = 30;
		System.out.println("c:" + obj2.i);
	}
}




/*

OP
----
a:10
b:10
c:20

 
 
 
what is Cloneable ?

it is interface available in java.lang.pack
 and it is marker interface.
  empty interface. no members.
  
  if object is clonable, then it is eligible for clone operations...
 
after cloining, both are independent objects..

cloining is deep copy opertiaon..
bocs the changes of one object is not reflecting in another object..

shallow copy operation opp to deep operation....
 
 */