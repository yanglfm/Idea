package DemoDay0917;

import DemoDay0914.MyJFrame;

import javax.swing.*;

public class Test4 extends MyJFrame {
    //���ù������
    private JScrollPane spanl;
    //����ı���
    private JTextArea textArea;
    public Test4(){
        textArea=new JTextArea();//���Կղ�
       // this.add(textArea);
        spanl=new JScrollPane(textArea);//�����Կղ�
       //���Ĺ���������:ÿһ�ֲ��Ժ�������ô�õ�
        spanl=new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);//������ʾ������������ʾ
       //ʹ�ò��Ժ����ı�����ʾ
        spanl.getViewport().add(textArea);
        this.add(spanl);
    }



    public static void main(String[] args) {
        new Test4().setVisible(true);
    }
}
