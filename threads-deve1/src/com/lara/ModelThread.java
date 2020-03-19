package com.lara;

public class ModelThread extends Thread {
	public void run()
	{
		while(true)
		{
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
		
		//common tasks;
		for(int i =1; i<=10; i++)
		{
			System.out.println(i + ":" + getName());
			Util.sleep(1000);
		}
		
		synchronized (this)
		{
			notify();
		}
		
	}
}
}


/**
 * 
 *  3 taks
 *  ---------
 *  1 waijt
 *  2 comm taks
 *  3 and notify
 *   it is for eniter custonmmerss
 *   
 *   
 *   thesse 3 stpe shdl repet for every customer...
 *   
 *   
 */