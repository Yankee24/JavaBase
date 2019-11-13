package day09_多线程与并发.producerandconsumer;

/**
 * @author xiao儿
 * @date 2019/9/6 9:26
 * @Description Producer
 */
public class Producer implements Runnable {
    private Food food;

    public Producer(Food food) {
        this.food = food;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                food.set("锅包肉", "酸甜口味，爽");
            } else {
                food.set("佛跳墙", "大补，滋阴补阳");
            }
        }
    }
}
