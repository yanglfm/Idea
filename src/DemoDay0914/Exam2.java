package DemoDay0914;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Exam2 extends JFrame {
    public Exam2() {
        this.setTitle("�������Զ���Ĵ���");//this���õ�ǰʵ������
        this.setSize(500, 200);
        this.setLocation(500, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //�������¼�
//      this.addMouseListener(new myMouseListener());
        //�������ƶ��¼�
        this.addMouseMotionListener(new myMouseMotionListener());
    }
    private class myMouseMotionListener implements MouseMotionListener {

        @Override
        public void mouseDragged(MouseEvent e) {
            System.out.println("������ϰ�����갴ťȻ���϶�ʱ���á������ק");

        }

        @Override
        public void mouseMoved(MouseEvent e) {
            //���� ��� ��������ƶ��������꣬��ӡ��������
            System.out.println("����ƶ�");

        }
    }

    private class myMouseListener implements MouseListener {
        @Override
        public void mouseClicked(MouseEvent e) {
//            System.out.println("�ұ�����ˣ�");
            //˫���¼�
            int count = e.getClickCount();
//            System.out.println(count);
            if (count == 2) {
                //�����Ի������ǽ��Ի��������һ�η�װ�����ַ�ʽȷ����ֻ��Ҫ�ṩ����
                JOptionPane.showMessageDialog(null, "�ұ�˫����");
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {
            //System.out.println("��갴��");//������갴ס��ʱ����ʾ

        }

        @Override
        public void mouseReleased(MouseEvent e) {
            //  System.out.println("��굯���ͷš�");;

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            //����������������ˣ�����ʾ������
            // System.out.println("������");

        }

        @Override
        public void mouseExited(MouseEvent e) {
            //��������˳��������Ƴ������Χʱ��ʾ
            //  System.out.println("����˳�");

        }
    }

    public static void main(String[] args) {
        new Exam2().setVisible(true);
    }

}
