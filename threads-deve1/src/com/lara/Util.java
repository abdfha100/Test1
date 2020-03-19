package com.lara;

public class Util {
	static void sleep(long milli)
			{
				try
				{
					Thread.sleep(1000);
					
				}
				catch(InterruptedException ex)
				{
					ex.printStackTrace();
				}
			}
}