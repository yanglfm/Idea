package DemoDay0914;

import javax.swing.*;

public class NullDemo4 extends JFrame {//???
    private JButton []btns;
    private JButton btns1;

    public NullDemo4() {
        this.setBounds(400, 300, 500, 500);
        this.setTitle("�ղ���");
        this.setLayout(null);//4������
        //��ʼ��
        btns = new JButton[5];/**/

        for (int i = 0; i <btns.length ; i++) {
            btns[i].setBounds(50,20,100,20);
            this.add(btns[i]);
        }
        //�ؼ���С�Ͷ�λ


        //���ݴ��ڵĶ���λ��
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new NullDemo4().setVisible(true);
    }
}
