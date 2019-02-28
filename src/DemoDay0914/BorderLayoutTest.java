package DemoDay0914;

/*SWING�ĳ��ò���
        BorderLayout  �����Ĭ�ϲ��ַ�ʽ���߿򲼾�
        FlowLayout  ����Ĭ�ϲ��ַ�ʽ����ʽ����
        GridLayout   ���񲼾�
        null*/

import javax.swing.*;
import java.awt.*;

public class BorderLayoutTest extends JFrame {
    //��������JButton
    private JButton btn1,btn2,btn3,btn4,btn5;
    public BorderLayoutTest(){
        //һ��������趨��С������
        this.setBounds(400,300,300,200);//����λ�ã���ȸ߶�
        //�趨����
        this.setTitle("�߿򲼾�");
        //��ʼ����ť
        btn1=new JButton("btn1");
        btn2=new JButton("btn2");
        btn3=new JButton("btn3");
        btn4=new JButton("btn4");
        btn5=new JButton("btn5");
        //���ñ߿򲼾�
        //�������Ĺ����У���������ķ���
        this.add(btn1, BorderLayout.NORTH);//�ϱ�
        this.add(btn2,BorderLayout.SOUTH);
        this.add(btn3,BorderLayout.EAST);//
        this.add(btn4,BorderLayout.WEST);
        this.add(btn5,BorderLayout.CENTER);//�м�

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        new BorderLayoutTest().setVisible(true);
    }
}
