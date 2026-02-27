package Feb_24;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int size= sc.nextInt();
		int arr[]=new int[size];
		//input
		for(int i=0;i<=size-1;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<size/2;i++) {
			int temp=arr[i];
			arr[i]=arr[size-i-1];
			arr[size-i-1]=temp;
		}
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
