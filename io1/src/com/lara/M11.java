package com.lara;

import java.io.File;
import java.io.IOException;

public class M11 {
	public static void main(String[] args) {
		File dir = new File("F://JavaFileHandle1");  // this directory in not available
		File f1 = new File(dir, "hell10.txt");
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
OP
----
a: false
java.io.IOException: The system cannot find the path specified
c: false
done 
 
 
 */
