package DemoDay0914;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Exam2 extends JFrame {
    public Exam2() {
        this.setTitle("这是我自定义的窗体");//this调用当前实例对象
        this.setSize(500, 200);
        this.setLocation(500, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //添加鼠标事件
//      this.addMouseListener(new myMouseListener());
        //添加鼠标移动事件
        this.addMouseMotionListener(new myMouseMotionListener());
    }
    private class myMouseMotionListener implements MouseMotionListener {

        @Override
        public void mouseDragged(MouseEvent e) {
            System.out.println("在组件上按下鼠标按钮然后拖动时调用。鼠标拖拽");

        }

        @Override
        public void mouseMoved(MouseEvent e) {
            //坐标 完成 根据鼠标移动呈现坐标，打印横纵坐标
            System.out.println("鼠标移动");

        }
    }

    private class myMouseListener implements MouseListener {
        @Override
        public void mouseClicked(MouseEvent e) {
//            System.out.println("我被点击了！");
            //双击事件
            int count = e.getClickCount();
//            System.out.println(count);
            if (count == 2) {
                //弹出对话框：它是将对话框进行了一次封装，布局方式确定，只需要提供内容
                JOptionPane.showMessageDialog(null, "我被双击了");
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {
            //System.out.println("鼠标按下");//就是鼠标按住的时候提示

        }

        @Override
        public void mouseReleased(MouseEvent e) {
            //  System.out.println("鼠标弹起【释放】");;

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            //代表鼠标进入面板来了，就提示鼠标进入
            // System.out.println("鼠标进入");

        }

        @Override
        public void mouseExited(MouseEvent e) {
            //代表鼠标退出，当你移出这个范围时提示
            //  System.out.println("鼠标退出");

        }
    }

    public static void main(String[] args) {
        new Exam2().setVisible(true);
    }

}
