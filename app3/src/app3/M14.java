package app3;

public class M14 {
	public static void main(String[] args) {
		String s1 = new String("hello"); // one constant.."hello" thoh  new one obj created
		String s2 = new String("hello");  //one more contant 
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}


/*
 
 consstant doest not have reference...
 totally 3 obj create
 but 2 obje only have referinecss..
 
 s1 poiting 1st obj
 
false
true
 
 */