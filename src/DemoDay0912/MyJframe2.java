package DemoDay0912;

import javax.swing.*;
import java.awt.*;

public class MyJframe2 extends JFrame {

    //标签或者控件属性
    private JLabel lbl;
    private JButton btn;
    private JPanel panl;//面板:用的布局方式是流式布局
    public MyJframe2(){
        this.setTitle("这是我自定义的窗体");//this调用当前实例对象
        this.setSize(500,200);
        this.setLocation(500,200);
        //设置布局
        this.setLayout(new FlowLayout());//流式布局：依次，像水流一样

        //组件初始化
        lbl=new JLabel("这是文本标签：");//起到描述性的作用
        btn=new JButton();
        panl=new JPanel();
        //添加图片
        ImageIcon imageIcon=new ImageIcon("D:/Beauty.gif");
        //图片大小设置
        Image img=imageIcon.getImage().getScaledInstance(100,20,Image.SCALE_DEFAULT);//默认的图片大小的设置
        //重新设置图片
        imageIcon.setImage(img);
        lbl.setIcon(imageIcon);



        //添加组件
       /* this.add(lbl);
        this.add(btn);//第二主键*/
       //面板添加组件
        panl.add(lbl);
        panl.add(btn);

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
        new MyJframe2().setVisible(true);

    }


}
