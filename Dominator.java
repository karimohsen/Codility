package org.codility;

import java.util.HashMap;
import java.util.Map;

public class Dominator {
    public static int solution(int[] A) {
        // write your code in Java SE 8
    	int dominante = -1;
    	Map<Integer,Integer> map = new HashMap<>();
    	Map<Integer,Integer> map2= new HashMap<>();
    	for(int i = 0 ; i < A.length ; i++){
    		if(map.containsKey(A[i])){
    			int count = map.get(A[i]);
    			count++;
    			map.put(A[i], count);
    			
    		}else{
    			map.put(A[i], 1);
    		}
    		if(!map2.containsKey(A[i])){
    			map2.put(A[i], i);
    		}
    	}
    	int occurance = 0;
    	int value = 0;
    	for(Map.Entry<Integer, Integer> entry : map.entrySet()){
    		if(entry.getValue() > occurance){
    			if(entry.getValue() > A.length/2){
    				occurance = entry.getValue(); 
    				value = entry.getKey();
    			}
    		}
    	}
    	int count = 0 ;
    	for(Map.Entry<Integer, Integer> entry : map.entrySet()){
    		if(entry.getValue() == occurance){
    			count ++;
    		}
    	}
    	if(count != 1)
    		return -1;
    	if(A.length != 0 && occurance != 0){
    		dominante = map2.get(value);
    	}
    	return dominante;
    }
	public static void main (String[] args){
		int [] arr = {1,3,4,4,2};
		System.out.println(solution(arr));
	}
}
