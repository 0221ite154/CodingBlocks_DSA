package Feb_24;

import java.util.Scanner;

public class PrintArray {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int size= sc.nextInt();
		int arr[]=new int[size];
		//input
		for(int i=0;i<=size-1;i++) {
			arr[i]=sc.nextInt();
		}
		
		//printing 
		for(int i=0;i<=size-1;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
