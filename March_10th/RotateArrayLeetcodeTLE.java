package March_10th;

public class RotateArrayLeetcodeTLE {
	
	public void rotate(int[] nums, int k) {
        while(k!=0){
            int prev=nums[0];
        for(int i=0;i<=nums.length-1;i++){
            int temp= nums[(i+1)%nums.length];
            nums[(i+1)%nums.length]=prev;
            prev=temp;
        }
        k--;
        }
    }

}
