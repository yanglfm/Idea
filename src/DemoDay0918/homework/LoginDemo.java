package DemoDay0918.homework;

import DemoDay0917.homework.MyJFrame;

import javax.swing.*;
import java.awt.*;

public class LoginDemo extends MyJFrame {
    //组件
    private JLabel jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8;

    private JPanel jPanel1, jPanel2, jPanel3, jPanel4, jPanel5, jPanel6, jPanel7, jPanel8;
    private JTextField jTextUsername;
    private JTextField jTextPassword;
    private JTextField jTextConfirmPassword;


    public LoginDemo() {
        this.setTitle("注册");
        this.setLayout(new FlowLayout());
        //实例化组件
        jLabel1 = new JLabel("用户名");
        jLabel2 = new JLabel("密码");
        jLabel3 = new JLabel("确认密码");
        jLabel4 = new JLabel("性别");
        jLabel5 = new JLabel("生日");
        jLabel6 = new JLabel("兴趣爱好");
        jLabel7 = new JLabel("邮箱");
        jLabel8 = new JLabel("手机号码");
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
