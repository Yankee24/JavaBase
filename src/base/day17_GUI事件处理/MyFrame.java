package base.day17_GUI事件处理;

import java.awt.*;
import java.awt.event.*;

/**
 * @author xiao儿
 * @date 2019/9/4 11:17
 * @Description MyFrame
 */
public class MyFrame extends Frame implements ActionListener {
    /**
     * 初始化窗体的基本属性
     */
    public MyFrame() {
        this.setSize(600, 400);
        this.setTitle("我的第一个GUI窗体");
        // 创建一个按钮
        Button button = new Button("点我一下，有惊喜");
        // 给按钮添加监听事件
        button.addActionListener(this::actionPerformed);
        // 创建一个线性布局
        FlowLayout flowLayout = new FlowLayout();
        // 把布局应用到窗体上
        this.setLayout(flowLayout);

        // 把按钮添加到窗体上
        this.add(button);
        // 设置窗体可见
        this.setVisible(true);
        // 设置关闭窗口
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });
    }

    // 单击事件处理的方法
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("惊喜来了，获得100元大红包");
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
