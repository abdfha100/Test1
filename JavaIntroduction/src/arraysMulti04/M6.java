package arraysMulti04;

/*
2 4 5
3 2 10
1 2 0

find the lowest number and the print highest number from that column...

step1: find the minimum number.
step2: Identify the column of minimum number
step3: find the maximum number in identified column 
 */

public class M6 {
	public static void main(String[] args) {
		
		int abc[][] = {{2,4,5},{3,2,10},{1,2,0}};
		int min= abc[0][0];
		int mincol=0;
		
		for(int i=0; i<3; i++) {
			
			for(int j=0; j<3; j++) {
				if(abc[i][j] < min ) {
					min = abc[i][j];
					mincol = j;
				}
			}
		}
		int max = abc[0][mincol];
		int k=0;
		while(k <3) {
			if(abc[k][mincol] > max) {
				max = abc[k][mincol];
			}
			k++;
		}
		System.out.println(max);
	}
}
