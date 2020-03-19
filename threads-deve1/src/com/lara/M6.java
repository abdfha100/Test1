package com.lara;

public class M6 {
	public static void main(String[] args) {
		
		ThreadPoolManager tpm = new ThreadPoolManager();
		tpm.init();
		
		
		
		Customer c1 = new Customer(tpm);
				c1.start();
		
		
		Customer1 c2 = new Customer1(tpm);
		c2.start();
		
		
	}

}
