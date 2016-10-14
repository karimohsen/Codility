package org.codility;

public class PrefixSums {
	public static int[] solution(String S, int[] P, int[] Q) {
		// write your code in Java SE 8
		int[][] arr = new int[S.length() + 1][3];
		int a,c,g;
		for (int i = 0; i < S.length(); i++) {
			a = 0;
					c=0;
					g=0;
			if (S.charAt(i) == 'A') {
				a = 1;
			} else if (S.charAt(i) == 'C') {
				c = 2;
			} else if (S.charAt(i) == 'G') {
				g = 3;
			}
			arr[i + 1][0] += arr[i][0] + a; // for A char
			arr[i + 1][1] += arr[i][1] + c; // for C char
			arr[i + 1][2] += arr[i][2] + g; // for G char
		}
		int[] res = new int[P.length];
		for (int i = 0; i < P.length; i++) {
			if (arr[Q[i] + 1][0] - arr[P[i]][0] > 0) {
				res[i] = 1;
			} else if (arr[Q[i] + 1][1] - arr[P[i]][1] > 0) {
				res[i] = 2;
			} else if (arr[Q[i] + 1][2] - arr[P[i]][2] > 0) {
				res[i] = 3;
			} else {
				res[i] = 4;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		String s = "CAGCCTA";
		int[] P = { 2, 5, 0 };
		int[] Q = { 4, 5, 6 };
		int[] res = solution(s, P, Q);
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}

	}

}
