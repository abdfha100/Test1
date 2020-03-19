package com.lara.pack1;

import java.util.HashMap;

public class M13 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("k1", 100);
		map.put("k2", 10);
		map.put("k3", 130);
		map.put("k4", 400);
		map.put("k5", 105);
		map.put("k6", "test");
		map.put(true, 500);
		map.put(120, false);
		map.put("check", 400);
		System.out.println(map);
	}
}

/*

OP
---
{k1=100, k2=10, k3=130, k4=400, k5=105, k6=test, true=500}

HashMap map = new HashMap();
---------------------------
put() both are arument tpe
key and value...

key can be any tupe 
value also can be any type
bocs of Object type....

key-value pair is storing in the map object.

whiel addig the vaue, we have to add key..
every elemn shld have key and value..

-it is only to storing the value wiht key-value..



- it is not for order purpose
-

 */