package March_11th;

import java.util.Scanner;

public class BostonNumber {
	    public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int copyn=n;
	        int sum=0;
	        int i=2;
	        while(n!=1){
	            if(n%i==0){
	                int temp=i;
	                while(temp>0){
	                    sum+=temp%10;
	                    temp=temp/10;
	                }
	                n=n/i;
	            }else{
	                i++;
	            }
	        }
	        n=copyn;
	        while(copyn>0){
	            sum-=copyn%10;
	            copyn=copyn/10;
	        }

	        if(sum!=0){
	            System.out.println(0);
	        }else{
	            System.out.println(1);
	        }
	        
	    }
	}