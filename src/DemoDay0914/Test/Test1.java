package DemoDay0914.Test;

import DemoDay0914.MyJFrame;

import javax.swing.*;
import java.awt.*;

public class Test1 extends MyJFrame {
    private JPanel panel;
    public Test1(){
        panel = new JPanel() {
            public void paintComponent(Graphics g) {
                ImageIcon icon = new ImageIcon("D:\\Program Files\\GoogleChrome\\Photo\\07.jpg");
                // ͼƬ�洰���С���仯
                g.drawImage(icon.getImage(), 0, 0,
                        this.getSize().width,
                        this.getSize().height,
                        this);
            }
        };
        panel.setOpaque(false); //����͸����
    }

    public static void main(String[] args) {
        new Test1().setVisible(true);
    }
}
