package DemoDay0914.Test;

import DemoDay0914.MyJFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

//����  9 104 ��������������
public class PointTest extends MyJFrame {//���������
    // private JTextField jTextField;
    private JLabel jLabel;

    public PointTest() {
        // jTextField=new JTextField(20);
        //this.add(jTextField);
        //�������¼�
        this.add(jLabel);
        this.addMouseMotionListener(new myMouseMotionListener());
    }

    private class myMouseMotionListener implements MouseMotionListener {

        @Override
        public void mouseDragged(MouseEvent e) {
//			System.out.println("������ϰ�����갴ťȻ���϶�ʱ���á� �����ק");
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            // TODO �Զ����ɵķ������ ����  9 104 ��������������
            Point locationOnScreen = e.getLocationOnScreen();
            //Point point = e.getPointerInfo().getLocation();
            double x = locationOnScreen.getX();
            double y = locationOnScreen.getY();
            System.out.println(x + "  " + y);
            ;
            // pos.label_x.setText("x���꣺" + point.x);
            // pos.label_y.setText("y���꣺" + point.y);
            jLabel.setText("x:" + x);
            jLabel.setText("y:" + y);
            int xOnScreen = e.getXOnScreen();
            int yOnScreen = e.getYOnScreen();
            // jTextField.setText(String.valueOf(xOnScreen));
            // jTextField.setText(String.valueOf(yOnScreen));
            System.out.println(xOnScreen + "   " + yOnScreen);
            System.out.println("����ƶ�");
        }

    }


    public static void main(String[] args) {
        new PointTest().setVisible(true);
    }
}
