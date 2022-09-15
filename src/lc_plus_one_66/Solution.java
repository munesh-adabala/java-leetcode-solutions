package lc_plus_one_66;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		int[] input = new int[] {9,9,9};
		System.out.println(Arrays.toString(plusOne(input)));
	}
	
	private static int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;--i){
            if(digits[i] != 9){
                ++digits[i];
                return digits;
            }else{
                digits[i] = 0;
            }
        }
        int[] fd = new int[digits.length+1];
        fd[0] =1;
        return fd;
    }

}
