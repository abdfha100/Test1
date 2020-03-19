package com.lara.pack1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;

public class M17 {
	public static void main(String[] args) throws Exception {
		
		File f1 = new File("test.txt");
		FileReader fin = new FileReader(f1);
		BufferedReader bin = new BufferedReader(fin);
		String s1 = bin.readLine();
		while(s1 != null)
		{
			System.out.println(s1);
			s1 = bin.readLine();
		}
	}
}
