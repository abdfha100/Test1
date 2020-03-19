package com.lara;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class M3 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("hello", 201); // put() recing 2 arrument
		map.put("abc", 20);  // entry obje abc is a key and corrseopoinding val =20.. same for all values..
		map.put("xyz", 21); // key and value
		map.put("test", 1);
		map.put("btm", 25);
		map.put("java", 101);
		
		TreeMap map1 = new TreeMap();
		map1.putAll(map);
		System.out.println(map1);
	}
}

/*
{abc=20, btm=25, hello=201, java=101, test=1, xyz=21}

based on the key conntent sorting is happeing

how to sort the HashMap content based on the value..****

TreeMap are sorting based on the key not the value... 
 
 */