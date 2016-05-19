package org.codility;

public class MaxCounters {
	public static int[] solution(int N, int[] A) {
        // write your code in Java SE 8
		int res[] = new int [N];
		int maxCounter=0;
		int incrementor = 0 ;
		for(int i = 0 ; i < A.length ; i++){
			if(A[i]== (N+1)){
				maxCounter = incrementor;
			}
			else{
				if(res[A[i]-1] < maxCounter){
					res[A[i]-1] = maxCounter;
				}
				res[A[i]-1] += 1 ;
				if(res[A[i]-1] > incrementor)
					incrementor = res[A[i]-1];
			}
		}
		
		for(int i = 0 ; i < res.length ; i++){
			if(res[i] < maxCounter )
				res[i] = maxCounter;
		}
		return res;
    }

	public static void main(String[] args) {
		int [] temp = {3,4,4,6,1,4,4};
		int [] arr = solution(5,temp);
		for(int i = 0 ; i < arr.length ; i++){
			System.out.println(arr[i]);
		}
	}
}
