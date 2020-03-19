package aap4;

public class M29 {
	public static void main(String[] args) {
		Thread t1 = Thread.currentThread();
		System.out.println(t1.isDaemon());
		t1.setDaemon(true);
		System.out.println(t1.isDaemon());
	}
}

/*
Exception in thread "main" false
java.lang.IllegalThreadStateException
	at java.lang.Thread.setDaemon(Thread.java:1359)
	at aap4.M29.main(M29.java:7)

 
 while convering main () to deamon...we are getting an expception...
 
 */
 
