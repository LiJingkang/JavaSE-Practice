package com.ljk.LintCode.Easy;

public class fibonacci {

    /**
     * @param n: an integer
     * @return: an ineger f(n)
     */

    public int fibonacci(int n) {
        // write your code here

        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }

        int a = 0;
        int b = 1;
        int result = 0;
        for (int i = 3; i <= n; i++) {
            result = a + b;
            a = b;
            b = result;
        }

        return result;
    }
}

