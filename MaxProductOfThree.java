package org.codility;

import java.util.Arrays;

public class MaxProductOfThree{

    public static int solution(int[] A) {
        // write your code in Java SE 8
    	Arrays.sort(A);
    	int maxTwo = Integer.MIN_VALUE;
    	int index1 = 0;
    	int max = Integer.MIN_VALUE;
    	for(int i = 0 ; i < A.length ; i++){
    		if(A[i]  > max ){
    			max = A[i];
    			index1 = i;
    		}
    	}
    	for(int i = 0 ; i < A.length-1 ; i++){
    		if((max*(A[i]*A[i+1])) > maxTwo && index1 != i && index1 != i+1){
    			maxTwo = (max*(A[i]*A[i+1]));
    		}
    	}
    	return maxTwo;

    }
	public static void main(String[] args) {
		int []A = {10,2,0,-10,-20,-20,100};
		System.out.println(solution(A));
	}

}