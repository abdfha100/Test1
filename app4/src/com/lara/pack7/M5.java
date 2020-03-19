package com.lara.pack7;
class Test
{
	class A
	{
		
	}
	static class B
	{
		
	}
}

public class M5 {
	public static void main(String[] args) {
	Test.A a1 = null;
	Test.B b1 = null;
	
	a1 = new Test().new A();
	b1 = new Test.B();
	
	System.out.println("done");
	}
}


/*
done



 */