package March_2nd;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//i) take input size from user
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		//ii) create an array of size input
		int arr[]=new int[size];
		//iii) take input of every index of an array
		for(int i=0;i<=size-1;i++) {
			arr[i]=sc.nextInt();
		}
		//iv) take target as a input
		int target = sc.nextInt();
		//v) traverse the array and check if the array value is equal to target
		for(int i=0;i<=size-1;i++) {
		//vi)if value equals to target just print index
			if(arr[i]==target) {
				System.out.println(i);
			}
		}

	}

}
