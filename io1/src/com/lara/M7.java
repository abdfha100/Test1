package com.lara;

import java.io.File;
import java.io.IOException;

public class M7 {
	public static void main(String[] args) {
		File f1 = new File("E:\\hello7.txt");
		System.out.println("a: " + f1.exists());
		try
		{
			System.out.println("b: " + f1.createNewFile());
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("c: " + f1.exists());
		System.out.println("done");
	}
}


/*
a: false
b: true
c: true
done

for seceond time run
-------------
a: true
b: false
c: true
done


 */