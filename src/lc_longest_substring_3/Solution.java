package lc_longest_substring_3;

import java.util.LinkedHashSet;
import java.util.Set;

public class Solution {

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("bbbb"));
	}

	private static int lengthOfLongestSubstring(String s) {
		char[] chars = s.toCharArray();
		int left = 0;
		int max = 1;
		Set<Character> set = new LinkedHashSet<Character>();
		for (int right = 0; right < s.length(); ++right) {
			while (set.contains(chars[right])) {
				set.remove(chars[left]);
				left += 1;
			}
			set.add(chars[right]);
			max = Math.max(max, right - left + 1);
		}

		return max;
	}

}
