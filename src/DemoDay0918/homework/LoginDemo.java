package DemoDay0918.homework;

import DemoDay0917.homework.MyJFrame;

import javax.swing.*;
import java.awt.*;

public class LoginDemo extends MyJFrame {
    //���
    private JLabel jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8;

    private JPanel jPanel1, jPanel2, jPanel3, jPanel4, jPanel5, jPanel6, jPanel7, jPanel8;
    private JTextField jTextUsername;
    private JTextField jTextPassword;
    private JTextField jTextConfirmPassword;


    public LoginDemo() {
        this.setTitle("ע��");
        this.setLayout(new FlowLayout());
        //ʵ�������
        jLabel1 = new JLabel("�û���");
        jLabel2 = new JLabel("����");
        jLabel3 = new JLabel("ȷ������");
        jLabel4 = new JLabel("�Ա�");
        jLabel5 = new JLabel("����");
        jLabel6 = new JLabel("��Ȥ����");
        jLabel7 = new JLabel("����");
        jLabel8 = new JLabel("�ֻ�����");
        jPanel1 = new JPanel();
        jPanel2 = new JPanel();
        jPanel3 = new JPanel();
        jPanel4 = new JPanel();
        jPanel5 = new JPanel();
        jPanel6 = new JPanel();
        jPanel7 = new JPanel();
        jPanel8 = new JPanel();

        jPanel1.add(jLabel1);
        jPanel2.add(jLabel2);
        jPanel3.add(jLabel3);
        jPanel4.add(jLabel4);
        jPanel5.add(jLabel5);
        jPanel6.add(jLabel6);
        jPanel7.add(jLabel7);
        jPanel8.add(jLabel8);


        this.add(jPanel1);
        this.add(jPanel1);
        this.add(jPanel1);
        this.add(jPanel1);
        this.add(jPanel1);
        this.add(jPanel1);
        this.add(jPanel1);
        this.add(jPanel1);

    }


    public static void main(String[] args) {
        new LoginDemo().setVisible(true);
    }
}
