package lc_length_of_lastword_58;

public class Solution {

	public static void main(String[] args) {
		String input = " this is test word  ";
		System.out.println(lengthOfLastWord(input));

	}

	private static int lengthOfLastWord(String s) {
		int len = 0;
		for (int i = s.length() - 1; i >= 0; --i) {
			if (s.charAt(i) != ' ') {
				++len;
			} else {
				if (len == 0) {
					continue;
				}
				break;
			}
		}
		return len;
	}

}
