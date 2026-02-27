package Feb_26th;
import java.util.*;
public class Question3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			//space
			for(int j=1;j<=i-1;j++) {
				System.out.print("\t");
			}
			for(int j=n-i+1;j>=0;j--) {
				System.out.print(j+"\t");
			}
			for(int j=1;j<=n-i+1;j++) {
				System.out.print(j+"\t");
			}
			
			System.out.println();
		}
		for(int i=1;i<=n;i++) {
			System.out.print("\t");
		}
		System.out.println(0);
		
		
		for(int i=1;i<=n;i++) {
			//space
			for(int j=1;j<=n-i;j++) {
				System.out.print("\t");
			}
			for(int j=i;j>=0;j--) {
				System.out.print(j+"\t");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j+"\t");
			}
			
			System.out.println();
		}
		
	}

}

