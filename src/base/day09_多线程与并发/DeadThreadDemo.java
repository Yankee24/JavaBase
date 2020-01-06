package base.day09_多线程与并发;

/**
 * @author xiao儿
 * @date 2019/9/5 18:14
 * @Description DeadThreadDemo
 *
 * 线程死锁：在一个同步方法中调用了另一个对象的同步方法，可能会产生死锁
 */
public class DeadThreadDemo {
    public static void main(String[] args) {
        new DeadThread();
    }
}

// 顾客
class Customer {
    public synchronized void say(Waiter w) {
        System.out.println("顾客说：先吃饭再买单！");
        w.doService();
    }

    public synchronized void doServide() {
        System.out.println("同意了，买完单再吃饭！");
    }
}

// 服务员
class Waiter {
    public synchronized void say(Customer c) {
        System.out.println("服务员说：先买单再吃饭！");
        c.doServide();
    }

    public void doService() {
        System.out.println("同意了，吃完饭再买单！");
    }
}

// 死锁线程
class DeadThread implements Runnable {
    Customer c = new Customer();
    Waiter w = new Waiter();

    public DeadThread() {
        new Thread(this).start();
        w.say(c);
    }

    @Override
    public void run() {
        c.say(w);
    }
}