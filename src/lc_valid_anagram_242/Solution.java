package lc_valid_anagram_242;

public class Solution {

	public static void main(String[] args) {
		String s = "nagaram";
		String t = "anagram";
		System.out.println(isAnagram(s, t));
	}

	private static boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		int[] temp = new int[26];
		for (int i = 0; i < s.length(); ++i) {
			temp[s.charAt(i) - 'a']++;
			temp[t.charAt(i) - 'a']--;
		}

		for (int val : temp) {
			if (val != 0) {
				return false;
			}
		}
		return true;
	}
}
