package com.lara;

import java.util.ArrayList;

public class ThreadPoolManager {
	private ArrayList<ModelThread> list = new ArrayList<ModelThread>(); // to store model thread objects
	
	public void init()
	{
		ModelThread md = null;
		for(int i=1; i<=10; i++)
		{
			md = new ModelThread();
			md.start();
			list.add(md);
		}
	}
	public ModelThread checkOut()
	{
		ModelThread md = null;
		if(list.size() > 0)
		{
			md = list.remove(0);
		}
		else
		{
			md = new ModelThread();
			md.start();
		}
		return md;
	}
	public void checkIn(ModelThread md)
	{
		if(list.size() < 10)
		{
			list.add(md);
		}
		else
		{
			md.stop();
		}
	}
	public void release()
	{
		ModelThread md = null;
		for(int i =0; i < list.size();)
		{
			md = list.remove(i);
			md.stop();
		}
	}
}



/*
 * it shld 5 memb
 * and 4 operaitons/
 * 
 * all model thred objects going to wait stage.
 * and its going its own self wait methd..
 * 
 * ex: md2.wait
 * ex: md3.wait....
 * 
 * selfwait() ging to wait stage...
 * 
 * 
 */