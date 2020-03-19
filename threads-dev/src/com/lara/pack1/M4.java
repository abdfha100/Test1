package com.lara.pack1;
class B extends Thread
{
	public void run()
	{
		for(int i=1; i<=1000; i++)
		{
			System.out.println(i);
		}
	}
}
public class M4 {
	public static void main(String[] args) {
		B b1 = new B();
		b1.run();
		for(int i=2000; i <=3000; i++)
		{
			System.out.println(i);
		}
	}
}
