package DemoDay0914;

import javax.swing.*;

public class NullDemo3 extends JFrame {
    private JButton btns;
    private JButton btns1;

    public NullDemo3() {
        this.setBounds(400, 300, 500, 500);
        this.setTitle("�ղ���");
        this.setLayout(null);//4������
        //��ʼ��
        btns = new JButton("btn");/**/
        btns1 = new JButton("btn1");/**/
        //�ؼ���С�Ͷ�λ
        btns.setBounds(50,100,100,20);//�κ�������ô�С
        btns1.setBounds(50,150,100,20);//�κ�������ô�С
        this.add(btns);
        this.add(btns1);
        //���ݴ��ڵĶ���λ��
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new NullDemo3().setVisible(true);
    }
}
