package DemoDay0914;

/*SWING�ĳ��ò���
        BorderLayout  �����Ĭ�ϲ��ַ�ʽ���߿򲼾�
        FlowLayout  ����Ĭ�ϲ��ַ�ʽ����ʽ����
        GridLayout   ���񲼾�
        null*/

import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo extends JFrame {
    //���100����ťJButton
    private JButton []btn;

    public FlowLayoutDemo(){
        //һ��������趨��С������
        this.setBounds(400,300,500,500);//����λ�ã���ȸ߶�
        //�趨����
        this.setTitle("��ʽ����");
        //���ñ߿򲼾�
        //�������Ĺ����У���������ķ���
        this.setLayout(new FlowLayout());

        //��ʼ����ť,��������syjy1-syjy100
        btn=new JButton[100];
        for (int i = 0; i <btn.length ; i++) {//ֻ�ܴ�0��ʼ��������
            btn[i]=new JButton("syjy"+(i+1));
            this.add(btn[i]);
        }


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        new FlowLayoutDemo().setVisible(true);
    }
}
