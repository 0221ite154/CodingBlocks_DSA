package March_24;

import java.util.Scanner;

public class Question1Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<=n-1;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<=n-1;i++) {
			arr[i]=arr[i]*arr[i];
			System.out.print(arr[i]+" ");
		}
		
		

	}

}
