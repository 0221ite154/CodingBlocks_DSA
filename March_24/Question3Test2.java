package March_24;

import java.util.Arrays;
import java.util.Scanner;

public class Question3Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,4,7,9};
		int arr2[]= {2,3,6};
		
		int arr[]=new int[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++) {
			arr[i]=arr1[i];
		}
		int j=0;
		for(int i=arr1.length;i<arr.length;i++) {
			arr[i]=arr2[j];
			j++;
		}
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
