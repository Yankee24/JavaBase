package day17_GUI事件处理.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiao儿
 * @date 2019/9/4 15:41
 * @Description Message
 *
 * 具体的被观察者
 */
public class Message implements MessageSubject {
    // 维护的观察者列表
    private List<Observer> list = new ArrayList<>();

    private String message;

    public void setMessage(String message) {
        this.message = message;
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer o) {
        list.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        list.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < list.size(); i++) {
            Observer observer = list.get(i);
            observer.update(message);
        }
    }
}
