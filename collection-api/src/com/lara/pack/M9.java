package com.lara.pack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class M9 {
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
		it.forEachRemaining(new Consumer()
		{
			@Override
			public void accept(Object t) 
			{
				System.out.print(t + ", ");
			}
		});
		System.out.println();
		System.out.println(list);
	}
}

/*

 OP
 ---
[90, 901, 910, 190, 0, 9]
90, 901, 910, 190, 0, 9, 
[90, 901, 910, 190, 0, 9]

 

 
 */