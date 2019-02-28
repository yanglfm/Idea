package DemoDay0914;

/*SWING的常用布局
        BorderLayout  窗体的默认布局方式，边框布局
        FlowLayout  面板的默认布局方式，流式布局
        GridLayout   网格布局
        null*/

import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo extends JFrame {
    //添加100个按钮JButton
    private JButton []btn;

    public FlowLayoutDemo(){
        //一次性完成设定大小和坐标
        this.setBounds(400,300,500,500);//坐标位置，宽度高度
        //设定标题
        this.setTitle("流式布局");
        //设置边框布局
        //添加组件的过程中，设置组件的方向
        this.setLayout(new FlowLayout());

        //初始化按钮,创建数组syjy1-syjy100
        btn=new JButton[100];
        for (int i = 0; i <btn.length ; i++) {//只能从0开始！！！！
            btn[i]=new JButton("syjy"+(i+1));
            this.add(btn[i]);
        }


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        new FlowLayoutDemo().setVisible(true);
    }
}
