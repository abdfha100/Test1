package lara.com.package1;

class B
{
	int data;
	B(int data)
	{
		this.data = data;
	}
}
public class M2 {
	public static void main(String[] args) {
		B b1 = new B(10);
		B b2 = new B(5);
		B b3 = new B(50);
		B b4 = new B(20);
		System.out.println(b1.data + ", " + b2.data + ", " + b3.data + ", " + b4.data);
	}
}


/*
OP
----
10, 5, 50, 20

we are using constrctor, 
and in the main we are supplying respectiver data..
 */