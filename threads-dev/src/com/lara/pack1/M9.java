package com.lara.pack1;

public class M9 {
	static class A extends Thread
	{
		public void run()
		{
			for(int i=1; i<=1000; i++)
			{
				System.out.println("&&&&&&&&&: " + i);
			}
		}
	}
	static class B implements Runnable
	{
		public void run()
		{
			for(int i =2000; i<=3000; i++)
			{
				System.out.println("#########: " + i);
			}
		}
	}
	public static void main(String[] args) {
		A a1 = new A();
		a1.start();
		
		Thread t1 = new Thread(new B());
		t1.start();
		
		for(int i= 4000; i<= 5000; i++)
		{
			System.out.println("@@@@@@@@@: " + i);
		}
	}
}
