package lc_product_arr_except_itself_238;

public class Solution {

	public static void main(String[] args) {
		int[] input = new int[] { 1, 2, 3, 4 };
		System.out.println(productExceptSelf(input));
	}

	private static int[] productExceptSelf(int[] nums) {
		int[] output = new int[nums.length];
		int prefix = 1;
		for (int i = 0; i < nums.length; ++i) {
			output[i] = prefix;
			prefix *= nums[i];
		}
		int postfix = 1;

		for (int i = nums.length - 1; i >= 0; --i) {
			output[i] *= postfix;
			postfix *= nums[i];
		}
		return output;
	}

}
