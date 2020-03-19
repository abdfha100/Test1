package lara.com.package1;

class E {
	int data;
	E ref;
	E(int data)
	{
		this.data = data;
	}
}
public class M5 {
	public static void main(String[] args) {
		E e1 = new E(10);
		e1.ref = new E(5);
		e1.ref.ref = new E(50);
		e1.ref.ref.ref = new E(20);
		e1.ref.ref.ref.ref = new E(210);
		e1.ref.ref.ref.ref.ref = new E(120);
		e1.ref.ref.ref.ref.ref.ref = new E(201);
		//e1.ref.ref.ref.ref.ref.ref.ref.ref = new E(201);
		//System.out.println(e1.data + ", " + e1.ref.data + ", " + e1.ref.ref.data + ", " + e1.ref.ref.ref.data);		
		E element = e1;
		while(element != null)
		{
			System.out.println(element.data + ", ");
			element = element.ref;
		}
	}
}

/*
OP
--
10, 
5, 
50, 
20, 
210, 
120, 
201, 

this type of approach is not advisable...


*/
