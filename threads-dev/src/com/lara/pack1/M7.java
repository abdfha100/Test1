package com.lara.pack1;

class E extends Thread
{
	public void run()
	{
		for(int i=1; i<=1000; i++)
		{
			System.out.println("$$$$$$$$$" + i);
		}
	}
}

class F extends Thread
{
	public void run()
	{
		for(int i =2000; i<=3000; i++)
		{
			System.out.println("###########" + i);
		}
	}
}

public class M7 {
	public static void main(String[] args) {
		E e1 = new E();
		e1.start();
		
		F f1 = new F();
		f1.start();
		
		for(int i=3000; i<=4000; i++)
		{
			System.out.println("@@@@@@@@@@" + i);
		}
	}
}
