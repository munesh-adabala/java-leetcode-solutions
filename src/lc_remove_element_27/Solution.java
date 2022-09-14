package lc_remove_element_27;

public class Solution {

	public static void main(String[] args) {
		int[] input = new int[] {0,1,1,2,2,3,4,5,2,4,4};
		int removeElement = 2;
		int size = removeElement(input, removeElement);
		System.out.println("After removing the element "+removeElement);
		for(int i=0;i<size;++i) {
			System.out.println(input[i]);
		}
	}
	
	private static int removeElement(int[] nums, int val) {
        int j=0;
        for(int i=0;i<nums.length;++i){
            if(nums[i]!=val){
             nums[j] = nums[i];
                ++j;   
            }
        }
        return j;
    }

}
