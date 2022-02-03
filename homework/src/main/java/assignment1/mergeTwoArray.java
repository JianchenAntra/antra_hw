package assignment1;


public class mergeTwoArray {
	public static int[] merge(int[] arr1, int[] arr2) {
		int length = arr1.length + arr2.length;
		int[] sum  = new int[length];
		int pointer = 0;
		for(int i = 0; i < arr1.length; i ++) {
			sum[pointer] = arr1[i];
			pointer++;
		}
		for(int j = 0; j < arr2.length; j++) {
			sum[pointer] = arr2[j];
			pointer ++;
		}
		
		return sum;
		
	}

	public static void main(String[] args) {
		
		int[] arr1 = new int[] {1,2,3,4,5};
		int[] arr2 = new int[] {6,7,8};
		int[] sum = merge(arr1, arr2);
		for(int i : sum) System.out.print(i);
		
	}
}
