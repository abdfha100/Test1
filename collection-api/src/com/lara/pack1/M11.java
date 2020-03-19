package com.lara.pack1;

import java.util.HashSet;
import java.util.TreeSet;

public class M11 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(90);
		set.add(100);
		set.add(130);
		set.add(120);
		set.add(0);
		set.add(150);
		System.out.println(set);
		TreeSet set1 = new TreeSet();
		set1.addAll(set);
		System.out.println(set1);	
	}
}

/*

OP
--
[0, 130, 100, 150, 120, 90]
[0, 90, 100, 120, 130, 150]

by dft set is not soring, but we can store any nub of elemnts
set is introduece to aovidint the duplicates...

it won't display in the same order whic gave in the prog ordre

howere we can use TreeSet to sor
but all three conteions shd be satitised...
-seme typ
-no null elelmt
- it shd be comparable or we have to keep saparate comparator..

where as list is to maintina the order

Treeset is mainly intrdueced for sorting purpose..
simlary TreSet also take 2 argument Construoctor as comparator...




 */