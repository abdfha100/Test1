package com.lara.pack1;

class D extends Thread
{
	public void run()
	{
		for(int i =1; i<= 1000; i++)
		{
			System.out.println(i);
		}
	}
}
public class M6 {
	public static void main(String[] args) {
		D d1 = new D();
		d1.start();
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		D d2 = new D();
		d2.start();
		for(int i =2000; i <=3000; i++)
		{
			System.out.println(i);
		}
	}
}

/*
NOTE
-------
main thread is parent.....which containing 3 child thread

*/