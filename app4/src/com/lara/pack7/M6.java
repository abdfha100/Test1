package com.lara.pack7;

public class M6 {
	public static void main(String[] args) {
		class A
		{
			void test()
			{
				System.out.println("from test");
			}
		}
		
		A a1 = new A();
		a1.test();
		a1.test();
		a1.test();
		a1.test();
		System.out.println("done");
	}
}
/*
from test
from test
from test
from test
done

notes:
-------
local inner class..

like local variable, local inner class..

 */