package DemoDay0912;

import javax.swing.*;
import java.awt.*;

public class Test {
    public static void main(String[] args) {
        JFrame frm=new JFrame();
        JFrame frm2=new JFrame();
        //���ڵı��⣨����ʽ�ļ̳У��漮��������JFrame��
        frm.setTitle("�����ҵĵ�һ�����壡����");
        frm2.setTitle("�����ҵĵڶ������壡����");
        //�趨����Ĵ�С�����ַ�ʽ
        //frm.setSize(300,200);//�����߶�
        frm.setSize(new Dimension(300,200));//Dimension ��һ��ʵ���࣬�����趨��С
        frm2.setSize(new Dimension(300,200));
        //�趨����
        frm.setLocation(600,200);//x:����y:����
        frm2.setLocation(500,200);//x:����y:����
        //��������:Ĭ������������ڳ����������ִ�еģ�����Ĭ�ϵ��Ǻ�һ����ǰ��
        //���õ�һ�����ڶ���
        frm.setAlwaysOnTop(true);
       /* //���ñ�����ɫ
       //����1��
        frm.setBackground(Color.RED);//ö�٣�����������Ϊ��һ����������ڸ���
        //�������
        frm.getContentPane().setVisible(false);//��ʱ�����˺���ˣ�����һ��Ĥ˺����һ��
        */
       //����2:ͨ�����������ñ�����ɫ
        Container conta = frm.getContentPane();
        conta.setBackground(Color.RED);
        //
        //�����������ʾ
        frm.setVisible(true);//�����ô��ڿ��ӻ�  ��API�в��ҵ�JFrame�еķ���
        frm2.setVisible(true);


    }
}
