package assignment1;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		int[] arr = new int[]{5,3,7,4,6,5};
		Arrays.sort(arr);
		int second = arr[arr.length-2];
		if(second>=0) {
			System.out.print(second);
		}else {
			System.out.print("error, less than 2 element");
		}
	}
}
