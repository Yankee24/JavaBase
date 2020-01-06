package base.day09_多线程与并发;

/**
 * @author xiao儿
 * @date 2019/9/5 10:27
 * @Description SharingData
 *
 * 多线程共享数据时，会发生线程不安全的情况
 * 多线程共享数据必须使用同步
 */
public class SharingData {
    public static void main(String[] args) {
        MyRunnable4 myRunnable4 = new MyRunnable4();
        Thread thread = new Thread(myRunnable4);
        Thread thread1 = new Thread(myRunnable4);
        thread.start();
        thread1.start();
    }
}

class MyRunnable4 implements Runnable {
    private int ticket = 10;// 售票

    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            if (ticket > 0) {
                ticket--;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("您购买的票剩余：" + ticket + "张");
            }
        }
    }
}