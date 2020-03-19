package app3;

public class M35 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("hellotoall");
		                                  //0123456789    
		System.out.println(sb);
		sb.delete(2, 6);
		System.out.println(sb);
	}

}

/*
hellotoall
heoall


1st argument and 
here 2- inclusive
and  4- exclusive


 */