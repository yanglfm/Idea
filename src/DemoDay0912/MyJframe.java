package DemoDay0912;

import javax.swing.*;
import java.awt.*;

public class MyJframe extends JFrame {
    //继承类中怎么实现，封装成方法，封装成类
    //跟线程一样的道理，两个方法：一个继承Thread类，一个实现接口
    //构造方法：实例化

    //dao
    public MyJframe(){
        this.setTitle("这是我自定义的窗体");//this调用当前实例对象
        this.setSize(500,200);
        this.setLocation(500,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    //事件方法

    public static void main(String[] args) {
       /* //实例化窗体对象 自定义
        MyJframe frm=new MyJframe();
        frm.setSize(300,200);
        frm.setLocation(new Point(300,400));
        frm.setVisible(true);*/
       //
       new MyJframe().setVisible(true);

    }

}
