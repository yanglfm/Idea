package DemoDay0914.Test;

import DemoDay0914.MyJFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

//����¼�  ������¹��� ���ı�����ֻ�ܽ������� �����ַ�һ�ɲ���¼�� ÿ�ν���һ�������ַ������ӡ�ڿ���̨��
public class TextDemo extends MyJFrame {
    private JTextField txt;
    public TextDemo() {
        txt = new JTextField(10);
        this.setLayout(new FlowLayout());
        txt.addKeyListener(new myKeyListener());
        this.add(txt);
    }

    private class myKeyListener implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {
            int keyChar = e.getKeyChar();
            System.out.println((char)keyChar);
            if(keyChar>=KeyEvent.VK_0 && keyChar<=KeyEvent.VK_9){
            }else {
                e.consume();
            }
        }

        @Override
        public void keyPressed(KeyEvent e) {

        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }

        public static void main(String[] args) {
        new TextDemo().setVisible(true);
    }
}
