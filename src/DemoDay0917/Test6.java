package DemoDay0917;

import DemoDay0914.MyJFrame;

import javax.swing.*;

public class Test6 extends MyJFrame {
    //���ù������
    private JSplitPane jplit;
    //����ı���
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JScrollPane spanl1;
    private JScrollPane spanl2;

    public Test6() {
        textArea1 = new JTextArea("��һ�ı���");//���Կղ�
        textArea2 = new JTextArea("�ڶ��ı���");
        spanl1 = new JScrollPane(textArea1);
        spanl2 = new JScrollPane(textArea2);

        //ʵ�����и����
        jplit = new JSplitPane(JSplitPane.VERTICAL_SPLIT, true, spanl1, spanl2);//��ֱ��//// ��
        //���÷ָ��ߵ�λ��
        jplit.setDividerLocation(150);
        //�����и�����Ŀ��
        jplit.setDividerSize(1);//�ָ��ߵ���С��ȣ�-1
        //������
        this.add(jplit);
    }


    public static void main(String[] args) {

        new Test6().setVisible(true);
    }
}
