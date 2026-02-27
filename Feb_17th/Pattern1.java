package Feb_17th;

/*
Pattern 1
input = 5

*
**
***
****
*****


 */
public class Pattern1 {
	public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
