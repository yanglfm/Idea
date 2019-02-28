package DemoDay0912;

import javax.swing.*;
import java.awt.*;

public class JDialogDemo {
    public static void main(String[] args) {
        JDialog dialog=new JDialog();
        //设置大小
        dialog.setSize(300,200);
        //设置布局
        dialog.setLayout(new FlowLayout());
        //设置标题
        dialog.setLocation(300,200);
        //设置标题
        dialog.setTitle("这是一个对话框");
        //按钮
        JButton btn=new JButton("确 定");//查询
        //文本框
        JTextField txt=new JTextField(10);//把id带入，回到数据库，把值带回前面客户端
        //标签
        JLabel lbl=new JLabel("ID:");

        //前面的组件都可以添加上来
        //添加组件(会覆盖，所以设置布局)
        dialog.add(lbl);
        dialog.add(txt);
        dialog.add(btn);

        //设置关闭按钮
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        //Exit_On_Close :需要在程序中关闭，对话框不是程序
        //与窗口的不同：没有最大化和最小化
        //显示组件
        dialog.setVisible(true);

    }
}
