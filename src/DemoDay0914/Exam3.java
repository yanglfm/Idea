package DemoDay0914;

import javax.swing.*;
import java.awt.event.*;

public class Exam3 extends JFrame {
    public Exam3() {
        this.setTitle("这是我自定义的窗体");//this调用当前实例对象
        this.setSize(500, 200);
        this.setLocation(500, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //窗体事件
        this.addWindowListener(new myWindowListener());
    }
    private class myWindowListener implements WindowListener{

        @Override
        public void windowOpened(WindowEvent e) {
        //    System.out.println("窗体打开");

        }

        @Override
        public void windowClosing(WindowEvent e) {
            System.out.println("窗体关闭");//一般这个用到
        }

        @Override
        public void windowClosed(WindowEvent e) {
            System.out.println("关闭");//窗口都关闭了，才做的

        }

        @Override
        public void windowIconified(WindowEvent e) {

        }

        @Override
        public void windowDeiconified(WindowEvent e) {
//            System.out.println("窗口正常化");
        }

        @Override
        public void windowActivated(WindowEvent e) {
            System.out.println("窗口在活动中");

        }

        @Override
        public void windowDeactivated(WindowEvent e) {
            System.out.println("当窗口不再是活动窗口时调用");
        }
    }


    public static void main(String[] args) {
        new Exam3().setVisible(true);
    }

}
