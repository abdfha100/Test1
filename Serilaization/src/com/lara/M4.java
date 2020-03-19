package com.lara;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class M4 {

	public static void main(String[] args) {
		try(FileInputStream fin = new FileInputStream("test3.ser");
				ObjectInputStream in = new ObjectInputStream(fin))
		{
			A obj1 = (A) in.readObject();
			A obj2 = (A) in.readObject();
			A obj3 = (A) in.readObject();
			A obj4 = (A) in.readObject();
			System.out.println(obj1.i + ", " + obj2.i + ", " + obj3.i + ", " + obj4.i);
			/*A obj5 = (A) in.readObject();
			A obj6 = (A) in.readObject();
			A obj7 = (A) in.readObject();
			A obj8 = (A) in.readObject();
			System.out.println(obj5.i + ", " + obj6.i + ", " + obj7.i + ", " + obj8.i);*/
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
