package org.codility;

public class BinaryGap {

	public static int solution(int N) {
        // write your code in Java SE 8
		int max = 0 ; 
		int factor = 1;
		int num = 0 ;
		boolean prevOnes = false;
		while(N != 0){
			if((N&factor)==factor){
				if(prevOnes){
					if(max  <num){
						max = num;
					}
					num = 0 ;
					if(N>>1 == 0)
					prevOnes = false;
				}
				else{
					prevOnes = true;
				}
			}
			else{
				if(prevOnes)
				num++;
			}
			N = N >> 1;
		}
		return max;
        
    }
	public static void main(String[] args){
		System.out.println(solution(5200));
	}
}
