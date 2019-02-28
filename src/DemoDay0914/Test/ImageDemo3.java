package DemoDay0914.Test;

import DemoDay0914.MyJFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ImageDemo3 extends MyJFrame {
    private JLabel label;//创建标签
    private ImageDemo3 imageDemo3;
    ImageIcon icon;
    private JButton button;

    public ImageDemo3() {
        this.setLayout(new FlowLayout());
        label = new JLabel();
        icon = new ImageIcon("D:/07.jpg");
        Image image = icon.getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_DEFAULT);
        icon.setImage(image);

        //绑定监听
        imageDemo3 = this;
        button.setIcon(icon);
       // button.addActionListener(new MyActionListener());
        this.add(button);

    }

  /*  private class MyActionListener implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
            // 事件源
            JButton btn = (JButton) e.getSource();
            //判断
            if (btn.getIcon().equals(icon)){
                ImageIcon icon1= new ImageIcon("D:/06.jpg");
                Image image1 = icon.getImage().getScaledInstance(imageDemo3.getWidth(), imageDemo3.getHeight(), Image.SCALE_DEFAULT);
                icon1.setImage(image1);
                btn.setIcon(icon1);
                imageDemo3.add(btn);
            }
        }
    }*/

    public static void main(String[] args) {
        new ImageDemo3().setVisible(true);
    }
}