package com.ljk.Multithread;

public class Class5_interrupt {

  Thread t1 =
      new Thread(
              new Runnable() {
                public void run() {
                  // 若未发生中断，就正常执行任务
                  while (!Thread.currentThread().isInterrupted()) {
                    // 正常任务代码……
                  }

                  // 中断的处理代码……
                  doSomething();
                }
              })
          .start();

  Thread t1 =
      new Thread(
          new Runnable() {
            public void run() {
              while (!interrupted) {
                // 正常任务代码……
              }
              // 中断处理代码……
              // 可以在这里进行资源的释放等操作……
            }
          });

  Thread t2 =
      new Thread(
          new Runnable() {
            public void run() {
              interrupted = true;
            }
          });

  Thread t3 =
      new Thread(
          new Runnable() {
            public void run() {
              while (!Thread.currentThread.isInterrupted()) {
                // 正常任务代码……
              }
              // 中断处理代码……
              // 可以在这里进行资源的释放等操作……
            }
          });
}
