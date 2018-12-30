package com.dpetrakopoulos.recursion;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static int fibonacciRecursive(int n){
        if (n < 2) {
            return n;
        }
        return fibonacciRecursive(n-1 ) + fibonacciRecursive(n-2);
    }

    private static int fibonacciIterative(int n){
        ArrayList<Integer> result = new ArrayList<>();
        result.add(0);
        result.add(1);
        for(int i = 2; i < n+1; i++){
            result.add(result.get(i-2) + result.get(i-1));
        }
        return result.get(n);
    }

    public static void main(String[] args) {
	   int answerRecursive = fibonacciRecursive(8);
	   System.out.println(answerRecursive);

	   int answerIterative = fibonacciIterative(8);
	   System.out.println(answerIterative);
    }
}
