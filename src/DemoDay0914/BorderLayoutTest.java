package DemoDay0914;

/*SWING的常用布局
        BorderLayout  窗体的默认布局方式，边框布局
        FlowLayout  面板的默认布局方式，流式布局
        GridLayout   网格布局
        null*/

import javax.swing.*;
import java.awt.*;

public class BorderLayoutTest extends JFrame {
    //给定几个JButton
    private JButton btn1,btn2,btn3,btn4,btn5;
    public BorderLayoutTest(){
        //一次性完成设定大小和坐标
        this.setBounds(400,300,300,200);//坐标位置，宽度高度
        //设定标题
        this.setTitle("边框布局");
        //初始化按钮
        btn1=new JButton("btn1");
        btn2=new JButton("btn2");
        btn3=new JButton("btn3");
        btn4=new JButton("btn4");
        btn5=new JButton("btn5");
        //设置边框布局
        //添加组件的过程中，设置组件的方向
        this.add(btn1, BorderLayout.NORTH);//上北
        this.add(btn2,BorderLayout.SOUTH);
        this.add(btn3,BorderLayout.EAST);//
        this.add(btn4,BorderLayout.WEST);
        this.add(btn5,BorderLayout.CENTER);//中间

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        new BorderLayoutTest().setVisible(true);
    }
}
