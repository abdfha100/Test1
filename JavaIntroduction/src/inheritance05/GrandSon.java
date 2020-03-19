package inheritance05;

public class GrandSon extends Son {
	public static void main(String[] args) {
		
		GrandSon gs = new GrandSon();
		gs.city();
		gs.country();
		gs.sonActivities();
		
		System.out.println(gs.i);
		
	}

}
