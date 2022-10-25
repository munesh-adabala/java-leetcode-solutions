package lc_pascal_triangle_118;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> result = generate(5);
		for (List<Integer> arr : result) {
			System.out.println(arr.toString());
		}
	}

	private static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new ArrayList<>();
		for (int i = 0; i < numRows; ++i) {
			List<Integer> list = new ArrayList<>();
			list.add(0, 1);
			if (i > 0) {
				List prev = result.get(i - 1);
				for (int j = 1; j < i; ++j) {
					int val = (int) prev.get(j - 1) + (int) prev.get(j);
					list.add(val);
				}
				list.add(i, 1);
			}
			result.add(list);
		}
		return result;

		// using arrays
//		int[][] result= new int[numRows][];
//        for(int i=0;i<numRows;++i){
//            int[] arr = new int[i+1];
//            arr[0] = 1;
//            arr[arr.length-1] = 1;
//            if(i>1){
//            	int[] temp = result[i-1];
//                int j = 1;
//                while(j<arr.length-1){
//                arr[j] = temp[j-1]+temp[j];
//                    ++j;
//                }
//                
//            }  
//            result[i] = arr;
//        }
//        return result;
	}

}
