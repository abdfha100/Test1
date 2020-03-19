package com.lara;

import java.io.File;

public class M15 {
	public static void main(String[] args) {
		File f1 = new File("E:/JDK8.0/bin", "dir4"); 
		System.out.println("a: " + f1.exists());
		System.out.println("b: " + f1.mkdir());
		System.out.println("c: " + f1.exists());
	    System.out.println("done");
	}
}
