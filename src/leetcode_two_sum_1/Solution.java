package leetcode_two_sum_1;

import java.util.Arrays;
import java.util.HashMap;

class Solution {

	public static void main(String[] args) {
		int[] input = new int[] { 2, 5, 3, 5, 6, 13 };
		int target = 7;
		System.out.println("Two sum " + Arrays.toString(twoSum(input, target)));
	}

	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(nums[0], 0);
		for (int i = 1; i < nums.length; ++i) {
			int req = target - nums[i];
			if (map.get(req) != null) {
				return new int[] { map.get(req), i };
			}
			map.put(nums[i], i);
		}
		return null;
	}
}
