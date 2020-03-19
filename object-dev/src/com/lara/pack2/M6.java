package com.lara.pack2;
class G
{
	int i;
	
	@Override
	public boolean equals(Object obj) {
		return i == ((G) obj).i;
	}
}

public class M6 {
	public static void main(String[] args) {
		G g1 = new G();
		g1.i =10;
		
		G g2 = new G();
		g2.i =10;
		
		System.out.println(g1 == g2);
		System.out.println(g1.equals(g2));
		
		
		G g3 = g1;
		
		System.out.println(g3 == g1);
		System.out.println(g3.equals(g1));
	}
}

/*
OP
--
false
false

=== operator always check for the memory location
g1 is pointing different object
and g2 is pointing to another object

(equals(g1)) is same as the == operator
it is advisable to use equals() method rather than == operator


*******
new OP
-------
false
false
true
true


even though g1 and g2 pointing the same content i.e i=10;
equals() return false
they verify whether the reference are pointing to the same object or not 

**************
new OP

false
true
true
true

 */