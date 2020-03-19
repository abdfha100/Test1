package aap4;

public class M25 {
	public static void main(String[] args) {
		Thread t1 = Thread.currentThread();  //referecing value putting into t1. (t1 is the main thread refereferce)
		System.out.println(t1.getName());
		System.out.println(t1.getId());
		System.out.println(t1.getPriority());
		System.out.println(t1.isDaemon());
	}
}


/*

main
1
5
false

find out the deflt propoerties

contain staitc mth()
wiht currentTherd()


these 4 prorties will be there in evrt thre
bofe the obje creaintion


 */