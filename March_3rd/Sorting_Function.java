package March_3rd;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting_Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]=new int[3];
		arr[0]=1;
		arr[1]=9;
		arr[2]=2;
		
		Arrays.sort(arr);
		
		//print
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
