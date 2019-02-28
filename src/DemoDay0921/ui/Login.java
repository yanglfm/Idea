package DemoDay0921.ui;

import DemoDay0914.MyJFrame;
import DemoDay0921.dao.IUserDao;
import DemoDay0921.dao.impl.UserDaoImpl;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Login extends MyJFrame {
    JLabel lblName,lblPwd;//��ǩ
    JTextField txtName,txtPwd;//�ı���
    JButton btn;
    private IUserDao dao;
    public Login(){
        this.setLayout(null);
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }
        init();
        //�¼���
        btn.addKeyListener(new myKeyListener());
        txtName.addKeyListener(new myKeyListener());
        txtPwd.addKeyListener(new myKeyListener());
        this.add(lblName);
        this.add(lblPwd);
        this.add(txtName);
        this.add(txtPwd);
        this.add(btn);


    }
    //��ʼ�����
    public void init(){
        //��ʼ�����ݲ��¼�
        dao = new UserDaoImpl();
        lblName=new JLabel("�û�����");
        lblName.setBounds(150,50,80,25);
        lblPwd=new JLabel("����");
        lblPwd.setBounds(150,100,80,25);

        txtName=new JTextField(20);
        txtName.setBounds(200,50,120,25);
        txtPwd=new JTextField(20);
        txtPwd.setBounds(200,100,120,25);

        btn=new JButton("��¼");
        btn.setBounds(240,150,100,25);
    }
    public void login(){
        boolean flag = dao.login(txtName.getText(), txtPwd.getText());
        System.out.println(flag);
        if(flag){
          //�����´���
            new MainFrame(Login.this).setVisible(true);
            Login.this.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null,"�û��������벻��ȷ��");
        }
    }
    private class myKeyListener implements KeyListener{

        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {
            int k=e.getKeyCode();
            if (k==e.VK_ENTER){
                login();
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }

    public static void main(String[] args) {
        new Login().setVisible(true);
    }
}
