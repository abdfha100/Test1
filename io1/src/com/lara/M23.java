package com.lara;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class M23 {
	static HashMap<String, Integer> map = new HashMap<String, Integer>();
	static HashMap<String, Integer> dirmap = new HashMap<String, Integer>();
		
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter source path");
			String src = sc.next();
			File srcDir = new File(src);
			File[]	srcDirMembers = srcDir.listFiles();
			String fileType;
			for(File file: srcDirMembers)
			{
				if(file.isFile())
				{
					countFile(file);
				}
				else
				{
					dirmap =  new HashMap<String, Integer>();
					processDir(file);
					System.out.println(file.getName() + ":" + dirmap);
				}
			}
			System.out.println(map);
		}
		
		static void countFile(File f1)
		{
			String fileType = f1.getName().substring(f1.getName().indexOf(".") +1);
			if(map.get(fileType) == null)
			{
				map.put(fileType, 1);
			}
			else
			{
				map.put(fileType, map.get(fileType) + 1);
			}
			
			if(dirmap.get(fileType) == null)
			{
				dirmap.put(fileType, 1);
			}
			else
			{
				dirmap.put(fileType, dirmap.get(fileType) + 1);
			}
		}
		
		static void processDir(File dir)
		{
			File[] srcDirMembers = dir.listFiles();
			for(File file: srcDirMembers)
			{
				if(file.isFile())
				{
					countFile(file);
					
				}
				else
				{
					processDir(file);
				}
			}
		}
}
