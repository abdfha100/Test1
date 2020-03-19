package com.lara.pack4;

public class Iterator {
	private static int index;  //changed to static. it w
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
 
 it will exitec one time,
 bcos staitic mmebers are laind only one time into the momory..
 it load to the memory only one time...
 
 without static it will bcome objc of the iterator..
 
 
 */