package com.lara;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;

import org.hibernate.Session;

public class M6 {

	public static void main(String[] args) 
	{
		File f1 = new File("emp.txt");
		try(FileReader fin = new FileReader(f1);
				BufferedReader bin = new BufferedReader(fin))
		{
			Employee e1 = null;
			String line, fields[];
			Session s2 = Util.getSession();
			s2.beginTransaction();
			while((line = bin.readLine()) != null)
			{
				e1 = new Employee();
				fields = line.split(";");
				e1.setEmpId(Integer.parseInt(fields[0].trim()));
				e1.setFirstName(fields[1].trim());
				e1.setLastName(fields[2].trim());
				e1.setAge(Integer.parseInt(fields[3].trim()));
				e1.setEmail(fields[4].trim());
				Serializable id = s2.save(e1);
				System.out.println("done wiht Id" + id);
			}
			s2.getTransaction().commit();
			
		}
		catch (IOException e)
		{
			e.getStackTrace();
		}

	}
}
