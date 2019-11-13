package day17_GUI事件处理.observer;

import org.junit.Test;

/**
 * @author xiao儿
 * @date 2019/9/4 16:00
 * @Description ObserverDesignPattern(
 */
public class ObserverDesignPattern {
    @Test
    public void testObserver() {
        Message message = new Message();
        Observer user = new User("Tom");
        Observer user1 = new User("Lily");
        Observer user2 = new User("Job");
        message.registerObserver(user);
        message.registerObserver(user1);
        message.registerObserver(user2);

        message.setMessage("大家好");

        message.removeObserver(user);
        
        message.setMessage("大家在吗？");
    }
}
