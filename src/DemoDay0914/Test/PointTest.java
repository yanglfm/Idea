package DemoDay0914.Test;

import DemoDay0914.MyJFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

//坐标  9 104 ？？？？？？？
public class PointTest extends MyJFrame {//这个有问题
    // private JTextField jTextField;
    private JLabel jLabel;

    public PointTest() {
        // jTextField=new JTextField(20);
        //this.add(jTextField);
        //添加鼠标事件
        this.add(jLabel);
        this.addMouseMotionListener(new myMouseMotionListener());
    }

    private class myMouseMotionListener implements MouseMotionListener {

        @Override
        public void mouseDragged(MouseEvent e) {
//			System.out.println("在组件上按下鼠标按钮然后拖动时调用。 鼠标拖拽");
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            // TODO 自动生成的方法存根 坐标  9 104 ？？？？？？？
            Point locationOnScreen = e.getLocationOnScreen();
            //Point point = e.getPointerInfo().getLocation();
            double x = locationOnScreen.getX();
            double y = locationOnScreen.getY();
            System.out.println(x + "  " + y);
            ;
            // pos.label_x.setText("x坐标：" + point.x);
            // pos.label_y.setText("y坐标：" + point.y);
            jLabel.setText("x:" + x);
            jLabel.setText("y:" + y);
            int xOnScreen = e.getXOnScreen();
            int yOnScreen = e.getYOnScreen();
            // jTextField.setText(String.valueOf(xOnScreen));
            // jTextField.setText(String.valueOf(yOnScreen));
            System.out.println(xOnScreen + "   " + yOnScreen);
            System.out.println("鼠标移动");
        }

    }


    public static void main(String[] args) {
        new PointTest().setVisible(true);
    }
}
