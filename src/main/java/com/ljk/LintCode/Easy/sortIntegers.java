package com.ljk.LintCode.Easy;

public class sortIntegers {

    /**
     * @param A: an integer array
     * @return: nothing
     */
    public void sortIntegers(int[] A) {
        // write your code here

        int minIndex = 0;
        int temp = 0;

        if ((A == null) || (A.length == 0)) {
            return;
        }

        for (int i = 0; i < A.length; i++) {
            // 无序区的最小下标
            minIndex = i;

            for (int j = i + 1; j < A.length; j++) {
                if (A[j] < A[minIndex]) {
                    minIndex = j;
                }
            }

            temp = A[i];
            A[i] = A[minIndex];
            A[minIndex] = temp;
        }
    }
}
