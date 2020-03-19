package aap4;

public class M38 {
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
		a1.setDaemon(true); // only before start thread can be converted into Daemon..
		a1.start();
		System.out.println("main end");
	}
}

/*
main begin
main end
1
2
3
4
5
6
7
8

when every parent is leaving 
Daemon is also leaving..
Daemon is dependant on the parent thread..


 */