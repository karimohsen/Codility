package org.codility;

import java.util.HashSet;
import java.util.Set;

public class Distinct {
    public static int solution(int[] A) {
        // write your code in Java SE 8
        Set<Integer> set= new HashSet<>();
    	for(int i = 0 ; i < A.length ; i++){
    		set.add(A[i]);
    	}
    	return set.size();
    }
     public static void main(String[] args) {
		int []A = {1,2,1,2,3,5,6,4};
		System.out.println(solution(A));
	}
}
