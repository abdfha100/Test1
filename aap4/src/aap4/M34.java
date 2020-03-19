package aap4;
public class M34 {
	static class A extends Thread
	{
		public void run()
		{
			System.out.println("child:" + getPriority());
		}
	}
	public static void main(String[] args) {
		Thread t1 = Thread.currentThread();
		t1.setPriority(10);
		A a1 = new A();
		a1.start();
		System.out.println("done");
	}
}

/*
done
child:5

as pareent deflut prios is 5 , the same prority is
inherited to child as well..

done
child:10


 */