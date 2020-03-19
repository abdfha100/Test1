package com.lara.pack2;

public class Employee {
	String name;
	Job[]  jobs;
	private int index;
	
	Employee(String name, Job[] jobs)
	{
		this.name = name;
		this.jobs = jobs;
	}
	
	//Employee(String s, array[] )
	
	boolean hasMoreJobs()
	{
		if(index == jobs.length)
		{
			index =0;
			return false;
		}
		return true;
	}
	
	Job nextJob()
	{
		return jobs[index ++];
	}
}
