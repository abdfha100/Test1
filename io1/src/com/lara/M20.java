package com.lara;

import java.io.File;

public class M20 {
	public static void main(String[] args) {
		File src = new File("F:\\aug-8th");
		File[] members = src.listFiles();
		for(File member: members)
		{
			System.out.println(member.getName() + ": " + (member.isFile()? " file " :"directory"));
		}
	}
}
