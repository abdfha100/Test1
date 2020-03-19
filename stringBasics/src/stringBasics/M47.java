package stringBasics;

public class M47 {
	public static void main(String[] args) {
		String s1 = "java made easy and also java very popular";
		        //   0123456789
		int i = s1.lastIndexOf('a');
		System.out.println(i);
		int j = s1.lastIndexOf('a', 11);
		System.out.println(j);
	}
}


/*
 s1.lastIndexOf('a');
 search a from right to left
 
 
 s1.lastIndexOf('a', 11);
 search from 11-index onwards from
 right to left 
 
 
 */