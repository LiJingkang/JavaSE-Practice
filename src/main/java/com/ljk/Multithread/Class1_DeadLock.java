package com.ljk.Multithread;

public class Class1_DeadLock {
  // 锁A
  private Object lockA;
  // 锁B
  private Object lockB;

  // 第一条线程
  Thread t1 =
      new Thread(
              new Runnable() {
                void run() {
                  synchronized (lockA) {
                    Thread.sleep(5000);
                    synchronized (lockB) {
                      System.out.println("线程1");
                    }
                  }
                }
              })
          .start();

  // 第二条线程
  Thread t2 =
      new Thread(
              new Runnable() {
                void run() {
                  synchronized (lockB) {
                    Thread.sleep(5000);
                    synchronized (lockA) {
                      System.out.println("线程2");
                    }
                  }
                }
              })
          .start();
}
