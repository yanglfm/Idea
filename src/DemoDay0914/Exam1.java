package DemoDay0914;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Exam1 extends MyJFrame {
    private JButton btn;
    private Exam1 frm;
    public Exam1() {
        this.setLayout(new FlowLayout());
        //给当前窗体进行重新赋值
        frm = this;
        btn = new JButton("开始");

        //绑定监听
        btn.addActionListener(new buttonActionListener());

        this.add(btn);
    }

    /**
     * 在点击按钮的时候 文字内容被改变 同时背景颜色也要改变
     * 开始--》暂停 背景色 红色 改图片？？？？？？？
     * 暂停--》结束 背景色 绿色
     * 结束--》开始 背景色 黄色
     * @author Administrator
     *
     */
    private class buttonActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            // 事件源
            JButton btn = (JButton) e.getSource();
            //判断
            if(btn.getText().equals("开始")) {
                //修改
                btn.setText("暂停");
                frm.getContentPane().setBackground(Color.RED);
            }else if(btn.getText().equals("暂停")) {
                //修改
                btn.setText("结束");
                frm.getContentPane().setBackground(Color.GREEN);
            }else if(btn.getText().equals("结束")) {
                //修改
                btn.setText("开始");
                frm.getContentPane().setBackground(Color.YELLOW);
            }
        }

    }

    public static void main(String[] args) {
        new Exam1().setVisible(true);
    }

}
