package Feb_25th;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(1);
		for(int i=2;i<=n;i++) {
			System.out.print(i+" ");
			for(int j=1;j<=i-2;j++) {
				System.out.print("0 ");
			}
			System.out.print(i);
			System.out.println();
		}

	}

}
