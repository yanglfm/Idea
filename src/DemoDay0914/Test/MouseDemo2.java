package DemoDay0914.Test;

import DemoDay0914.MyJFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseDemo2 extends MyJFrame {
     private JLabel label;//¥¥Ω®±Í«©
    private MouseDemo2 imageDemo2;

private JButton button;
    public MouseDemo2(){
        this.setLayout(new FlowLayout());
        label=new JLabel();
        this.add(label);
        this.addMouseMotionListener(new MyMouseMotionListener ());
    }
    private class MyMouseMotionListener implements MouseMotionListener {


        @Override
        public void mouseDragged(MouseEvent e) {

        }

        @Override
        public void mouseMoved(MouseEvent e) {
            System.out.println(e.getX()+"  "+e.getY());
        }
    }

    public static void main(String[] args) {
        new MouseDemo2().setVisible(true);
    }

}
