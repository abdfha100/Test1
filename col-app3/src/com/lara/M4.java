package com.lara;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class M4 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("hello", 201); 
		map.put("abc", 20);  
		map.put("xyz", 21); 
		map.put("test", 1);
		map.put("btm", 25);
		map.put("java", 101);
		
		Set entries = map.entrySet();
		
		Comparator c1 = new Comparator()
	    {
			@Override
			public int compare(Object o1, Object o2) {
				Entry e1 = (Entry) o1;
				Entry e2 = (Entry) o2;
				//return (Integer)e1.getValue()  - (Integer)e2.getValue();
				return ((Integer)e1.getValue()).compareTo((Integer)e2.getValue());
			}
		};
		
		TreeSet set = new TreeSet(c1);
		set.addAll(entries);
		System.out.println(set);
	}
}
/*
[test=1, abc=20, xyz=21, btm=25, java=101, hello=201]

 */