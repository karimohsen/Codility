package org.codility;

import java.util.HashMap;
import java.util.Map;

public class Dominator2 {
	//Better Solution
    public static int solution(int[] A) {
        // write your code in Java SE 8
    	int count = 0;
    	int pos=-1;
    	int num=0;
    	for(int i = 0 ; i < A.length ; i++){
    		if(count==0){
    			num = A[i];
    			count++;
    		}else if (num == A[i]){
    			count++;
    			pos = i;
    		}else{
    			count--;
    		}
    	}
    	if(count !=0)
    	{
    		count = 0;
    		for(int i = 0 ; i < A.length ;i++){
    			if(A[i] == num){
    				count++;
    				pos = i;
    			}
    		}
    		if(count > (A.length / 2))
    			return pos;
    		else
    			return -1;
    	}
    	else
    		return -1;
    }
	public static void main (String[] args){
		int [] arr = {1,2,1};
		System.out.println(solution(arr));
	}
}
