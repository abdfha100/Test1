package stringBasics;

public class M25 {
	public static void main(String[] args) {
		String s1 = "xyz";
		System.out.println(s1); //before concat
		String s2= s1.concat("hello");  // calling concat method and assigning in to s2..
		System.out.println(s1); //after concat
		System.out.println(s2); //after concat
	}
}

/*
 OP
xyz
xyz
xyzhello


*/