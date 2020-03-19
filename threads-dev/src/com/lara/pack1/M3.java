package com.lara.pack1;

class A extends Thread  //override method run()
{
	public void run()
	{
		for(int i =1; i <= 1000; i++)
		{
			System.out.println(i);
		}
	}
}
public class M3 {
	public static void main(String[] args) {
		A a1 = new A();
		a1.start();       // to start the thread..
		for(int i= 2000; i <= 3000; i++)
		{
			System.out.println(i);
		}
	}
}
