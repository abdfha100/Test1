package com.lara;
class I
{
	synchronized void test1()
	{
		System.out.println("test1 begin by" + Thread.currentThread().getName());
		try
		{
			wait();
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("test1 end by " + Thread.currentThread().getName());
	}
	synchronized void test2()
	{
		System.out.println("test2 beging by " + Thread.currentThread().getName());
		//notify();
		notifyAll();
		System.out.println("test2 end by" + Thread.currentThread().getName());
	}
}
class J extends Thread
{
	I obj;
	J(I obj)
	{
		this.obj = obj;
	}
	public void run()
	{
		obj.test1();
	}
	
}
class K extends Thread
{
	I obj;
	K(I obj)
	{
		this.obj = obj;
	}
	public void run()
	{
		obj.test1();
	}
}
public class M4 {
	public static void main(String[] args) {
		I obj = new I();
		J j1 = new J(obj);
		K k1 = new K(obj);
		j1.start();
		k1.start();
		System.out.println("main going to sleep");
		Util.sleep(1000);
		System.out.println("main after sleep");
	}
}
