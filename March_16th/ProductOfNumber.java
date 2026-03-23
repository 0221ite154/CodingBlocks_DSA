package March_16th;

import java.util.Scanner;

public class ProductOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=1;
		while(n!=0) {
			sum=sum*(n%10);
			n=n/10;
		}
		System.out.println(sum);

	}

}
