package com.lara;

class Shared
{
	synchronized void test1(Shared obj)
	{
		System.out.println("test1 started by" + Thread.currentThread().getName());
		Util.sleep(1000);
		System.out.println("after sleep in test1");
		//obj.test2(this);
		this.test2(obj);
		System.out.println("test1 started by " + Thread.currentThread().getName());
	}
	
	synchronized void test2(Shared obj)
	{
		System.out.println("test2 started by" + Thread.currentThread().getName());
		Util.sleep(1000);
		System.out.println("after sleep in test2");
		//obj.test2(this);
		this.test1(obj);
		System.out.println("test2 started by " + Thread.currentThread().getName());
	}
}

class G extends Thread
{
	Shared s1, s2;
	G(Shared s1, Shared s2)
	{
		this.s1 = s1;
		this.s2 = s2;
	}
	public void run()
	{
		s1.test1(s2);
	}
}
class H extends Thread
{
	Shared s1, s2;
	H(Shared s1, Shared s2)
	{
		this.s1 = s1;
		this.s2 = s2;
	}
	public void run()
	{
		s2.test2(s1);
	}
}

public class M3 {
	public static void main(String[] args) {
		Shared s1 = new Shared(), s2= new Shared();
		G g1 = new G(s1, s2);
		g1.start();
		Util.sleep(50);
		H h1 = new H(s1, s2);
		h1.start();
		System.out.println("main end");
	}
}
