package com.lara.pack1;

import java.util.HashMap;
import java.util.TreeMap;

public class M15 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("k1", 10);
		map.put("k4", 20);
		map.put("k2", 56);
		map.put("k5", 23);
		map.put("k8", 87);
		map.put("k6", 12);
		map.put("k7", 103);
		map.put("check", 400);
		map.put("test", 21);
		map.put("check", 78);
		System.out.println(map);
		
		TreeMap map1 = new TreeMap();
		map1.putAll(map);
		System.out.println(map1);
	}

}

/*
Pskills
only core java..

india bix...

Lara.co.in
 */