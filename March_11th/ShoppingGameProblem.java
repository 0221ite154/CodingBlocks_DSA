package March_11th;

import java.util.Scanner;

public class ShoppingGameProblem {
	 public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        while(n!=0){
	        int ayush = sc.nextInt();
	        int harshit= sc.nextInt();
	        int i=1;
	        while(ayush>=0 && harshit>=0){
	            if(i%2==0){
	                harshit-=i;
	            }else{
	                ayush-=i;
	            }
	            if(ayush<0){
	                System.out.println("Harshit");
	            }
	            if(harshit<0){
	                System.out.println("Aayush");
	            }
	            i++;
	        }
	       n--;
	       }

	        
	    }
	}