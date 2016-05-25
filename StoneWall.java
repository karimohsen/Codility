package org.codility;

import java.util.*;

public class StoneWall{

	public static int solution(int[] A) {
		// write your code in Java SE 8
		Stack<Integer> stack = new Stack<>();
		Stack<Integer> min = new Stack<>();
		int count = 0;
		for (int i = 0; i < A.length; i++) {
			if (i == 0) {
				stack.push(A[i]);
			} else {
				if (stack.peek() == A[i]) {
					continue;
				}
				if (stack.peek() < A[i])
					min.add(stack.peek());
				stack.push(A[i]);
				for (int j = 0; j < min.size(); j++) {
					if (min.peek() == A[i]) {
						count++;
						min.pop();
						break;
					}
					else if (min.peek() > A[i]){
						min.pop();
						j--;
					}
					else{
						break;
					}
				}
			}
		}
		return stack.size() - count;
	}

	public static void main(String[] args) {
		int[] arr = {2, 5, 1, 4, 6, 7, 9, 10, 1};
		System.out.println(solution(arr));
	}
}