package March_14th;

public class FindPivotIndex {
	 public int pivotIndex(int[] nums) {
	        int LHS =0;
	        int RHS = 0;
	        for(int i=0;i<=nums.length-1;i++){
	            RHS=RHS+nums[i];
	        }

	        for(int i=0;i<=nums.length-1;i++){
	            RHS=RHS-nums[i];
	            if(RHS==LHS){
	                return i;
	            }
	            LHS=LHS+nums[i];
	        }
	        return -1;
	    }
	}

}
