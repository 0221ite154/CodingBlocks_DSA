package Feb_27th;

import java.util.Scanner;

public class ReverseArrayRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		//reverse
		int n = sc.nextInt();
		int m = sc.nextInt();
		while(m>n) {
			int temp=arr[n];
			arr[n]=arr[m];
			arr[m]=temp;
			m--;
			n++;
		}
		
		//print
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		

	}

}
