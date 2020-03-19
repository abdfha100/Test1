package com.lara.pack7;

public class M8 {
	public static void main(String[] args) {
		int i = 10;
		final int j = 10;
		
		
		class A
		{
			void test()
			{
				System.out.println(i);
				System.out.println(j);
			}
		}
		
		A a1 = new A();
		a1.test();
		//i = 20;
		a1.test();
	}
}
/*
 loca var in the in the iner cls
 shd be use as final..
 
 private, public or protected access level is not allowed for the local members..
 local members can't be static...
 */