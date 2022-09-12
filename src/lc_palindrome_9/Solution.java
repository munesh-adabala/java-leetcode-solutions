package lc_palindrome_9;

public class Solution {

	public static void main(String[] args) {

	}
	
	 private static boolean isPalindrome(int x) {
	        if(x<0 || (x % 10 == 0 && x != 0)){
	            return false;
	        }
	        int rev = 0;
	        int num = x;
	        while(num !=0 ){
	            rev = rev * 10 + num % 10;
	            num /= 10;
	        }
	        return rev == x;
	    
	    }

}
