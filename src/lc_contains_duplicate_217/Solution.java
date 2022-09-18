package lc_contains_duplicate_217;

import java.util.HashSet;
import java.util.Set;

public class Solution {

	public static void main(String[] args) {
		int[] input = new int[] { 1, 2, 3, 4, 1 };
		System.out.println(containsDuplicate(input));
	}

	private static boolean containsDuplicate(int[] nums) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < nums.length; ++i) {
			if (set.add(nums[i]) == false) {
				return true;
			}
		}
		return false;
	}

}
