package DemoDay0914;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Exam1 extends MyJFrame {
    private JButton btn;
    private Exam1 frm;
    public Exam1() {
        this.setLayout(new FlowLayout());
        //����ǰ����������¸�ֵ
        frm = this;
        btn = new JButton("��ʼ");

        //�󶨼���
        btn.addActionListener(new buttonActionListener());

        this.add(btn);
    }

    /**
     * �ڵ����ť��ʱ�� �������ݱ��ı� ͬʱ������ɫҲҪ�ı�
     * ��ʼ--����ͣ ����ɫ ��ɫ ��ͼƬ��������������
     * ��ͣ--������ ����ɫ ��ɫ
     * ����--����ʼ ����ɫ ��ɫ
     * @author Administrator
     *
     */
    private class buttonActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            // �¼�Դ
            JButton btn = (JButton) e.getSource();
            //�ж�
            if(btn.getText().equals("��ʼ")) {
                //�޸�
                btn.setText("��ͣ");
                frm.getContentPane().setBackground(Color.RED);
            }else if(btn.getText().equals("��ͣ")) {
                //�޸�
                btn.setText("����");
                frm.getContentPane().setBackground(Color.GREEN);
            }else if(btn.getText().equals("����")) {
                //�޸�
                btn.setText("��ʼ");
                frm.getContentPane().setBackground(Color.YELLOW);
            }
        }

    }

    public static void main(String[] args) {
        new Exam1().setVisible(true);
    }

}
