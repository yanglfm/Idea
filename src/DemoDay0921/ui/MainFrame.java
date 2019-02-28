package DemoDay0921.ui;

import DemoDay0914.MyJFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends MyJFrame {
    private JLabel lbl;
    private JButton btn;
    public MainFrame(Login frm){
        this.setLayout(null);
        //初始化组件
        lbl=new JLabel(frm.txtName.getText());
        lbl.setBounds(20,50,200,30);
        //在组件上添加上一个窗体传来的值
        lbl.setText("欢迎"+lbl.getText()+"来到上元");
        btn=new JButton("返回");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Login().setVisible(true);
                MainFrame.this.setVisible(false);
            }
        });
        btn.setBounds(20,80,80,25);
        this.add(btn);
        this.add(lbl);
    }

}
