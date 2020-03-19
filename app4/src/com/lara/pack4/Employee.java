package com.lara.pack4;

public class Employee {
	String name;
	Job[]  jobs;
	
	Employee(String name, Job[] jobs)
	{
		this.name = name;
		this.jobs = jobs;
	}
	
	Iterator getIterator()
	{
		return new Iterator(jobs);
	}
}