package DemoDay0914;

import javax.swing.*;
import java.awt.event.*;

public class Exam3 extends JFrame {
    public Exam3() {
        this.setTitle("�������Զ���Ĵ���");//this���õ�ǰʵ������
        this.setSize(500, 200);
        this.setLocation(500, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //�����¼�
        this.addWindowListener(new myWindowListener());
    }
    private class myWindowListener implements WindowListener{

        @Override
        public void windowOpened(WindowEvent e) {
        //    System.out.println("�����");

        }

        @Override
        public void windowClosing(WindowEvent e) {
            System.out.println("����ر�");//һ������õ�
        }

        @Override
        public void windowClosed(WindowEvent e) {
            System.out.println("�ر�");//���ڶ��ر��ˣ�������

        }

        @Override
        public void windowIconified(WindowEvent e) {

        }

        @Override
        public void windowDeiconified(WindowEvent e) {
//            System.out.println("����������");
        }

        @Override
        public void windowActivated(WindowEvent e) {
            System.out.println("�����ڻ��");

        }

        @Override
        public void windowDeactivated(WindowEvent e) {
            System.out.println("�����ڲ����ǻ����ʱ����");
        }
    }


    public static void main(String[] args) {
        new Exam3().setVisible(true);
    }

}
