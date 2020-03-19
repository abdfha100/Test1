package com.lara;

import java.util.ArrayList;

public class M9 {
	public static void main(String[] args) {
		ArrayList  list = new ArrayList();
		
		//unsafe to use ArrayList as multiThread..
		
		list = Util.synchronizedList(list);
		
		//now, it safe to use ArrayList as multiThread.
		
		list.add(90);
		list.add(90);
		list.add(90);
		Object obj = list.get(0);
		
		System.out.println(list);
	}
}
