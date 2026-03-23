package March_13th;

import java.util.Scanner;

public class PrintReverse {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int size = sc.nextInt();
			
			int arr[]=new int[size]; //creating array
			//[5][5][0][5][0]
			arr[3]=5;
			
			
			
			//input in an aray
			for(int i=0;i<=size-1;i++) {
				arr[i]=sc.nextInt();
			}
			
			//print
			
			for(int i=size-1;i>=0;i--) {
				System.out.print(arr[i]+" ");
			}

		}

	}
