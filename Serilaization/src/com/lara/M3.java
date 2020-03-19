package com.lara;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class M3 {
	public static void main(String[] args) {
		try(FileOutputStream fout = new FileOutputStream("test3.ser", true);
				ObjectOutputStream out = new ObjectOutputStream(fout))
		{
			out.writeObject(new A(90));
			out.writeObject(new A(920));
			A a1 = new A(190);
			A a2 = new A(900);
			out.writeObject(a1);
			out.writeObject(a2);
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("done");
	}
}
