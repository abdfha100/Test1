package aap4;

class H extends Thread {
	 public void run()
	 {
		 System.out.println("run begin");
		 int i = 10/0;
		 System.out.println("rund end");
	 }
}
public class M19 {
	public static void main(String[] args) {
		System.out.println("main begin");
		H obj = new H();
		obj.start();
		System.out.println("main end");
	}
}


/*

main begin
main end
run begin
Exception in thread "Thread-0" java.lang.ArithmeticException: / by zero
	at aap4.H.run(M19.java:7)
 
 */
