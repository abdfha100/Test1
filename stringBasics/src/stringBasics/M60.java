package stringBasics;

public class M60 {
	public static void main(String[] args) {
			String s1 = "hello";
			
			for(int i = s1.length()-1; i >= 0; i--)
			{
				System.out.println(s1.substring(i, i+1));
			}
		}
}


/*
 
o
l
l
e
h
 */