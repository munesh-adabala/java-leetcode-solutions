package lc_roman_to_int_13;

import java.util.HashMap;

public class Solution {

	public static void main(String[] args) {
		System.out.println(romanToInt("XII"));
	}

	public static int romanToInt(String s) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		char[] arr = s.toCharArray();
		int num = 0;
		for (int i = 0; i < arr.length; ++i) {
			int current = map.get(arr[i]);
			if (i + 1 < arr.length) {
				int next = map.get(arr[i + 1]);
				if (current < next) {
					num -= current;
				} else {
					num += current;
				}
			} else {
				num += current;

			}
		}
		return num;
	}

}
