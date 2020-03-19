package aap4;

public class M24 {
	static class A extends Thread
	{
		A()
		{
			start();
		}
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
		System.out.println("main end");
	}
}


/*
 main () is recing the the abnosrmal contei 
 2nd time starat()
 and termainatin
 only the chil() is running...
 
 * /
 */