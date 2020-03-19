package com.lara;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class M5 {
	public static void main(String[] args) throws Exception {
		File f1 = new File("emp.txt");
		FileReader fin = new FileReader(f1);
		BufferedReader bin = new BufferedReader(fin);
		
		Person person = null;
		ArrayList list = new ArrayList();
		
		String line = bin.readLine();
		String[] fields;
		while(line != null)
		{
			fields = line.split(",");
			person = new Person();
			
			person.setFirstName(fields[0].trim());
			person.setLastName(fields[1].trim());
			person.setAge(Integer.parseInt(fields[2].trim()));
			person.setSal(Integer.parseInt(fields[3].trim()));
			
			list.add(person);
			line = bin.readLine();
		}
		System.out.println(list);
		
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.println("Enter 1 to sort persons based on First Name");
			System.out.println("Enter 2 to sort persons based on Last Name");
			System.out.println("Enter 3 to sort persons based on Age");
			System.out.println("Enter 4 to sort persons based on Salary");
			int searchText = sc.nextInt();
			
			switch(searchText)
			{
			case 1:
				Collections.sort(list, new Person.SortBasedOnFirstName());
				break;
			case 2:
				Collections.sort(list, new Person.SortBasedOnLastName());
				break;	
			case 3:
				Collections.sort(list, new Person.SortBasedOnAge());
				break;
			case 4:
				Collections.sort(list, new Person.SortBasedOnSalary());
				break;	
			default:
				System.out.println("wrong input");
			}
			System.out.println(list);
			System.out.println("you wnat to sort based on another field (y/n)");
		}while("y".equalsIgnoreCase(sc.next()));
	}
}