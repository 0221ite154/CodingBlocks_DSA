package March_23rd;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<=n-1;i++) {
			arr[i]=sc.nextInt();
		}
		int target = sc.nextInt();
		boolean m =false;
		int start=0;
		int end = n-1;
		
		while(start<=end) {
			int mid =(start+end)/2;
			
			if(arr[mid]==target) {
				System.out.println(mid);
				m=true;
				break;
			}
			if(arr[mid]<target) {
				start=mid+1;
			}else {
				end=mid-1;
			}
			
		}
		
		if(m==false) {
			System.out.println(-1);
		}
		

	}

}
