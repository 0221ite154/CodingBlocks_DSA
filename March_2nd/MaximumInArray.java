package March_2nd;

import java.util.Scanner;

public class MaximumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int arr[]=new int[size]; //created array
		//[0][0][0][0][0]
		// 0  1  2  3  4

		for(int i=0;i<=size-1;i++) {
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		for(int i=0;i<=size-1;i++) {
			max=Math.min(max, arr[i]);
		}
		System.out.println(max);

	}

}
