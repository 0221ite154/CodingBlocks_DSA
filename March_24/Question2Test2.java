package March_24;

import java.util.Scanner;

public class Question2Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		String a[]=new String[n];
		for(int i=0;i<n;i++) {
			//a[i]= arr[i]%2==0 ? "Even" : "Odd";
			
			if(arr[i]%2==0) {
				a[i]="Even";
			}else {
				a[i]="Odd";
			}
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(a[i]);
		}
		

	}

}
