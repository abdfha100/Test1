package com.lara;

import java.io.File;

public class M19 {
	public static void main(String[] args) {
		File f1 = new File("E:\\JDK8.0\\bin");
		File[] members = f1.listFiles();
		for(File file: members)
		{
			System.out.println(file.getName());
		}
	}
}
