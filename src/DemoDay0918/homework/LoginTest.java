package DemoDay0918.homework;

import javax.swing.*;
import java.awt.*;

public class LoginTest {
    public static void main(String[] args) {

        JFrame f=new JFrame();
        f.setTitle("ϵͳ��¼����");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
        f.setVisible(true);

//���ô��ڵĴ�С��λ��
        f.setSize(400,400);
        f.setLocation(200,200);


        Container con=f.getContentPane();//����һ������
        con.setLayout(new GridLayout(7,1));

        JPanel pan1=new JPanel();//����һ���µİ���
        JLabel title=new JLabel("��ӭ��½��ϵͳ");
        title.setFont(new Font("����",Font.BOLD, 20));
        pan1.add(title);
        con.add(pan1);
//������ĵ�½����

        JPanel pan2=new JPanel();//����һ���µİ���
        JLabel name=new JLabel("�û���");
        pan2.add(name);
        TextField tf_name=new TextField(20);
        tf_name.setText("���ڴ˴������û���");
        pan2.add(tf_name);
        con.add(pan2);
//�û��������ı�������ڵڶ���������


        JPanel pan3=new JPanel();//����һ���µİ���
        JLabel pass = new JLabel("����");
        pan3.add(pass);
        JPasswordField password=new JPasswordField(15);
        password.setEchoChar('*');
        pan3.add(password);
        con.add(pan3);
//���뼰����������ڵ�����������



        JPanel pan4 = new JPanel();
        JButton b_log=new JButton("��½");
        pan4.add(b_log);
        JButton b_exit=new JButton("�˳�");
        pan4.add(b_exit);
        con.add(pan4);
//��½���˳���������ť���ڵ��ĸ�������

        JPanel pan5 = new JPanel();
        con.add(pan5);
        JPanel pan6 = new JPanel();
        con.add(pan6);
        JPanel pan7 = new JPanel();
        con.add(pan7);
//�հװ���
    }

}

