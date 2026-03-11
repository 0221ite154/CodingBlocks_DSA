package March_2nd;

import java.util.Scanner;

public class TakeInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[]=new int[n]; //created array of size n
		//input
		for(int i=0;i<=n-1;i++) {
			arr[i]=sc.nextInt();
		}
		
		//print
		for(int i=0;i<=n-1;i++) {
			System.out.print(arr[i]+" ");
		}
		

	}

}
