package March_3rd;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//5
		int arr[]=new int[n];
		
		//input
		for(int i=0;i<=n-1;i++) {
			arr[i]=sc.nextInt();
		}
		//7 6 5 4 3
		
		//sorting the array
		      
		       // 0    4
		for(int i=0;i<=n-1;i++) {
			//        1    5
			for(int j=1;j<=n-i-1;j++) {
				if(arr[j-1]>arr[j]) {
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		//printing array
		
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
