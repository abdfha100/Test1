package pack2;

public class M9 {
	public static void main(String[] args) {
		String s1 = "abc xyz hello 123";
		
		String[] splits= s1.split(" ");
		
		for(String split: splits)
		{
			System.out.println(split);
		}

	}
}

/*
abc
xyz
hello
123

 */