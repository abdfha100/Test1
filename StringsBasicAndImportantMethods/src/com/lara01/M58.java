package com.lara01;

public class M58 {
	public static void main(String[] args) {
		String s1 = "hello";
		System.out.println(s1);
		
		String s2 = reverse(s1);
		System.out.println(s2);
	}
	
	static String reverse(String str)
	{
		if(str.length() == 0)
		{
			return "";
		}
		return str.charAt(str.length()-1) + reverse(str.substring(0, str.length()-1));
	}
}

/*
hello
olleh

 */