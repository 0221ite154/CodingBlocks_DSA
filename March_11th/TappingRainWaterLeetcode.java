package March_11th;

public class TappingRainWaterLeetcode {
	
	public int trap(int[] height) {
        int max=0;
        int idx=0;
        int sum=0;
        for(int i=0;i<height.length;i++){
            if(max<=height[i]){
                idx=i;
                max=height[i];
            }
            sum+=max-height[i];
        }
        max=0;

        for(int i=height.length-1;i>idx;i--){
            if(max<=height[i]){
                max=height[i];
            }
            sum+=max-height[i];
        }
        


        for(int i=idx;i<=height.length-1;i++){
            sum-=height[idx]-height[i];
        }
        return sum;
    }
}
}
