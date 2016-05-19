package org.codility;


public class OddOccurrencesInArray {
    public static int solution(int [] A)  {
        // write your code in Java SE 8
    	int num = 0 ;
    	for(int i = 0 ; i < A.length ; i++){
    		num ^= A[i];
    	}
    	return num;
    }
	public static void main(String[] args){
		int [] arr = {7,8,6,8,7};
		System.out.println(solution(arr));
	}
}
