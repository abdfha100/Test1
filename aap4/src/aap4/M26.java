package aap4;

public class M26 {
	public static void main(String[] args) {
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getName());
		t1.setName("app initialize");
		System.out.println(t1.getName());
	}
}


/*

 this is 1st apparoach
 
 */