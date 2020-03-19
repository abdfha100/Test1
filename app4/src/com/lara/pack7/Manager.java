package com.lara.pack7;

public class Manager {
	int i;
	class A
	{
		
	}
	static class B
	{
		
	}
	public static void main(String[] args) {
		Manager mgr = new Manager();
		A a1 = mgr.new A();
		A a2 = new Manager().new A();
		B b1 = new B();
		B b2 = new Manager.B();
		System.out.println("done");
		System.out.println(mgr.i);
		System.out.println(new Manager().i);
	}
}

/*
done
0
0


notes:
------

 */