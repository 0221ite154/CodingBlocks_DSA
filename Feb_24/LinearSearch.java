package Feb_24;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size= sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<=size-1;i++) {
			arr[i]=sc.nextInt();
		}
		int target=sc.nextInt();//3
		for(int i=0;i<=size-1;i++) {
			if(arr[i]==target) {
				System.out.println(i);
				break;
			}
		}

	}

}
