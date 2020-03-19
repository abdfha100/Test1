package aap4;

public class M28 {
	public static void main(String[] args) {
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getPriority());
		//t1.setPriority(Thread.MAX_PRIORITY);
		//t1.setPriority(Thread.MIN_PRIORITY);
		//t1.setPriority(Thread.NORM_PRIORITY);
		t1.setPriority(8);
		System.out.println(t1.getPriority());
	}
}

/*
5
10

priority is a integer no 
min- 1 and
max -10
and deflt is 5
main thread prioriry is normal av priority

we can chage the proity wiht setPrioty()..
 but it shd be 1-10
 
 t1.setPriority(Thread.MAX_PRIORITY); final and consatant..
 t1.setPriority(Thread.MIN_PRIORITY);
 t1.setPriority(Thread.NORM_PRIORITY);
 
 
 detla pritoy of a main there is is 5, but
  deflt proiry of a child thered is prioruiy of its parent. 
 
 */