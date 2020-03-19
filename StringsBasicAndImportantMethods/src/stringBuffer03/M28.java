package stringBuffer03;

public class M28 {
	public static void main(String[] args) {
		StringBuffer sb1 =new StringBuffer();
		sb1.append("hello");
		
		StringBuffer sb2 =new StringBuffer();
		sb2.append("hello");
		
		System.out.println(sb1 == sb2);
		
		System.out.println(sb1.equals(sb2));
		
	}

}
/*
OP
--
false
false


notes: 

String
-------
toString()
equals()
hashCode() all these methods got over rided in the String class


StringBuffer
----------
toString() only got over rided in the BufferString class
 */