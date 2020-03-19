package com.lara;

import java.util.ArrayList;

public class Util extends ArrayList{
	private static ArrayList myList;
	
	public static ArrayList synchronizedList(ArrayList list)
	{
		myList = list;
		return new Util();
	}
	
	@Override
	public boolean add(Object e) {
		boolean flag = false;
		synchronized(myList)
		{
			flag = myList.add(e);
		}
		return flag;
	}
	
	@Override
	public Object get(int index) {
		Object obj = null;
		synchronized(myList)
		{
			obj = myList.get(index);
		}
		return obj;
	}
	
	@Override
	public Object set(int index, Object element) {
		Object obj = null;
		synchronized(myList)
		{
			obj = myList.set(index, element);
		}
		return obj;
	}
}