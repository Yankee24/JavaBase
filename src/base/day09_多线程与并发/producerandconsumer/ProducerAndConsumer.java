package base.day09_多线程与并发.producerandconsumer;

/**
 * @author xiao儿
 * @date 2019/9/6 9:17
 * @Description ProducerAndConsumer
 *
 * 两个线程协同工作，先生产，再消费
 *
 * 面试题：
 * sleep和wait的区别？
 * sleep；让线程进入休眠状态，让出CPU的时间片，不释放对象监视器的所有权（对象锁）
 * wait：让线程进入等待状态，让出CPU的时间片，并释放对象监视器的所有权（对象锁），等待其他线程通过notify方法来唤醒
 */
public class ProducerAndConsumer {
    public static void main(String[] args) {
        Food food = new Food();
        Producer producer = new Producer(food);
        Consumer consumer = new Consumer(food);
        Thread threadProducer = new Thread(producer);
        Thread threadConsumer = new Thread(consumer);
        threadProducer.start();
        threadConsumer.start();
    }
}
