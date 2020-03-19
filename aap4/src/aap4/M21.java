package aap4;

public class M21 {
	static class A extends Thread
	{
		public void run()
		{
			for(int i = 0; i< 1000; i++)
			{
				System.out.println("run:" + i);
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("main begin");
		A a1 = new A();
		a1.start();
		a1.start(); // callign sencon time is abnorm condint. thred can  be called 0 or 1 time. 
		System.out.println("main end");
	}
}
