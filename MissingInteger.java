package org.codility;

public class MissingInteger {
    public static int solution(int[] A) {
        // write your code in Java SE 8
    	boolean arr [] = new boolean [A.length+1];
    	for(int i = 0 ; i < A.length ; i++){
    		if (A[i] < 1 || A[i] > A.length+1) {
                continue;
            }
    		arr[A[i]-1] = true;
    	}
    	for(int i = 0 ; i < arr.length ; i++){
    		if(arr[i] == false){
    			return  i+1;
    		}
    	}
    	return A.length + 1;
    }
   public static void main(String[] args){
	int [] arr = {-2,0,1,2,4,3,5,6,7,8};
   	System.out.println(solution(arr));
    }
}
