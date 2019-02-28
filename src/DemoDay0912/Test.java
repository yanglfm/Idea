package DemoDay0912;

import javax.swing.*;
import java.awt.*;

public class Test {
    public static void main(String[] args) {
        JFrame frm=new JFrame();
        JFrame frm2=new JFrame();
        //窗口的标题（传递式的继承，祖籍方法的类JFrame）
        frm.setTitle("这是我的第一个窗体！！！");
        frm2.setTitle("这是我的第二个窗体！！！");
        //设定窗体的大小，两种方式
        //frm.setSize(300,200);//宽度与高度
        frm.setSize(new Dimension(300,200));//Dimension 是一个实体类，可以设定大小
        frm2.setSize(new Dimension(300,200));
        //设定坐标
        frm.setLocation(600,200);//x:横向，y:纵向
        frm2.setLocation(500,200);//x:横向，y:纵向
        //两个窗体:默认情况下是由于程序从上往下执行的，所以默认的是后一个在前端
        //设置第一窗体在顶端
        frm.setAlwaysOnTop(true);
       /* //设置背景颜色
       //方法1：
        frm.setBackground(Color.RED);//枚举，看不到是因为有一层隐藏面板遮盖了
        //隐藏面板
        frm.getContentPane().setVisible(false);//此时把面板撕掉了，就像一层膜撕掉了一样
        */
       //方法2:通过容器来设置背景颜色
        Container conta = frm.getContentPane();
        conta.setBackground(Color.RED);
        //
        //将窗体进行显示
        frm.setVisible(true);//代表让窗口可视化  在API中查找到JFrame中的方法
        frm2.setVisible(true);


    }
}
