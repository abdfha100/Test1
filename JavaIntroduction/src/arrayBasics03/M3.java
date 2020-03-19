package arrayBasics03;

//Printing the index of the desired number

public class M3 {
	public static void main(String[] args) {
		
		int a[] = {2,5,8,7,4,6,3};
		for (int i =0; i< a.length; i++) {
			
			if(a[i] == 7) {
				System.out.println(i);
				break;
			}
		}
	}
}
