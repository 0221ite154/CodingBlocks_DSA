package March_3rd;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//reverse an array with while loop
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[]=new int[n];
		//input
		for(int i=0;i<=n-1;i++) {
			arr[i]=sc.nextInt();
		}
		
		int i=sc.nextInt();
		int j=sc.nextInt();
		while(j>i) {
			//swap
			int temp = arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		
		//print array
		for(int k=0;k<=n-1;k++) {
			System.out.print(arr[k]+" ");
		}

	}

}
