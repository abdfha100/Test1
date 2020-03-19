package io2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class M6 {
	public static void main(String[] args) throws IOException {
		File f1 = new File("test3.txt");  //**
		FileReader fin = new FileReader(f1);
		//char[] chars = new char[(int) f1.length()];
		char[] chars = new char[110]; //**
		fin.read(chars);
		fin.close();//**
		String s1 = new String(chars);
		System.out.println(s1);
	}
}
