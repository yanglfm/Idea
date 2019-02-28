package DemoDay0914;

import javax.swing.*;

public class NullDemo4 extends JFrame {//???
    private JButton []btns;
    private JButton btns1;

    public NullDemo4() {
        this.setBounds(400, 300, 500, 500);
        this.setTitle("空布局");
        this.setLayout(null);//4行三列
        //初始化
        btns = new JButton[5];/**/

        for (int i = 0; i <btns.length ; i++) {
            btns[i].setBounds(50,20,100,20);
            this.add(btns[i]);
        }
        //控件大小和定位


        //根据窗口的顶点位置
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new NullDemo4().setVisible(true);
    }
}
