package app3;

public class M36 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("hellotoall");
		                                  //0123456789    
		System.out.println(sb);
		sb.delete(2, 30);
		System.out.println(sb);
	}
}

/*
hellotoall
he

2nd argunmet can be beyond
there is no 30th index, but it will go end i.e last index and it will dellete and no exception 
 
 
 */