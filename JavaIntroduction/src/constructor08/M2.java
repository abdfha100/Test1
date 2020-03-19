package constructor08;

public class M2 {
	public M2() {
		System.out.println("I am in the construcotor");
	}
	
	public M2(int a, int b) {
		System.out.println("I am in the parameterized constructor");
		int c = a+b;
		System.out.println(c);
	}
	
	public M2(String str) {
		System.out.println(str);
	}
	
	public void getData() {
		System.out.println("I am in the method");
	}
	
	public static void main(String[] args) {
		
	    M2 m2 = new M2();
		
		M2 m3 = new M2(4, 5);
		
		M2 m4 = new M2("hello");
	}

}
