package com.lara01;

public class M46 {
	public static void main(String[] args) {
		
		String s1= "java made easy and also java very popular";
		
		int i = s1.lastIndexOf("java");
		System.out.println(i);
		
		int j = s1.lastIndexOf("java", 11);
		System.out.println(j);
	}
}

/*
24
0
 */