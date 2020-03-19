package app3;

public class M28 {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		sb1.append("hello");
		
		StringBuffer sb2 = new StringBuffer();
		sb2.append("hello");
		
		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2));
	}
}

/*
false
false

line-11 false bcos StingBuffer class is not overridede the equals() mthd


line-12 false bcos
 
 String
 ------
 toString()
 equals()
 hashcode()
 all three got over rided..
 
 StringBuffer
 --------
 only toString() is not over rided, not hashcode() and equals() 
 
 
 */