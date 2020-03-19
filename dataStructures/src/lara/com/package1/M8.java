package lara.com.package1;
class H
{
	int data;
	H ref;
	H(int data)
	{
		this.data = data;
	}
void add(int data)
{
	H element = this;
	while(element.ref != null)
	{
		element = element.ref;
	}
	element.ref = new H(data);	
}
void  read()
{
	H element = this;
	while(element != null)
	{
		System.out.println(element.data + ", ");
		element = element.ref;
	}
 }
}
public class M8 {
	public static void main(String[] args) {
		H h1 = new H(90);
		h1.add(10);
		h1.add(20);
		h1.add(40);
		h1.add(35);
		h1.read();
	}
}


/*
OP
---
90, 
10, 
20, 
40, 
35, 

*/
