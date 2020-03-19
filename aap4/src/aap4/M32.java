package aap4;
public class M32 {
	static class A extends Thread
	{
		A()
		{
			
		}
		A(String name)
		{
			super(name);
		}
		public void run()
		{
			System.out.println("done");
		}
	}
	public static void main(String[] args) {
		A a1 = new A("my fisrt thread");
		A a2 = new A();
		A a3 = new A("my third thread");
		System.out.println(a1.getName());
		System.out.println(a2.getName());
		System.out.println(a3.getName());
		System.out.println("-----------");
		a1.setName("my thread1");
		a1.setName("my thread2");
		System.out.println(a1.getName());
		System.out.println(a2.getName());
		System.out.println(a3.getName());
	}

}

/*
my fisrt thread
Thread-0
my third thread
-----------
my thread2
Thread-0
my third thread

 
 there are 2 ways we can chngae the therrd name
 1. thruhg constucor
 2. setname..
 
 
 */