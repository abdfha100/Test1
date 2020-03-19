package com.lara.pack3;

public class Manager {
	public static void main(String[] args) {
		Job j1 = new Job("software", 50000);
		Job j2 = new Job("hardware", 10000);
		Job j3 = new Job("hr", 20000);
		Job j4 = new Job("sales", 5000);
		Job j5 = new Job("marketing", 6000);
		Job[] jobs = {j1, j2, j3, j4, j5};
		
		Employee emp = new Employee("vijay", jobs);
		
		System.out.println("print first time:");
		Job currentJob;
		Iterator it = emp.getIterator(); // inital one ieteroar and iraing all the jobs
		while(it.hasMoreJobs())
		{
			currentJob = it.nextJob();
			System.out.println(currentJob.title + ":"  + currentJob.salary);
		}
		
		System.out.println("print second time:");
		it = emp.getIterator(); // one more new itraiotr job again and all five jobbs will run again..
		while(it.hasMoreJobs())
		{
			currentJob = it.nextJob();
			System.out.println(currentJob.title + ":"  + currentJob.salary);
		}		
	}
}
