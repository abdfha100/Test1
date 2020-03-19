package com.lara.pack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.function.Consumer;

import com.lara.pack1.Person;

public class M10 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(901);
		list.add(910);
		list.add(190);
		list.add(0);
		list.add(9);
		System.out.println(list); 
		Iterator it = list.iterator();
		
		it.forEachRemaining((o1)) -> System.out.println(o1);
		
		//it.forEachRemaining(o1) -> System.out.println(o1);
		System.out.println();
		System.out.println(list);
	}

}
