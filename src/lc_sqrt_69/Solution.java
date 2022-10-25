package lc_sqrt_69;

public class Solution {

	public static void main(String[] args) {
		//Prints sqrt of given number or nearest sqrt
		System.out.println("SQRT of given num "+mySqrt(8));

	}
	
	public static int mySqrt(int x) {
        if(x<=1){
            return x;
        }
        
        int start = 1;
        int end = x/2;
        while(start<end){
            int mid = (start + (end-start)/2)+1;
            int div = x/mid;
            if(div == mid){
                return mid;
            }
            
            if(div> mid){
                start = mid;
            }else{
                end = mid -1;
            }
        }
        return start;
    }

}
