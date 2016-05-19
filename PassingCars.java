package org.codility;
public class PassingCars{
	public static int solution(int[] A){
		int num = 0;
		int numZeros = 0;
		for(int i = 0 ; i < A.length ; i++){
			if(A[i]==0){
				numZeros+=1;
			}
			if(A[i] == 1 && numZeros > 0){
				num+=numZeros;
			}
		}
		if(num > 1000000000 || num < 0)
			return -1;
		return num;
	}
	public static void main(String[] args) {
		int [] temp = {0,1,1,1,1};
	    System.out.println(solution(temp));
		
		
	}
}