package Feb_16th;
import java.util.*;
public class fibonacci {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int prev=0;
	int curr=1;
	int next=prev+curr;
	while(n!=0) {
		System.out.println(prev);
		prev=curr;
		curr=next;
		next=prev+curr;
		n--;
	}
}
	
	
	
	
}
