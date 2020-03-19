package com.lara.pack1;
import java.util.HashMap;
import java.util.Set;

public class M15_1 {
	public static void main(String[] args) 
	{
		String arg = args[0];
		String[] words = arg.split(" ");
		HashMap map = new HashMap();
		for(String word : words)
		{
			if(map.get(word) == null)
			{
				map.put(word, 1);
			}
			else
			{
				map.put(word, (Integer) map.get(word) + 1);
			}
		}
		System.out.println(map);
		
		String word = null;
		int count = 0;
		
		Set keys = map.keySet();
		System.out.println(keys);
		for(Object key : keys)
		{
			int value = (Integer) map.get(key);
			if(value > count)
			{
				word = (String) key;
				count = value;
			}
		}
		System.out.println("Max occured word is " + word + ": " + count);
	}
}