package com.ljk.Thread;

public class MyThreadDemo {

    public static void main(String[] args) {
        // 创建两个线程
        MyThread my1 = new MyThread();
        MyThread my2 = new MyThread();

        my1.start();
        my2.start();
    }
}
