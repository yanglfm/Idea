package DemoDay0914;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Exam4 extends JFrame {
    public Exam4() {
        this.setTitle("�������Զ���Ĵ���");//this���õ�ǰʵ������
        this.setSize(500, 200);
        this.setLocation(500, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //���̼����¼�
        JTextField txt=new JTextField(10);
        this.setLayout(new FlowLayout());
        //����¼� ������¹������ı�����ֻ�ܽ������������ַ�һ�ɲ���¼�� ÿ�ν���һ�������ַ������ӡ�ڿ���̨��
        txt.addKeyListener(new myKeyListener());
        this.add(txt);

    }
    private class myKeyListener implements KeyListener{

        @Override
        public void keyTyped(KeyEvent e) {
            //�����ʱ����

        }

        @Override
        public void keyPressed(KeyEvent e) {
            //���¼�ʱ����
        }

        @Override
        public void keyReleased(KeyEvent e) {
            //�������ͷŵ���ʱ����
        }
    }
        public static void main(String[] args) {
            new Exam4().setVisible(true);
        }
}
