package stringBuffer03;

public class M35 {
public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("hellotoall");
		                                  //0123456789
		System.out.println(sb);
		
		sb.delete(5,7);
	
		System.out.println(sb);		
	}

}

/*
delete()
1-arg is inclusive
2-arg is exclusive

OP
---
hellotoall
helloall

 */