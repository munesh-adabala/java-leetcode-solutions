package lc_max_subarray_sum_53;

public class Solution {

	public static void main(String[] args) {
		int[] input = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(maxSubArray(input));
	}

	private static int maxSubArray(int[] nums) {
		int max = Integer.MIN_VALUE;
		int temp_max = 0;
		for (int i = 0; i < nums.length; ++i) {
			temp_max += nums[i];
			max = Math.max(max, temp_max);
			if (temp_max < 0) {
				temp_max = 0;
			}
		}
		return max;
	}

}
