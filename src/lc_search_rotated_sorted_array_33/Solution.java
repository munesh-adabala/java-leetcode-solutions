package lc_search_rotated_sorted_array_33;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = new int[] {4,5,6,0,1,2,3};
		System.out.println(search(input, 2));

	}
	
	public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
    
        while(left <= right){
            int mid = (left+right)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] >= nums[left]){
                if(target > nums[mid] || target < nums[left]){
                    left = mid +1;
                }else{
                    right = mid - 1;
                }
                
            }else{
                if(target < nums[mid] || target > nums[right]){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }
        }
        return -1;
    }

}
