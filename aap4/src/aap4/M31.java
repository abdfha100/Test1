package aap4;

public class M31 {
	static class A extends Thread
	{
		public void run()
		{
			System.out.println("done");
		}
	}
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
		System.out.println(a1.getName());
		System.out.println(a2.getName());
		System.out.println(a3.getName());
		a1.setName("my thread1");
		a1.setName("my thread2");
		System.out.println(a1.getName());
		System.out.println(a2.getName());
		System.out.println(a3.getName());
	}
}

/*
Thread-0
Thread-1
Thread-2
my thread2
Thread-1
Thread-2
 
setName() is another approahc to change the name of thread... 
 
 
*/
