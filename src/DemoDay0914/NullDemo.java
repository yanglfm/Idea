package DemoDay0914;

import javax.swing.*;
import java.awt.*;

public class NullDemo extends JFrame {
    private JButton btns;

    public NullDemo() {
        this.setBounds(400, 300, 500, 500);
        this.setTitle("�ղ���");
        this.setLayout(null);//4������
        //��ʼ��
        btns = new JButton("btn");/**/
        //�ؼ���С�Ͷ�λ
        btns.setBounds(50,100,100,20);//�κ�������ô�С
        this.add(btns);
        //���ݴ��ڵĶ���λ��
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new NullDemo().setVisible(true);
    }
}
