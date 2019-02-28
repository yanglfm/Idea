package DemoDay0914.Test;

import javax.swing.*;
import java.awt.*;

public class Demo02 {
    JFrame jframe;

    public static JPanel imgPanel;

    public Demo02() {
        initFrame();
    }

    // ≥ı ºªØ¥∞ø⁄
    public void initFrame() {
        // ¿˚”√JPanelÃÌº”±≥æ∞Õº∆¨
        jframe = new JFrame();

        imgPanel = new JPanel() {
            protected void paintComponent(Graphics g) {
                ImageIcon icon = new ImageIcon(getClass().getResource("D:/08.jpg"));
                Image img = icon.getImage();
                g.drawImage(img, 0, 0, icon.getIconWidth(), icon.getIconHeight(), icon.getImageObserver());
                jframe.setSize(icon.getIconWidth(), icon.getIconHeight());
            }
        };

        jframe.setTitle("≤‚ ‘jpanelÕº∆¨");
        jframe.add(imgPanel);
        jframe.pack();
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new Demo02();
    }
}

