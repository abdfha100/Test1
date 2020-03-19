package aap4;

public class M39 {
	static class A extends Thread {
		public void run()
		{
			for(int i =1; i<= 5000; i++)
			{
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("main begin");
		A a1 = new A();
		a1.start();
		
		try
		{
			a1.join();  // main ther is sying i will joiin at the end.. so chield tred will be complteting full an then main end..
			
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
			
		}
		System.out.println("main end");
	}
}
