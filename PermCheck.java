package org.codility;

public class PermCheck {
    public static int solution(int[] A) {
        // write your code in Java SE 8
    	boolean [] arr = new boolean [A.length+1];
    	for(int i = 0; i < A.length ;i++){
    		if (A[i] < 1 || A[i] > A.length) {
                return 0;
            }

    		arr[A[i]-1] = true;

    	}
    	for(int i = 0; i < arr.length ;i++){
    		if(i != arr.length-1 && arr[i] == false)
    			return 0;
    	}
    	return 1;
    }
   public static void main(String[] args){
	   int [] arr = {1,3};
   	System.out.println(solution(arr));
    }
}
