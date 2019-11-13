package day09_多线程与并发;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author xiao儿
 * @date 2019/9/5 11:14
 * @Description ThreadSynchronization
 *
 * 实现同步的三种方法：
 * （1）使用同步代码块
 * （2）使用同步方法
 * （3）使用Lock（更灵活的代码控制）
 *
 * 多线程共享数据，会有安全问题，使用同步可以解决安全问题，同时会牺牲性能来换取安全
 * 所以同步的代码块要尽量保持简短，把不随数据变化的相关代码移除代码块，不要阻塞
 */
public class ThreadSynchronization {
    public static void main(String[] args) {
        MyRunnable5 myRunnable5 = new MyRunnable5();
        Thread thread = new Thread(myRunnable5);
        Thread thread1 = new Thread(myRunnable5);
        thread.setName("0");
        thread1.setName("1");
        thread.start();
        thread1.start();
    }
}

class MyRunnable5 implements Runnable {
    private int ticket = 10;// 售票
    private Object object = new Object();

    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            // synchronized (object) {
            //     if (ticket > 0) {
            //         ticket--;
            //         try {
            //             Thread.sleep(1000);
            //         } catch (InterruptedException e) {
            //             e.printStackTrace();
            //         }
            //         System.out.println(Thread.currentThread().getName() + "--" + "您购买的票剩余：" + ticket + "张");
            //     }
            // }
            method();
        }
    }

    // 同步方法：同步的对象时当前对象
    private synchronized void method() {
        if (ticket > 0) {
            ticket--;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "--" + "您购买的票剩余：" + ticket + "张");
        }
    }

    // 互斥锁
    ReentrantLock reentrantLock = new ReentrantLock();

    // Lock来实现同步
    private void method2() {
        reentrantLock.lock();// 锁
        try {
            if (ticket > 0) {
                ticket--;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "--" + "您购买的票剩余：" + ticket + "张");
            }
        } finally {
            reentrantLock.unlock();// 释放锁
        }
    }
}
