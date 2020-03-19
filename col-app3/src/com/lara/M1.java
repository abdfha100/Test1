package com.lara;

import java.util.HashMap;
import java.util.Set;

public class M1 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("hello", 201); // put() recing 2 arrument
		map.put("abc", 20);  // entry obje abc is a key and corrseopoinding val =20.. same for all values..
		map.put("xyz", 21); // key and value
		map.put("test", 1);
		map.put("btm", 25);
		map.put("java", 101);
		
		Set entries = map.entrySet();
		
		for(Object obj : entries)
		{
			System.out.println(entries);
		}
	}
}

/*

[abc=20, java=101, test=1, xyz=21, btm=25, hello=201]
[abc=20, java=101, test=1, xyz=21, btm=25, hello=201]
[abc=20, java=101, test=1, xyz=21, btm=25, hello=201]
[abc=20, java=101, test=1, xyz=21, btm=25, hello=201]
[abc=20, java=101, test=1, xyz=21, btm=25, hello=201]
[abc=20, java=101, test=1, xyz=21, btm=25, hello=201] 
 */