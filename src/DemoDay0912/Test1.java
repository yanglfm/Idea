package DemoDay0912;

import javax.swing.*;
import java.awt.*;

public class Test1 {
    public static void main(String[] args) {
        JFrame frm=new JFrame();

        //���ڵı��⣨����ʽ�ļ̳У��漮��������JFrame��
        frm.setTitle("�����ҵĵ�һ�����壡����");

        //�趨����Ĵ�С�����ַ�ʽ
        //frm.setSize(300,200);//�����߶�
        frm.setSize(new Dimension(300,200));//Dimension ��һ��ʵ���࣬�����趨��С

        //�趨����
      //  frm.setLocation(600,200);//x:����y:����

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

        //�������߰�
        Toolkit toolkit=Toolkit.getDefaultToolkit();
       /* //ͨ������ȡͼƬ��·����ַ
        Image img = toolkit.getImage("");//·����ַ
        // ��ͼƬ���õ�������
        frm.setIconImage(img);
        //��ȡ������Ļ��С�ֱ���*/
        Dimension screen = toolkit.getScreenSize();
        System.out.println(screen.width+"  "+screen.height);
        //���ô������
       // frm.setSize(screen);
        //�������
        //frm.setLocation((screen.width-frm.getWidth())/2,(screen.height-frm.getHeight())/2);//������ʾ�������ϽǶ��㿪ʼ��ʾ
        //��Ծ���
        frm.setLocationRelativeTo(null);//��Եľ���

        //����Ĺر�
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�ÿ���̨�ĵƹرգ���Դ�رգ��������
        //���ڹر�ʱ�����رյ�ǰ���屾�������ǰ�����ǳ�������һ�������������֮�����������������������Ψһ���е����һ��
        frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//
        //�����������ʾ
        frm.setVisible(true);//�����ô��ڿ��ӻ�  ��API�в��ҵ�JFrame�еķ���
        //JFrame����������api


    }
}
