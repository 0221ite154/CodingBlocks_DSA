package March_2nd;

import java.util.Scanner;

public class PrintReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<=size-1;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int j=size-1;j>=0;j--) {
			System.out.print(arr[j]+ " ");
		}
		

	}

}
