package aap4;

public class M23 {
	static class A extends Thread
	{
		A()
		{
			start();  //auto started  bocos of constrctor
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
		A a1 = new A(); //automataically star(). in most cases it is recomended to 
		System.out.println("main end");
	}
}
