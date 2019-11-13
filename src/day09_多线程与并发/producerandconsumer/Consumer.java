package day09_多线程与并发.producerandconsumer;

/**
 * @author xiao儿
 * @date 2019/9/6 9:29
 * @Description Consumer
 */
public class Consumer implements Runnable {
    private Food food;

    public Consumer(Food food) {
        this.food = food;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            food.get();
        }
    }
}
