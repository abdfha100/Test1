package app3;

public class M26 {
	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "ja".concat("va");  //conct() is refeing to this.
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}


/*
false
true 
 
 clt\
 
 class String 
{
	public String concat(String args) 
	{
		return (this + args);
	}
}

 
 */