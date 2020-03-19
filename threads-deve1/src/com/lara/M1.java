package com.lara;
class A
{
	int i;
	void test1() // test1 is a non synchronized any thread can enter  in  the test1  but there is one synchronized block
	{
		Thread t1 = Thread.currentThread();
		System.out.println("test1 begins: " + t1.getName() + ":" + i);
		synchronized (this)
		{
			for(int j =0; j<= 10; j++)
			{
				i += 2;
				System.out.println("test1 end: " + t1.getName() + " : " + i + " : " + j);
			}
			System.out.println("test1 end: " + t1.getName() + ":" + i);
		}
	}
	synchronized void test2()
	{
		Thread t1 = Thread.currentThread();
		System.out.println("test2 begins: " + t1.getName() + " : " + i);
		for(int j= 0; j<=10; j++)
		{
			i +=2;
			System.out.println("test2 end: " + t1.getName() + " : " +  i + " : " + j);
		}
		System.out.println("test2 end: " + t1.getName() + " : " + i);
	}
}
class B extends Thread
{
	A a1;
	B (A a1)
	{
		this.a1 = a1;
	}
	public void run()
	{
		a1.test1();
	}
}
class C extends Thread
{
	A a1;
	C (A a1)
	{
		this.a1= a1;
	}
	public void run()
	{
		a1.test1();
	}
}
public class M1 {
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();
		B b1 = new B(a1);
		b1.start();
		
		C c1 = new C(a1);
		c1.start();
	}
}
