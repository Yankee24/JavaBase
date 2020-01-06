package base.day17_GUI事件处理;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author xiao儿
 * @date 2019/9/4 14:43
 * @Description Frame2
 *
 * 接口回调：
 * 当一个对象需要给外部对象提供数据时，我们可以定义一个内部接口把数据通过接口传递出去
 * 所有外部对象需要这个数据时，就实现这个接口
 * 好处是传递数据的对象不直接依赖接收数据的对象（低耦合）
 */
public class Frame2 extends Frame {
    private TextField textField = new TextField(20);
    private Button button = new Button("付款");

    public Frame2() {
        this.setSize(400, 300);
        this.setLayout(new FlowLayout());
        this.add(textField);
        this.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String money = textField.getText();
                moneyListener.setMoney(money);
            }
        });
        this.setVisible(true);
    }

    private MoneyListener moneyListener;

    public void setMoneyListener(MoneyListener moneyListener) {
        this.moneyListener = moneyListener;
    }

    public static interface MoneyListener {
        public void setMoney(String money);
    }
}
