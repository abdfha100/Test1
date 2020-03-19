package thisKeyword10;

public class M1 {
	
	int a=2; 
	
	public void getData() {
		int a=3;
		int sum = a + this.a;
		System.out.println(a);
		System.out.println(this.a); //this keyword refer to current object- object scope lies in class level..
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		
		M1 m1 = new M1();
		m1.getData();
		
	}

}
