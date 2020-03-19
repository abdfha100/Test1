package com.lara.pack;

import java.util.ArrayList;

public class M2 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(901);
		list.add(910);
		list.add(190);
		list.add(0);
		list.add(9);
		for(int i=0; i <list.size(); i++)
		{
			System.out.println(list.get(i) + ", ");			
		}
	}
}

/*
OP
--
90, 
901, 
910, 
190, 
0, 
9,

we are using classical for loop
 using size() and get() we are able to read..
 */