package com.lara;
import java.util.Scanner;

public class M7 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any class name");
		String s1 = sc.next();
		Class c1 = Class.forName(s1);
		System.out.println(c1);
	}
}
