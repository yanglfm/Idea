package DemoDay0912;

import javax.swing.*;
import java.awt.*;

public class Test1 {
    public static void main(String[] args) {
        JFrame frm=new JFrame();

        //窗口的标题（传递式的继承，祖籍方法的类JFrame）
        frm.setTitle("这是我的第一个窗体！！！");

        //设定窗体的大小，两种方式
        //frm.setSize(300,200);//宽度与高度
        frm.setSize(new Dimension(300,200));//Dimension 是一个实体类，可以设定大小

        //设定坐标
      //  frm.setLocation(600,200);//x:横向，y:纵向

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

        //创建工具包
        Toolkit toolkit=Toolkit.getDefaultToolkit();
       /* //通过包获取图片的路径地址
        Image img = toolkit.getImage("");//路径地址
        // 把图片设置到窗体上
        frm.setIconImage(img);
        //获取窗体屏幕大小分辨率*/
        Dimension screen = toolkit.getScreenSize();
        System.out.println(screen.width+"  "+screen.height);
        //设置窗体最大化
       // frm.setSize(screen);
        //窗体居中
        //frm.setLocation((screen.width-frm.getWidth())/2,(screen.height-frm.getHeight())/2);//居中显示，以左上角顶点开始显示
        //相对居中
        frm.setLocationRelativeTo(null);//相对的居中

        //窗体的关闭
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//让控制台的灯关闭，资源关闭，程序结束
        //窗口关闭时仅仅关闭当前窗体本身，如果当前窗体是程序的最后一个窗体则程序随之结束，这个窗体是这个程序的唯一仅有的最后一个
        frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//
        //将窗体进行显示
        frm.setVisible(true);//代表让窗口可视化  在API中查找到JFrame中的方法
        //JFrame其他方法看api


    }
}
