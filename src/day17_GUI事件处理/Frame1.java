package day17_GUI事件处理;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author xiao儿
 * @date 2019/9/4 14:36
 * @Description Frame1
 */
public class Frame1 extends Frame implements Frame2.MoneyListener {
    private Label label = new Label("金额");
    private Button button = new Button("购买");

    public Frame1() {
        this.setSize(400, 300);
        this.setLayout(new FlowLayout());
        this.add(button);
        this.add(label);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Frame2().setMoneyListener(Frame1.this::setMoney);
            }
        });
        this.setVisible(true);
    }

    @Override
    public void setMoney(String money) {
        label.setText(money);
    }

    public static void main(String[] args) {
        new Frame1();
    }
}
