package org.codility;

public class TapeEquilibrium {
    public static int solution(int[] A) {
        // write your code in Java SE 8
    	
    	int left=0;
    	int right;
    	for(int i = 1 ; i < A.length ;i++){
    		left += A[i];
    	}
    	right = A[0];
    	int res = Math.abs(right-left);
    	for(int i = 1 ; i < A.length ;i++){
    		if(Math.abs(right-left) < res){
    			res = Math.abs(right-left);
    		}
    		right += A[i];
    		left -= A[i];
    	}
    	return res;
    	
    }
  public static void main(String[] args){
	  int [] arr = {1000,-1000};
	  System.out.println(solution(arr));
  }
}
