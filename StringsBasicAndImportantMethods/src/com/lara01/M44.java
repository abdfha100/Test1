package com.lara01;

public class M44 {
	public static void main(String[] args) {
		String s1 = "java made easy";
		           //012345678910,11,12,13
		int i = s1.indexOf('a');
		System.out.println(i);
		
		int j = s1.indexOf('a', 11);
		System.out.println(j);
	}
}

/*
1
11

 */