package March_16th;

import java.util.Scanner;

public class OccuranceOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int target = sc.nextInt();
		
		int count=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==target) {
				count++;
			}
		}
		System.out.println(count);

	}

}
