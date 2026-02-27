package Feb_20th;

/*
Pattern 8 - Hollow Right Triangle
input = 5

*
**
* *
*  *
*****

*/
public class Pattern8 {
	public static void main(String[] args) {
		int n = 5;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {

				if (j == 1 || j == i || i == n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}