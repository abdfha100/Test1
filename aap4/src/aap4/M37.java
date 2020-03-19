package aap4;

public class M37 {
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
		System.out.println("main end");
	}
}

/*
main begin
main end
1
2
3
.....
5000

child is depeneant on parent

this tyupe of chid is user- thread..
even thoud paern therd is termintihw wiht onyly SOP
chield is conitting all the assinged task..




 */