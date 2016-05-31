package org.codility;


public class CountFactors{

	public static int solution(int N) {
        // write your code in Java SE 8
        int i = 1;
        int result = 0;
        while(i < Math.sqrt(N)){
        	if( N%i == 0 )
        		result +=2;
        	i++;
        }
        if(Math.pow(i, 2) == N)
        	result += 1;
        return result; 
    }


public static void main(String[] args) {
	System.out.println(solution(24));
}

}
