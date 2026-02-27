package Feb_18th;

/*
Pattern 10 - Pascal’s Triangle
input = 5

1
11
121
1331
14641

*/
public class Pattern10 {
	public static void main(String[] args) {
		int n = 5;

		for (int i = 0; i < n; i++) {
			int num = 1;

			for (int j = 0; j <= i; j++) {
				System.out.print(num);
				num = num * (i - j) / (j + 1);
			}

			System.out.println();
		}
	}
}