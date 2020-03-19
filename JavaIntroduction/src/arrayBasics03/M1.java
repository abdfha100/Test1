package arrayBasics03;

//Sum of numbers in the array using while loop
public class M1 {
	public static void main(String[] args) {
		int a[] = {2,5,8,7,4 };
		int sum=0;
		
		int i=0;
		while(i<a.length) {
			sum = sum + a[i];
			i++;
		}
		System.out.println(sum);
	}

}
