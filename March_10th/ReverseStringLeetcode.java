package March_10th;

public class ReverseStringLeetcode {
	public static void reverseString(char[] s) {
        int start=0;
        int end = s.length-1;
        while(start<end){
        	
        	//swap
            char temp=s[start];
            s[start]=s[end];
            s[end]=temp;
            start++;
            end--;
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] a = {'h','e','l','l','o'};
		reverseString(a);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
