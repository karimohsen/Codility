package org.codility;

public class MinAvgTwoSlice {
	public static int solution (int[] A) {
		// write your code in Java SE 8
		double minAvg = Double.MAX_VALUE;
		int index = 0;
		double avg=0;
		for(int i = 0 ; i < A.length-1 ; i++){
			avg = (A[i]+A[i+1])/2.0;
			if(i < A.length - 2){
				if((A[i]+A[i+1]+A[i+2])/3.0 < avg)
					avg = (A[i]+A[i+1]+A[i+2])/3.0 ;
			}
			if(avg < minAvg){
				minAvg = avg;
				index = i ;
			}
		}
		return index;	
	}

	public static void main(String[] args) {
		int [] arr = {4,2,2,5,1,5,8};
		System.out.println(solution(arr));
	}
}
