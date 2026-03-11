package March_10th;

public class ReverseIntegerLeetcode {
	    public int reverse(int x) {
	        boolean m = true;
	        if(x<0){
	            m=false;
	            x=-1*x;
	        } 
	        long sum=0;
	        while(x>0){
	            sum= sum*10+x%10;
	            x=x/10;
	        }
	        if(sum>2147483647 || sum<-1*2147483647) return 0;
	        if(m==false) return (int)(-1*sum);
	        return (int)sum;
	    }
}
