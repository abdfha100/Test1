package com.lara;

import java.io.File;

public class M18 {
	public static void main(String[] args) {
		
	File f1 = new File("hello1.txt");
	File f2 = new File("dir1");
	System.out.println("f1.isFile() " + f1.isFile());
	System.out.println("f2.isDir() " + f2.isFile());
	System.out.println("f1.isFile() " + f1.isDirectory());
	System.out.println("f1.isFile() " + f1.isFile());
	}
}
