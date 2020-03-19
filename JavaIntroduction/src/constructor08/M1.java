package constructor08;

/*
will not return the value
name of the constructor should be the class name
 */

public class M1 {
	public M1() {
		System.out.println("I am in the constructor");
		System.out.println("I am in the constructor 2nd time");
	} 
	
	public void getData() {
		System.out.println("I am in the method");
	}
	public static void main(String[] args) {
		
		M1 m1 = new M1(); // when ever create an object, the constructor is called..
		                  // compiler will call implicit constructor, if you are not defined any constructor...       
		
		
		
	}

}
