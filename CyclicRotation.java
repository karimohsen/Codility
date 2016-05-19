package org.codility;

public class CyclicRotation {
	public static int[] solution(int[] A, int K) {
        // write your code in Java SE 8
		int [] res = new int [A.length];
		if(K==0){
			System.arraycopy(A, 0, res, 0, A.length);;
		}
		for(int i =0 ; i < K ;i++){
			for(int j = 0 ; j < A.length ;j++){
				if(j==0){
					res[j]=A[A.length-1];	
				}
				else{
					res[j]=A[j-1];
				}
				
			}
			System.arraycopy(res, 0, A, 0, A.length);;
		}
		return res;
    }
	public static void main(String[] args){
		int [] temp = {3,8,9,7,6};
		int [] arr = solution(temp, 0);
		for(int i = 0 ; i < arr.length ;i++){
			System.out.println(arr[i]);
		}
	}
}
