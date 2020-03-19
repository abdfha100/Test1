package com.lara.pack1;
class C implements Runnable
{
	public void run()
	{
		for(int i =1; i<=1000; i++)
		{
			System.out.println(i);
		}
	}
}
public class M5 {
	public static void main(String[] args) {
		C c1 = new C();
		Thread t1 = new Thread(c1); // creating an object to thread
		t1.start();
		//t1.run();
		for(int i=2000; i<=3000; i++)
		{
			System.out.println(i);
		}
	}
}

/*
NOTE
----
1. runnable is available in java.lang package
2. runnable is a single method interface... which is run method
3. runnable is also called function interface because its contain only one method.
4. lambda is also called function interface.

*/