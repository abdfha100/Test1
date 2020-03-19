package com.lara.pack3;

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

/*
 it is taking care of job by creating an array.
 by using arary
 craitng multile objects for iteratror..
 index is alyways staitng frm zero
 
 
 
 */