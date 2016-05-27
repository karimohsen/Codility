package org.codility;

public class MaxProfit{

	public static int solution(int[] A) {
		// write your code in Java SE 8
		int max_slice = 0 , max = 0;
		for(int i = 1 ; i <= A.length-1 ; i++){
			max_slice = Math.max(0, max_slice+(A[i]-A[i-1]));
			max = Math.max(max_slice, max);
		}
		return max;
	}

	public static void main(String[] args) {
		int[] arr = {23171,21011,21123,21366,21013,21367};
		System.out.println(solution(arr));
	}

}
