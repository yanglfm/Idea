package DemoDay0914.Test;

import DemoDay0914.MyJFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MousePosition extends MyJFrame {
    private JLabel jLabelx,jLabely;
    public MousePosition(){
        this.setLayout(new FlowLayout());
        jLabelx=new JLabel();
        jLabely=new JLabel();
        this.add(jLabelx);
        this.add(jLabely);
        this.addMouseMotionListener(new myMouseMotionListener());
    }

    private class myMouseMotionListener implements MouseMotionListener {

        @Override
        public void mouseDragged(MouseEvent e) {

        }

        @Override
        public void mouseMoved(MouseEvent e) {
            // System.out.println(" Û±Í“∆∂Ø");
            int x = e.getX();
            int y = e.getY();
            jLabelx.setText("x:"+x);
            jLabely.setText("y:"+y);
            System.out.println("x:"+x+"y:"+y);

        }

    }
    public static void main(String[] args) {
        new MousePosition().setVisible(true);
    }
}
