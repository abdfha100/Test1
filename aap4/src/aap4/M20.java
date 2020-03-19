package aap4;
class I extends Thread
{
	public void run()
	{
		for(int i = 1; i <= 1000; i++)
		{
			System.out.println("run: " + i);
		}
		System.out.println("run end");
	}
}

public class M20 {
	public static void main(String[] args) {
		System.out.println("main begin");
		I obj = new I();
		obj.start();
		int i = 10/0;  // unhandeled exception .. 
		System.out.println("main end");
	}

}
