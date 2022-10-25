package lc_mergesortedarray_88;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		int[] nums1 = new int[] { 1, 5, 6, 8, 0, 0, 0 };
		merge(nums1, 4, new int[] { 2, 3, 7 }, 3);
		System.out.println(Arrays.toString(nums1));
	}

	private static void merge(int[] nums1, int m, int[] nums2, int n) {
		int i = 0, j = 0;
		if (nums1.length == 0 || nums2.length == 0) {
			return;
		}
		while (i < nums1.length && j < n) {
			if (nums1[i] <= nums2[j]) {
				if (i == m) {
					nums1[i] = nums2[j];
					++j;
					m += 1;
				}

			} else {
				int temp = m;
				while (temp != i) {
					nums1[temp] = nums1[temp - 1];
					temp -= 1;
				}
				nums1[i] = nums2[j];
				++j;
				m += 1;
			}
			++i;
		}
	}

}
