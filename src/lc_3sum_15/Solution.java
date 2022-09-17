package lc_3sum_15;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		int[] input = new int[] { -1, -4, -1, 0, 1, 2, 1 };
		List<List<Integer>> output = threeSum(input);
		for (List<Integer> item : output) {
			System.out.println(item.toString());
		}
	}

	private static List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> output = new LinkedList<List<Integer>>();
		for (int i = 0; i < nums.length - 2; ++i) {
			if (i == 0 || (nums[i] != nums[i - 1])) {
				int left = i + 1;
				int right = nums.length - 1;
				int sum = 0 - nums[i];
				while (left < right) {
					if (sum == nums[left] + nums[right]) {
						output.add(Arrays.asList(nums[i], nums[left], nums[right]));
						while (left < right && nums[left] == nums[left + 1]) {
							++left;
						}
						while (left < right && nums[right] == nums[right] - 1) {
							++right;
						}
						++left;
						--right;
					} else if (nums[left] + nums[right] > sum) {
						--right;
					} else {
						++left;
					}
				}

			}
		}
		return output;
	}

}
