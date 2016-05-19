package org.codility;

import java.util.Arrays;

public class Triangle {
	public static int solution (int[] A) {
		// write your code in Java SE 8
		Arrays.sort(A);
		
		int result = 0 ;
		if(A.length < 3){
			return 0;
		}
		for(int i = 0 ; i <= A.length-3 ; i++){
			
			if((Math.abs(A[i]-A[i+1]) < A[i+2]) && (Math.abs(A[i+2]-A[i+1]) < A[i]) && (Math.abs((A[i+2]-A[i])) < A[i+1])){
				result = 1; 
				break;
			}
		}
		return result ;
	}

	public static void main(String[] args) {
		int [] arr = {10,2,8};
		System.out.println(solution(arr));
	}
}
