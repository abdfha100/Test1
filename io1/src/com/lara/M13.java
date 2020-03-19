package com.lara;

import java.io.File;

public class M13 {
	public static void main(String[] args) {
		File f1 = new File("dir2"); 
		System.out.println("a: " + f1.exists());
		System.out.println("b: " + f1.mkdir());
		System.out.println("c: " + f1.exists());
	    System.out.println("done");
	}
}

/*
a: false
b: true
c: true
done

it created a new directory (dir2) in the project folder
 */