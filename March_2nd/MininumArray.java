package March_2nd;

import java.util.Scanner;

public class MininumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int arr[]=new int[size]; //created array

		for(int i=0;i<=size-1;i++) {
			arr[i]=sc.nextInt();
		}
		int min=arr[0];
		for(int i=0;i<=size-1;i++) {
			min=Math.min(min, arr[i]);
		}
		System.out.println(min);

	
}


}
