package com.lara;

public class Customer1 extends Thread {
	private ThreadPoolManager tpm;
	public Customer1(ThreadPoolManager tpm)
	{
		this.tpm = tpm;
	}
	
	public void run()
	{
		while(true)
		{
			ModelThread md = tpm.checkOut();
			System.out.println("customer using: " + md.getName());
			synchronized (md)
			{
				md.notify();
			}
			try
			{
				synchronized (md)
				{
					md.wait();
				}
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
			System.out.println("usage got over");
			tpm.checkIn(md);
			Util.sleep(2000);
		}
	}
}
