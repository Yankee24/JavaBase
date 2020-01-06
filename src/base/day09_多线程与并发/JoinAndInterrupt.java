package base.day09_多线程与并发;

/**
 * @author xiao儿
 * @date 2019/9/5 8:24
 * @Description JoinAndInterrupt
 * <p>
 * join方法：
 * 加入线程，让调用的线程先执行指定时间，或执行完毕
 *
 * 中断线程：
 * （1）：使用interrupt方法来中断线程，设置一个中断状态（标记）
 * （2）：使用自定义标记中断的方式（推荐使用）
 */
public class JoinAndInterrupt {
    public static void main(String[] args) {
        MyRunnable1 myRunnable1 = new MyRunnable1();
        Thread thread = new Thread(myRunnable1);
        // thread.start();

        MyRunnable2 myRunnable2 = new MyRunnable2();
        Thread thread1 = new Thread(myRunnable2);
        thread1.start();

        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName() + "-" + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i == 20) {
                // try {
                //     thread.join();// 让thread执行完毕
                // } catch (InterruptedException e) {
                //     e.printStackTrace();
                // }
                // thread.interrupt();// 中断线程，只是做了一个中断标记
                myRunnable2.flag = false;
            }
        }
    }
}

class MyRunnable1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            if (Thread.interrupted()) {// 测试中断状态，此方法会把中断状态清除
                break;
            }
            System.out.println(Thread.currentThread().getName() + "-" + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();// 抛出异常时会清除掉中断状态
                Thread.currentThread().interrupt();
            }
        }
    }
}

class MyRunnable2 implements Runnable {
    public boolean flag = true;

    public MyRunnable2() {
        flag = true;
    }

    @Override
    public void run() {
        int i = 0;
        while (flag) {
            System.out.println(Thread.currentThread().getName() + "-" + (i++));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}