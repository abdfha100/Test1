package app3;

public class M12 {
	public static void main(String[] args) {
		String s1 = "abc xyz hello.java      123,test";
		String[] splits = s1.split("[\\s,.]+");
		for(String split : splits)
		{
			System.out.println(split);
		}
	}
}

/*
 
 .dot,
 
 one spce or mul spa
 one dot or mul dot
 one , or mul ,
 
 it will read in the proper format..
 
 
 OP
 --
 
 abc
xyz
hello
java
123
test

 */