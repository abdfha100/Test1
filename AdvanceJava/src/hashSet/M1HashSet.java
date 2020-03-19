package hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class M1HashSet {
	public static void main(String[] args) {
		
		//HashSet TreeSet and LinkedHashset implement Set Interface.
		//Doesn't accept duplicate values..
		//there is no guarantee elements are stored in the sequential order..  Random order..
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("INDIA");
		hs.add("he");
		hs.add("She");
		
		System.out.println(hs);
		hs.add("INDIA");
		//hs.remove("UK");
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		
		
		//Iterator..
		
		Iterator<String> i = hs.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
 