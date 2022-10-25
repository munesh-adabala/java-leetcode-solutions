package lc_climbing_stairs_70;

public class Solution {
	public static void main(String[] args) {
		System.out.println(climbStairs(5));
	}

	private static int climbStairs(int n) {
		if (n < 2) {
			return 1;
		}
		int s1 = 1;
		int s2 = 1;
		int sol = 0;
		for (int i = 0; i < n - 1; ++i) {
			sol = s1 + s2;
			s1 = s2;
			s2 = sol;
		}
		return sol;
	}

}
