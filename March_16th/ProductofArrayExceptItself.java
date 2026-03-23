package March_16th;

public class ProductofArrayExceptItself {
	    public int[] productExceptSelf(int[] nums) {
	        int ans[]=new int[nums.length];
	        int countZero = 0;
	        int mul=1;
	        for(int i = 0;i < nums.length;i++){
	            if(nums[i]==0){
	                countZero++;
	            }else{
	                mul*=nums[i];
	            }
	        }
	        if(countZero>1) return ans;

	        if(countZero==0){
	            for(int i=0;i<nums.length;i++){
	            ans[i]=mul/nums[i];
	            }
	        }else{
	            for(int i=0;i<nums.length;i++){
	                if(nums[i]==0){
	                    ans[i]=mul;
	                }else{
	                    ans[i]=0;
	                }
	            
	            }
	        }
	        return ans;

	    }
	
}
