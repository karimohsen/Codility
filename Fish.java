package org.codility;

import java.util.*;

public class Fish {
	
	public static int solution(int[] A, int[] B){
		Stack<Integer> fish = new Stack<>();
		int safe = 0 ;
		for(int i = 0 ; i < A.length ; i++){
			if(fish.isEmpty()){
				if(B[i]==0)
					safe++;
				else
					fish.add(A[i]);
			}
			else{
				if(B[i]==1)
					fish.add(A[i]);
				else{
					if(fish.peek() < A[i]){
						while(!fish.isEmpty() && fish.peek() < A[i]){
							fish.pop();
						}
						i--;
					}
				}
			}
		}
		return fish.size()+safe;	
	}
	
	public static void main(String [] args) {
		int [] arr = {4,6,3,2,1,5};
		int [] arr2 = {0,1,1,0,0,0};
		System.out.println(solution(arr, arr2));
	}
}
