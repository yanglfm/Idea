package DemoDay0912;

import javax.swing.*;
import java.awt.*;

public class MyJframe2 extends JFrame {

    //��ǩ���߿ؼ�����
    private JLabel lbl;
    private JButton btn;
    private JPanel panl;//���:�õĲ��ַ�ʽ����ʽ����
    public MyJframe2(){
        this.setTitle("�������Զ���Ĵ���");//this���õ�ǰʵ������
        this.setSize(500,200);
        this.setLocation(500,200);
        //���ò���
        this.setLayout(new FlowLayout());//��ʽ���֣����Σ���ˮ��һ��

        //�����ʼ��
        lbl=new JLabel("�����ı���ǩ��");//�������Ե�����
        btn=new JButton();
        panl=new JPanel();
        //���ͼƬ
        ImageIcon imageIcon=new ImageIcon("D:/Beauty.gif");
        //ͼƬ��С����
        Image img=imageIcon.getImage().getScaledInstance(100,20,Image.SCALE_DEFAULT);//Ĭ�ϵ�ͼƬ��С������
        //��������ͼƬ
        imageIcon.setImage(img);
        lbl.setIcon(imageIcon);



        //������
       /* this.add(lbl);
        this.add(btn);//�ڶ�����*/
       //���������
        panl.add(lbl);
        panl.add(btn);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    //�¼�����
    public static void main(String[] args) {
       /* //ʵ����������� �Զ���
        MyJframe frm=new MyJframe();
        frm.setSize(300,200);
        frm.setLocation(new Point(300,400));
        frm.setVisible(true);*/
        //
        new MyJframe2().setVisible(true);

    }


}
