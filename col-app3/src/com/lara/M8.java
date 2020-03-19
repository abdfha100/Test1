package com.lara;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class M8 {
	public static void main(String[] args) {
		Map map = new HashMap();
		
		
		//unsafe to use in multi threaded environment..
		
		map = Collections.synchronizedMap(map);
		//now, it is safe to use in multi threaded environment..
	}

}

/*

List type
Map type
Set type

 */