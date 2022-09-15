package lc_insert_search_35;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = new int[] { 1, 3, 4, 6, 7, 8 };
		int target = 5;
		System.out.println(searchInsert(input, target));
	}

	private static int searchInsert(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;
		int mid = left + right / 2;
		if (target > nums[right]) {
			return right + 1;
		} else if (target < nums[left]) {
			return left;
		}

		while (left < right) {
			if (target == nums[mid]) {
				return mid;
			} else if (target < nums[mid]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}

			mid = left + (right - left) / 2;
		}

		if (target <= nums[mid]) {
			return mid;
		} else {
			return mid + 1;
		}
	}

}
