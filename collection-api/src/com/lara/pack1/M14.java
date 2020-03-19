package com.lara.pack1;

import java.util.HashMap;

public class M14 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		System.out.println(map.put("k1", 5000));
		System.out.println("map @ 1: " + map);
		System.out.println("-------------------");
		
		System.out.println(map.put("k1", 500));
		System.out.println("map @ 2: " + map);
		System.out.println("-------------------");
		
		System.out.println(map.put("k1", 6000));
		System.out.println("map @ 3: " + map);
		System.out.println("-------------------");
		
		System.out.println(map.put("k1", 50));
		System.out.println("map @ 4: " + map);
		System.out.println("-------------------");
		
		System.out.println(map.put("k1", 5));
		System.out.println("map @ 5: " + map);
		System.out.println("-------------------");
		
		System.out.println(map.put("k1", 15));
		System.out.println("map @ 6: " + map);
		System.out.println("-------------------");
	}
}

/*

every key should be unique in case of HashMap

hashCode() and equals() to find the duplicates..

generally we use String or Wrapper as key..

when we use class as key, then we have to over ride 
to hashCod() and equasl()


we will use TreeMap for sorting...





*/
