package org.codility;

import java.util.Stack;

public class Nesting {

    public static int solution(String S) {
        // write your code in Java SE 8
    	Stack<Character> s = new Stack<>();
    	for(int i = 0 ; i < S.length() ; i++){
    		if( S.charAt(i)=='(' ){
    			s.push(S.charAt(i));
    		}
    		else if(S.charAt(i)==')'){
    			if(s.isEmpty()){
    				return 0;
    			}
    			else{
    				if(s.peek() == '(')
    					s.pop();
    			}
    		}
    	}
    	if(s.isEmpty())
    		return 1;
    	return 0;
    }
	public static void main(String [] args) {
		System.out.println(solution("())"));
	}
}
