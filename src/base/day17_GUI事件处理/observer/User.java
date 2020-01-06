package base.day17_GUI事件处理.observer;

/**
 * @author xiao儿
 * @date 2019/9/4 15:58
 * @Description User
 *
 * 具体的观察者
 */
public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("[" + name + "]" + "收到消息：" + message);
    }
}
