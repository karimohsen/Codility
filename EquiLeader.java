package org.codility;


public class EquiLeader {

    public static int solution(int[] A) {
        // write your code in Java SE 8
    	int count=0;
    	int leader=-1;
    	for(int i = 0 ; i < A.length ; i++){
    		if(count == 0){
    			leader = A[i];
    			count++;
    		}else if(A[i]==leader){
    			count++;
    		}else{
    			count--;
    		}
    	}
    	int prev = 0;
    	count = 0 ;
    	int result = 0;
    	for(int i = 0 ; i < A.length ; i++){
    		if(leader == A[i]){
    			count++;
    		}
    	}
    	for(int i = 0 ; i < A.length ; i++){
    		if(leader == A[i]){
    			prev++;
    		}		
			if((prev > ((i+1)/2))&& ((count-prev) > (A.length - (i+1))/2 )){
				result++;
			}
    	}
    	return result;
    }
	public static void main (String[] args){
		int [] arr = {4, 4, 2, 5, 3, 4, 4, 4};
		System.out.println(solution(arr));
	}
}
