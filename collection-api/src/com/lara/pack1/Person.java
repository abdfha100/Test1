package com.lara.pack1;

import java.util.Comparator;

public class Person {
	int age;
	double height;
	double weight;
	
	Person(int age, double height, double weight) {	
		this.age= age;
		this.height= height;
		this.weight= weight;
	}

	public String toString() {			
		return "(" + age + ", " + height + ", "  + weight +")";
	
	}
}

class age implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		
	return ((Person)o1).age - ((Person)o2).age;
	}
}

class height implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		
		return (int) ((int) ((Person)o1).height - ((Person)o2).height);
	}
}

class weight implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		
		return (int) ((int) ((Person)o1).weight - ((Person)o2).weight);
	}
}