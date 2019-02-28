package DemoDay0914.Test;

import DemoDay0914.MyJFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ImageDemo2 extends MyJFrame {
     private JLabel label;//创建标签
    private ImageDemo2 imageDemo2;
    ImageIcon icon;
    ImageIcon icon1;
    ImageIcon icon2;
    ImageIcon icon3;
private JButton button;
    public ImageDemo2(){
        this.setLayout(new FlowLayout());
        label=new JLabel();
        icon = new ImageIcon("D:/07.jpg");
        Image image=icon.getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_DEFAULT);
        icon.setImage(image);
       label.setIcon(icon);
        //绑定监听
        imageDemo2=this;
        label.addMouseListener(new MyMouseListener());
      // button.setIcon(icon);
        this.add(label);

    }
    private class MyMouseListener implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e) {
            //System.out.println("点击");
            //获取事件源
            JLabel label =(JLabel) e.getSource();
            //判断
            if(label.getIcon().equals(icon)){
                icon1= new ImageIcon("D:/06.jpg");
                Image image1 = icon1.getImage().getScaledInstance(imageDemo2.getWidth(), imageDemo2.getHeight(), Image.SCALE_DEFAULT);
                icon1.setImage(image1);
                label.setIcon(icon1);
                imageDemo2.add(label);
            }else if (label.getIcon().equals(icon1)){
                icon2= new ImageIcon("D:/08.jpg");
                Image image2 = icon2.getImage().getScaledInstance(imageDemo2.getWidth(), imageDemo2.getHeight(), Image.SCALE_DEFAULT);
                icon2.setImage(image2);
                label.setIcon(icon2);
                imageDemo2.add(label);
            }else if (label.getIcon().equals(icon2)){
                icon3= new ImageIcon("D:/10.jpg");
                Image image3 = icon3.getImage().getScaledInstance(imageDemo2.getWidth(), imageDemo2.getHeight(), Image.SCALE_DEFAULT);
                icon3.setImage(image3);
                label.setIcon(icon3);
                imageDemo2.add(label);
            }else if (label.getIcon().equals(icon3)){
                label.setIcon(icon);
                imageDemo2.add(label);
            }

        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }

    public static void main(String[] args) {
        new ImageDemo2().setVisible(true);
    }

}
