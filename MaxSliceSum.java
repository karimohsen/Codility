package org.codility;

public class MaxSliceSum{

	public static int solution(int[] A) {
		// write your code in Java SE 8
		int max_slice = 0 , max = Integer.MIN_VALUE;
		for(int i = 0 ; i < A.length ; i++){
			max_slice = Math.max(A[i], max_slice+A[i]);
			max = Math.max(max_slice, max);
		}
		return max;
	}

	public static void main(String[] args) {
		int[] arr = {-8,-6,0,4};
		System.out.println(solution(arr));
	}

}
