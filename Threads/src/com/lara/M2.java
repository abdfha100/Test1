package com.lara;

class D
{
	static void test1()
	{
		System.out.println("test1 begin");
		synchronized(D.class)
		{
			Thread t1= Thread.currentThread();
			for(int i =0; i <= 20; i++)
			{
			System.out.println("test1:" + t1.getName() + ":" + i);
			Util.sleep(1000);
		}
	}
	System.out.println("test1 end");
   }
	static void test2()
	{
		Thread t1= Thread.currentThread();
		for(int i =0; i <= 20; i++)
		{
			System.out.println("test1:" + t1.getName() + ":" + i);
			Util.sleep(1000);
		}
	}
}

class E extends Thread
{
	D obj;
	E(D obj)
	{
		this.obj = obj;
	}
	public void run()
	{
		obj.test1();
	}
}
	
	
class F extends Thread
{
	D obj;
	F(D obj)
	{
		this.obj = obj;
	}
	public void run()
	{
		obj.test2();
	}
}
public class M2{
	public static void main(String[] args) {
		D d1 = new D();
		D d2 = new D();
		
		E e1 = new E(d1);
		F f1 = new F(d2);
		e1.start();
		f1.start();
	}
}