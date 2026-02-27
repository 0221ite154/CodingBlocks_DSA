package Feb_24;

import java.util.Scanner;

public class MinimumNumber {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int size= sc.nextInt();
		int arr[]=new int[size];
		//input
		for(int i=0;i<=size-1;i++) {
			arr[i]=sc.nextInt();
		}
		
		int max=arr[0];
		for(int i=0;i<size;i++) {
			if(arr[i]<max) {
				max=arr[i];
			}
		}
		System.out.println(max);
		
		
	}
	}


