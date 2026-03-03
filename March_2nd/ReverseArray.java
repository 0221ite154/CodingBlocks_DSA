package March_2nd;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[]= new int[n];
		for(int i=0;i<=n-1;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n/2;i++) {
			int temp=arr[i];
			arr[i]=arr[n-i-1];
			arr[n-i-1]=temp;
		}
		
		//print array
		for(int i=0;i<=n-1;i++) {
			System.out.print(arr[i]+" ");
		}
		

	}

}
