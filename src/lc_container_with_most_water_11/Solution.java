package lc_container_with_most_water_11;

public class Solution {

	public static void main(String[] args) {
		int[] input = new int[] {1,4,2,5,6,7,8,5};
		System.out.println(maxArea(input));
	}
	
	private static int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxArea = 0;
        int width = right;
        while(left<right){
            int ht = Math.min(height[left],height[right]);
            int area = ht * width;
            maxArea = Math.max(maxArea,area);
            if(height[left] > height[right]){
                --right;
            }else{
                ++left;
            }
            --width;
        }
        return maxArea;
    }

}
