package March_16th;

import java.util.Arrays;

public class MajorityElement {
	public static int Majority(int nums[]) {
		Arrays.sort(nums);
		return nums[nums.length/2];
	}

}
