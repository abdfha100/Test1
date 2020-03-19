package aap4;

public class M33 {
	static class A extends Thread
	{
		
	}
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
		System.out.println(a1.getId());
		System.out.println(a2.getId());
		System.out.println(a3.getId());
		System.out.println("done");
	}
}

/*
8
9
10
done

evry therd has a uniqu id and it cannot be change..



 */