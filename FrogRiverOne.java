package org.codility;

public class FrogRiverOne {
    public static int solution(int X, int[] A) {
        // write your code in Java SE 8
    	int ans = -1;
    	if(X > A.length)
    		return ans;
    	boolean arr [] = new boolean [A.length+1];
    	for(int i = 0 ; i < A.length ; i++ ){
    		if(arr[A[i]]== false){
    			arr[A[i]] = true;
    			X--;
    		}
    		if(X==0){
    			ans = i ; 
    			break;
    		}
    	}
    	return ans;
    }
    public static void main(String[] args){
    	int [] arr = {3};
    	System.out.println(solution(5,arr));
    }
}
