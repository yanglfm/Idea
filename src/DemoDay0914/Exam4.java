package DemoDay0914;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Exam4 extends JFrame {
    public Exam4() {
        this.setTitle("这是我自定义的窗体");//this调用当前实例对象
        this.setSize(500, 200);
        this.setLocation(500, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //键盘监听事件
        JTextField txt=new JTextField(10);
        this.setLayout(new FlowLayout());
        //添加事件 完成如下功能在文本框中只能接受数字其他字符一律不能录入 每次接受一个键盘字符输出打印在控制台上
        txt.addKeyListener(new myKeyListener());
        this.add(txt);

    }
    private class myKeyListener implements KeyListener{

        @Override
        public void keyTyped(KeyEvent e) {
            //键入键时调用

        }

        @Override
        public void keyPressed(KeyEvent e) {
            //按下键时调用
        }

        @Override
        public void keyReleased(KeyEvent e) {
            //当键被释放弹起时调用
        }
    }
        public static void main(String[] args) {
            new Exam4().setVisible(true);
        }
}
