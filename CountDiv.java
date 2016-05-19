package org.codility;

public class CountDiv {
    public static int solution(int A, int B, int K) {
        // write your code in Java SE 8
        int res = 0 ;
    	if(A%K == 0){
    		res +=1;
    	}
    	res += (B/K - A/K);
    	return res;
    }
	public static void main(String[] args) {
		System.out.println(solution(6,11,2));
	}
}
