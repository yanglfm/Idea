package DemoDay0914;

import javax.swing.*;

public class NullDemo3 extends JFrame {
    private JButton btns;
    private JButton btns1;

    public NullDemo3() {
        this.setBounds(400, 300, 500, 500);
        this.setTitle("空布局");
        this.setLayout(null);//4行三列
        //初始化
        btns = new JButton("btn");/**/
        btns1 = new JButton("btn1");/**/
        //控件大小和定位
        btns.setBounds(50,100,100,20);//任何组件设置大小
        btns1.setBounds(50,150,100,20);//任何组件设置大小
        this.add(btns);
        this.add(btns1);
        //根据窗口的顶点位置
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new NullDemo3().setVisible(true);
    }
}
