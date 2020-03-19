package com.lara;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class M7 {
	public static void main(String[] args) {
		Set set = new HashSet();
		
		//not a thread sefed ont
		
		//befeore line-13 set is not thread safe one..
		set = Collections.synchronizedSet(set); 
		//after line-13 set is thread safe one
	}
}
