package aap4;

public class M30 {
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
		System.out.println(a1.getName());
		System.out.println(a1.getName());
	}
}

/*
Thread-0
Thread-0
Thread-0



 */