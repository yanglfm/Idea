package DemoDay0914;

import javax.swing.*;

public class NullDemo2 extends JFrame {//?????
    private JButton []btns;

    public NullDemo2() {
        this.setBounds(400, 300, 500, 500);
        this.setTitle("�ղ���");
        this.setLayout(null);//4������
        //��ʼ��
        btns=new JButton[5];
    /*    for (int i = 0; i <btns.length ; i++) {
            btns[i].setBounds(50,100,100,20);
            this.add(btns[i]);
        }*/
        btns[0].setBounds(50,100,100,20);
        btns[1].setBounds(50,150,100,20);
        this.add(btns[0]);
//        this.add(btns[1]);

        //�ؼ���С�Ͷ�λ

        //���ݴ��ڵĶ���λ��
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new NullDemo2().setVisible(true);
    }
}
