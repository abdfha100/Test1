package aap4;

public class M27 {
	public static void main(String[] args) {
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getId());
		//t1.setId(900);
		System.out.println(t1.getId());
	}

}


/*

1
1

incase thread, evry therd has uniqu id
id cannt be modify or change..
wher ever thed is creating, a uinq id will be assignde and it cannot be changed agina..

no two threads will be haiving the sam id...
but is name is not unique, and we can chagne the name..

Id -- is used for uniequeness
name -- is used for idenifying the name of the thread..



 */