package stringBasics;

public class M45 {
	public static void main(String[] args) {
		String s1 = "java made easy and also java very popular";
		        //   0123456789
		int i = s1.indexOf("java");
		System.out.println(i);
		int j = s1.indexOf("java", 11);
		System.out.println(j);
	}
}


/* 
 
 OP
 ---
 0
24

 can find out a particular character where it is available  indexOf()
 
 */
