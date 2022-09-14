package lc_remove_duplicates_26;

public class Solution {

	public static void main(String[] args) {
		int[] arr = new int[] { 0, 0, 1, 1, 1, 2, 3, 3, 4, 4, 5 };
		int val = removeDuplicates(arr);
		System.out.println("After removing duplicates");
		for (int i = 0; i < val; ++i) {
			System.out.println(arr[i]);
		}
	}

	private static int removeDuplicates(int[] nums) {
		int j = 1;
		for (int i = 0; i < nums.length - 1; ++i) {
			if (nums[i] != nums[i + 1]) {
				nums[j] = nums[i + 1];
				++j;
			}
		}
		return j;
	}

}
