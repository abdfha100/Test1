package superKeyword09;

public class M2Child extends M1Parent {
	
	String name = "QAClickAcademy";
	
	public M2Child() {
		super(); //This should be always in the first line..
		System.out.println("child class constructor");
	} 
	
	
	public void getStringData() {
		System.out.println(name);
		System.out.println(super.name);
	}
	
	public void getData() {
		super.getData();
		System.out.println("I am in the child class");
	}
	
	public static void main(String[] args) {
		
		M2Child m2child = new M2Child();
		m2child.getStringData();
		
		m2child.getData();
		
	}

}
