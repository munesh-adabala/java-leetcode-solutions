package lc_valid_palindrome_125;

public class Solution {

	public static void main(String[] args) {
		String s = "rac  a car";
		System.out.println(isPalindrome(s));
	}

	private static boolean isPalindrome(String s) {
		String input = s.toLowerCase();
		int i = 0;
		int j = input.length() - 1;
		while (i < j) {
			char l = input.charAt(i);
			char r = input.charAt(j);
			if (!isAlphanum(l)) {
				++i;
				continue;
			}
			if (!isAlphanum(r)) {
				--j;
				continue;
			}
			if (l != r) {
				return false;
			}
			++i;
			--j;
		}
		return true;
	}

	private static boolean isAlphanum(char c) {
		if ((c >= 97 && c <= 122) || (c >= 48 && c <= 57)) {
			return true;
		}
		return false;
	}
}
