package com.lara.pack7;

public class M3 {
	class A
	{
		
	}
	static class B
	{
		
	}
	public static void main(String[] args) {
		//A a1 = new A();
		B b1 = new B();
		System.out.println("done");
	}
}

/*
 Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	No enclosing instance of type M3 is accessible. Must qualify the allocation with an enclosing instance of type M3 (e.g. x.new A() where x is an instance of M3).

	at com.lara.pack7.M3.main(M3.java:13)

notes:
------
cla-A is non stiac mmber and hence commenting..

cls -B is a staic mmber..


now run success

OP
--
done


 
 */