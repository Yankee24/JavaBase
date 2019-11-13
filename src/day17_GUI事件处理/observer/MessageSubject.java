package day17_GUI事件处理.observer;

/**
 * @author xiao儿
 * @date 2019/9/4 15:33
 * @Description MessageSubject
 *
 * 被观察者的接口
 */
public interface MessageSubject {
    // 注册观察者
    public void registerObserver(Observer o);
    // 移除观察者
    public void removeObserver(Observer o);
    // ͨ通知所有观察者
    public void notifyObserver();
}
