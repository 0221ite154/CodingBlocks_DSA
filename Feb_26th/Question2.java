package Feb_26th;
import java.util.Scanner;
public class Question2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1;i<=n/2+1;i++) {
			for(int j=1;j<=n/2+1-i;j++) {
				System.out.print("\t");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*\t");
			}
			System.out.println();
		}
		//down pattern
		for(int i=1;i<=n/2;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("\t");
			}
			for(int j=1;j<=2*(n/2-i)+1;j++) {
				System.out.print("*\t");
			}
			System.out.println();
			
		}
		
	}

}
