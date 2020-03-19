package aap4;

public class M22 {
		static class A extends Thread
		{
			public void run()
			{
				for(int i = 0; i< 1000; i++)
				{
					System.out.println("run:" + i);
					start(); // again child is calling the run() 
				}
			}
		}
		public static void main(String[] args) {
			System.out.println("main begin");
			A a1 = new A();
			a1.start(); // alredy started the run() by main
			System.out.println("main end");
		}
}
