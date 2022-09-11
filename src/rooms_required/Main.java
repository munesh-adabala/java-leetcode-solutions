package rooms_required;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		int arr[][] = new int[5][];
		arr[0] = new int[] {1,2};
		arr[1] = new int[] {3,5};
		arr[2] = new int[] {2,4};
		arr[3] = new int[] {5,6};
		arr[4] = new int[] {4,5};

		System.out.println("Num of rooms required "+getRequiredRooms(arr));	
	}
	
	private static int getRequiredRooms(int[][] arr) {
		
		if(arr.length == 0) {
			return 0;
		}
		
		Arrays.sort(arr,new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0] > o2[0]) {
					return 1;
				}
				return -1;
			}
		});
		
		int rooms = 1;
		
		for(int i = 0;i<arr.length-1;++i) {
			if(arr[i][1] > arr[i+1][0]) {
				++rooms;
			}
		}
		return rooms;
	}
}
