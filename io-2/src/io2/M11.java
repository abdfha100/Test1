package io2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class M11 {
	public static void main(String[] args) throws IOException {
		File f1 = new File("test1.txt");
		FileReader fin =  new FileReader(f1);
		BufferedReader bin = new BufferedReader(fin);
		String s1;
		int lines=0, counSent=0, countWords=0;
		String words = " ", sentences = ".";
		
		while((s1 = bin.readLine()) != null)
		{
			System.out.println(s1);
			lines++;
			
			if (bin.readLine().equalsIgnoreCase(words))
			{
				System.out.println(words.indexOf(words));
				
			}
			else
			{
				counSent++;
				
			}
		}
		System.out.println("Number of lines: " + lines);
		//System.out.println("Number of words: " + countWords);
		//System.out.println("Number of sentences: " + counSent);
	}
}
