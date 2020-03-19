package arrayBasics03;

//Sum of numbers in the array using for loop


public class M2 {
	public static void main(String[] args) {
		
		int a[] = {2,5,8,7,4};
		int sum=0;
		
		for (int i=0; i<a.length; i++) {
			sum= sum + a[i];
		}
		System.out.println(sum);
	}
}

