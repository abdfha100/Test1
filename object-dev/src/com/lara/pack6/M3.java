package com.lara.pack6;
class C
{
	static 
	{
		System.out.println("SIB");
	}	
}
public class M3 {
	public static void main(String[] args)
	throws ClassNotFoundException
	{
		C c1 = new C();
		Class obj1 = c1.getClass();
		// when ever object is creating the SIB are loading into memory one time..
		Class obj2 = Class.forName("com.lara.pack6.C");
		// getting same output..
		System.out.println(obj1 == obj2);
		System.out.println("done");
	}
}


/*
OP
--
SIB
done
****************

SIB
true
done


note:
-------
reading a class name and assing into String object..



 */