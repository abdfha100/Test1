package com.lara;

class A
{
	int i;
	
	void test1()
	{
		Thread t1 = Thread.currentThread();
		System.out.println("test1 begin:" + t1.getName() + ":" + i);
		synchronized(this)
		{
			for(int j=0; j <= 10; j++)
			{
				i +=2;
				System.out.println("loop" + t1.getName() + ":" + i + ":" + j);
				Util.sleep(1000);
			}
		}
		System.out.println("test1 end:" + t1.getName());
	}
	}

class A extends Thread
{
	A a1;
	C(A a1)
	{
		this.a1 = a1;
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
