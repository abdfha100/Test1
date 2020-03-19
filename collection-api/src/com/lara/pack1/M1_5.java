package com.lara.pack1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class B
{
	int i, j;
	B(int i, int j)
	{
		this.i = i;
		this.j = j;
	}

@Override
public String toString() {
	return "(" + i + "," + j + ")";
}
}

class C implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		return ((B)o1).i - ((B)o2).i;
	}
	
}

class D implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		return ((B)o1).j - ((B)o2).j;
	}
}

public class M1_5 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new B(10, 20));
		list.add(new B(100, 0));
		list.add(new B(1, 200));
		list.add(new B(101, 2));
		list.add(new B(40, 204));
		list.add(new B(5, 25));
		System.out.println(list);
		Collections.sort(list, new C());
		System.out.println(list);
		Collections.sort(list, new D());
		System.out.println(list);
	}
}

/*

[(10,20), (100,0), (1,200), (101,2), (40,204), (5,25)]
[(1,200), (5,25), (10,20), (40,204), (100,0), (101,2)]
[(100,0), (101,2), (10,20), (5,25), (1,200), (40,204)]

 
2 tpyps of sort ()
1 arguemt sor()
2 arguem sort()

 
1-arguemt sort()
--------------
reqe a comparable type and there is compareTo(), we can 

2-arguemt sort()
--------------
where as 2 argu sor() not  element can be compare
we need to supply comparator
  
  
  
 */