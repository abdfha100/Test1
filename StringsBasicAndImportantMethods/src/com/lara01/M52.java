package com.lara01;

public class M52 {
	public static void main(String[] args) {
		
		String s1 = "abc";
		System.out.println(s1.substring(0, 0).length());
		System.out.println(s1.substring(0, 1).length());
		System.out.println(s1.substring(0, 2).length());
		System.out.println(s1.substring(1, 1).length());
		System.out.println(s1.substring(2, 2).length());
	}
}

/*
0
1
2
0
0

 */