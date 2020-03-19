package com.lara;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class M1 {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setFirstName("hello");
		p1.setLastName("test");
		p1.setAge(22);
		Address a1 = new Address();
		a1.setHouseNo("123/T");
		a1.setStreetName("BTM");
		//p1.setAddress(a1);
		
		try(FileOutputStream fout = new FileOutputStream("test1.txt");
				ObjectOutputStream out = new ObjectOutputStream(fout))
		{
			out.writeObject(p1);
			System.out.println("done");
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
	}
}
