package day09_多线程与并发;

/**
 * @author xiao儿
 * @date 2019/9/5 9:46
 * @Description DaemonAndYield
 */
public class DaemonAndYield {
    public static void main(String[] args) {
        MyRunnable3 myRunnable3 = new MyRunnable3();
        Thread thread = new Thread(myRunnable3);
        thread.setName("thread-1");// 设置线程名字
        // 设置线程优先级，优先级可以提高该线程抢占CPU时间片的概率大
        thread.setPriority(Thread.MAX_PRIORITY);
        // 线程可以分为守护线程和用户线程，当进程中没有用户线程时，Java虚拟机会退出
        thread.setDaemon(true);// 把线程设置为守护线程
        System.out.println(thread.isAlive());// 查看是否为活动线程
        thread.start();
        System.out.println(thread.isAlive());

        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName() + "-" + i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i == 5) {
                Thread.yield();// 让出本次CPU的时间片
            }
        }
    }
}

class MyRunnable3 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName() + "-" + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}