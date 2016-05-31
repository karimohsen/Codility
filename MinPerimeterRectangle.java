package org.codility;

public class MinPerimeterRectangle{

	public static int solution(int N) {
        // write your code in Java SE 8
        int i = 2, num = 0;
        int min = 2 * (N+1);
        while(i <= Math.sqrt(N)){
        	if(N%i == 0){
        		num = i;
        	}
        	if(num != 0 &&  min > (2*((N / num) + num)) )
        		min = 2*((N / num) + num);
        	i++;
        }
        return min;
    }
	

	public static void main(String[] args) {
		System.out.println(solution(36));
	}

}
