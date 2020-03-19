package inheritance05;

public class Son extends GrandFather {
	public static void main(String[] agrs) {
		
		Son son = new Son();
		son.city();
		son.country();
		
		System.out.println(son.i);
	}
	
	public void sonActivities() {
		System.out.println("sonActivities");
	}
}
