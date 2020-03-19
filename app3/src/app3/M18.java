package app3;

public class M18 {
	public static void main(String[] args) {
		String s1 = "java";  // 1 obj
		String va = "va";  // 2 obj
		String s2 = "ja"  + va; // 3 obj and + a new sting  a new obj and ja is one mor obje and it will abandont later on..
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}


/*
 
false
true

 + va ring operand is reference vare
 it will be creont a new obj
 and s2 is pioont ton new obj
 
 
 
 */