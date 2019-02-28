package DemoDay0914;

import javax.swing.*;
import java.awt.*;

public class NullDemo extends JFrame {
    private JButton btns;

    public NullDemo() {
        this.setBounds(400, 300, 500, 500);
        this.setTitle("空布局");
        this.setLayout(null);//4行三列
        //初始化
        btns = new JButton("btn");/**/
        //控件大小和定位
        btns.setBounds(50,100,100,20);//任何组件设置大小
        this.add(btns);
        //根据窗口的顶点位置
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new NullDemo().setVisible(true);
    }
}
