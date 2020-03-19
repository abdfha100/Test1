package com.lara.pack7;
class A
{
	void test1()
	{
		System.out.println("from test1()");
	}
	
	void test2()
	{
		System.out.println("from test2()");
	}
}

public class M10 {
	public static void main(String[] args) {
		A a1 = new A();
		a1.test1();
		a1.test2();
		
		System.out.println("---------------------");
		
		A a2 = new A()   // this is super class. two mthd iniherited 1- is overridean other is overloaidd
		{
			void test1()
			{
				System.out.println("aic-test1");
			}
	
		};
		
		a2.test1();
		a2.test2();
		
		System.out.println("============================");
		
		A a3 = new A()
				{
					void test2()
					{
						System.out.println("from  aic test2");
					}
				};
		a3.test1();
		a3.test2();
		
		System.out.println("*************************************");
		
		
		A a4 = new A()
		{
			void test2()
			{
				System.out.println("from  aic test2");
			}
			void test1()
			{
				System.out.println("from  aic test1");
			}
			
		};
       a4.test1();
       a4.test2();
       System.out.println("##########################################");
       
       A a5 = new A()
		{
			
		};
      a5.test1();
      a5.test2();
	}
}


/*

from test1()
from test2()
---------------------

notes:
-----
line-23 this is super class. two mthd iniherited 1- is overlaoidee other is inheritedd one

Ananymou inner class very important and widely used...


3 pint
1- shd be end with ;
2- ananymus inner cls shd alwyas be concrete. 
3- ananymu inner cls can't be abstract bcos we are develoing wtht new operator..
4- for one annumus inne r cls we can crete only one obj, we cnat creat more than one, bocs does not have a name
   we cant refer the samen name to create more than one object..
5-  inseide the annmus inner cls can't devple the contrintor, bocs no name
6- if we want to devlop non-initliziont then go for IIB's..
7- 
*/
