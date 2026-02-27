package Feb_23;

import java.util.Scanner;

public class TakeInputinArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size= sc.nextInt();
		int arr[]=new int[size];
		
		for(int i=0;i<=size-1;i++) {
			arr[i]=sc.nextInt();
		}

	}

}
