package com.lara.pack6;

public class Employee {
	String name;
	Job[]  jobs;
	
	Employee(String name, Job[] jobs)
	{
		this.name = name;
		this.jobs = jobs;
	}
	
	public class Iterator getIterator()
	{
		return new Iterator(jobs);
	}

public class Iterator {
	private int index; 
	Job[] jobs;
	Iterator(Job[] jobs)
	{
		this.jobs = jobs;
	}
	boolean hasMoreJobs()
	{
		return index < jobs.length;
	}
	Job nextJob()
	{
		return jobs[index ++];
	}
}