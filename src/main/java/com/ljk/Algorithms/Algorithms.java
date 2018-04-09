package com.ljk.Algorithms;

public class Algorithms {

    public static void main(String[] args) {
        deleteK();
    }

    /**
     * 删除下标为k的元素
     */
    public static void deleteK() {

        //固定的常量(比数组元素的个数要大)
        int N = 10;

        int[] arrays = new int[N];

        //对数组进行初始化
        for (int i = 0; i < 8; i++) {
            arrays[i] = i;
        }

        //要删除下标
        int k = 7;

        for (int i = k; i < N - 1; i++) {
            arrays[i] = arrays[i + 1];
        }

    }
}
