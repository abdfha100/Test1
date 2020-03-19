package com.lara;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class M2 {
	public static void main(String[] args) {
		try(FileInputStream fin = new FileInputStream("test1.txt");
				ObjectInputStream in = new ObjectInputStream(fin))
		{
			Person p1 = (Person) in.readObject();
			System.out.println(p1.getFirstName());
			System.out.println(p1.getLastName());
			System.out.println(p1.getAge());
			//System.out.println(p1.getAddress().getHouseNo());
			//System.out.println(p1.getAddress().getSteetName());
			
			System.out.println("done");
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		catch(ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}
	}
}