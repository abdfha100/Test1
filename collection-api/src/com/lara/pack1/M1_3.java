package com.lara.pack1;

import java.util.ArrayList;
import java.util.Collections;

public class M1_3 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("hello");
		list.add("abc");
		list.add("xyz");
		list.add("test");
		list.add("123");
		list.add("XYZ");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);		
	}

}

/*
OP
--
[hello, abc, xyz, test, 123, XYZ]
[123, XYZ, abc, hello, test, xyz]

all are Sring tpye element and no null 
Stirng cls is also implemeing comparable interface...
String-Cls is already sub-cls to Comprarable...

while soring ASCII code valule 
1. numeric
2. upeper cas
3. lwer case
 */