package com.lara;
class L extends Thread
{
	@Override
	public synchronized void run()
	{
		System.out.println("L thread started");
		try 
		{
			wait();
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("L thread finished");
	}
}

class M extends Thread
{
	@Override
	public void run()
	{
		System.out.println("M thread started");
		synchronized (this)
		{
			try
			{
				wait();
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
		}
		System.out.println("M thread fisnished");
	}
}

public class M5 {
	public static void main(String[] args) {
		L obj1 = new L();
		obj1.start().
		
		M obj1 = new M();
		obj2.start();
		
		System.out.println("main is going gor sleep for 20s");
		Util.sleep(20000);
		System.out.println("main returned from sleep");
		synchronized (obj1)
		{
			obj1.notify();
		}
		Util.sleep(10);
		synchronized (obj2)
		{
			obj1.notify();
		}
		System.out.println("main end");
	}

}


/*
 * 
 * 
 * 
 * cls commn taks of multupele cutomer need to dveop a thread
 * managne mul obje 4 operation
 * 2ns cls 4 oepraiton chekc in and checke out
 * 
 * 2 clssse to deoo thrd pool
 *  
 */
*/