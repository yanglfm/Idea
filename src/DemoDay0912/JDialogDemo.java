package DemoDay0912;

import javax.swing.*;
import java.awt.*;

public class JDialogDemo {
    public static void main(String[] args) {
        JDialog dialog=new JDialog();
        //���ô�С
        dialog.setSize(300,200);
        //���ò���
        dialog.setLayout(new FlowLayout());
        //���ñ���
        dialog.setLocation(300,200);
        //���ñ���
        dialog.setTitle("����һ���Ի���");
        //��ť
        JButton btn=new JButton("ȷ ��");//��ѯ
        //�ı���
        JTextField txt=new JTextField(10);//��id���룬�ص����ݿ⣬��ֵ����ǰ��ͻ���
        //��ǩ
        JLabel lbl=new JLabel("ID:");

        //ǰ�������������������
        //������(�Ḳ�ǣ��������ò���)
        dialog.add(lbl);
        dialog.add(txt);
        dialog.add(btn);

        //���ùرհ�ť
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        //Exit_On_Close :��Ҫ�ڳ����йرգ��Ի����ǳ���
        //�봰�ڵĲ�ͬ��û����󻯺���С��
        //��ʾ���
        dialog.setVisible(true);

    }
}
