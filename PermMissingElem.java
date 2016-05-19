package org.codility;

public class PermMissingElem {

	public static int solution(int[] A){
		int res= 0;
		boolean [] arr = new boolean [A.length+1];
		for(int i =0 ; i < A.length ;i++){
			arr[A[i]-1] = true;
		}
		for(int i =0 ; i < arr.length ;i++){
			if(arr[i]==false){
				res = i + 1; 
				break;
			}
		}
		return res;
	}
	public static void main(String[] args){
		int A[] = {2,3,6,1,5,4,8};
		System.out.println(solution(A));
	}
}
