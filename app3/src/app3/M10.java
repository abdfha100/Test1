package app3;

public class M10 {
	public static void main(String[] args) {
		String s1 = "abc xyz hello 123";
		String[] splits = s1.split("\\s");
		for(String split : splits)
		{
			System.out.println(split);
		}
	}
}
