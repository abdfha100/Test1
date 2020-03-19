package arrayList;

//can accept duplicates values..
/*
1. ArrayList
2. LinkedList
3. VectorList Implementing List interface 
 all these list accept duplicate values...
 
 Note: Array have fixed size where as ArrayList can grow dynamically...
 You can access and insert any value in any index.. 

 */

import java.util.ArrayList;

public class M1 {
	public static void main(String[] awrgs) {
		
		ArrayList<String> a= new ArrayList<String>();
		a.add("abdul");
		a.add("java");
		System.out.println(a);
		
		a.add(0, "student");
		System.out.println(a);
		a.add("java");
		System.out.println(a);
		
		/*a.remove(1);
		System.out.println(a);
		
		a.remove("java");
		System.out.println(a);
		
		a.removeAll(a);
		System.out.println(a); */
		
		System.out.println(a.get(2));
		
		System.out.println(a.contains("testing"));
		System.out.println(a.contains("java"));
		System.out.println(a.indexOf("abdul"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		
	}

}