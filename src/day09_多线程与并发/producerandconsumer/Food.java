package day09_多线程与并发.producerandconsumer;

/**
 * @author xiao儿
 * @date 2019/9/6 9:17
 * @Description Food
 */
public class Food {
    private String name;
    private String description;
    private boolean flag = true;// true表示可以生产，false表示可以消费

    public Food() {
    }

    public Food(String name, String description) {
        this.name = name;
        this.description = description;
    }

    /**
     * 生产产品
     *
     * @param name
     * @param description
     */
    public synchronized void set(String name, String description) {
        // 不能生产
        if (!flag) {
            try {
                this.wait();// 线程进入等待状态，释放监视器的所有权（对象锁）
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.setName(name);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setDescription(description);
        flag = false;
        this.notify();// 唤醒等待的线程（随机的其中一个）
    }

    /**
     * 消费产品
     *
     * @return
     */
    public synchronized void get() {
        // 不能消费
        if (flag) {
            try {
                this.wait();// 线程进入等待状态，释放监视器的所有权（对象锁）
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.getName() + "->" + this.getDescription());
        flag = true;
        this.notify();// 唤醒等待的线程（随机的其中一个）
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
