package DemoDay0912;

import javax.swing.*;
import java.awt.*;

public class JFrameTest3 extends JFrame {
    //��ǩ���߿ؼ�����
    private JLabel lbl;

    private JButton btn;

    private JPanel panl;
    private JCheckBox jCheckBox;
    private JCheckBox jCheckBox1;
    private JCheckBox jCheckBox2;
    private JCheckBox jCheckBox3;

    public JFrameTest3() {
        this.setTitle("�������Զ���Ĵ���");
        this.setSize(400, 300);

        this.setLocation(500, 200);
        //���ò���
//		this.setLayout(new FlowLayout());

        //�����ʼ��
        lbl = new JLabel("�����ı���ǩ��");
        btn = new JButton();
        panl = new JPanel();
        jCheckBox = new JCheckBox("����");
        jCheckBox1 = new JCheckBox("����");
        jCheckBox2 = new JCheckBox("��ɽ");
        jCheckBox3 = new JCheckBox("�ܲ�");
        jCheckBox.setSelected(true);
        jCheckBox1.setSelected(true);
        jCheckBox2.setSelected(true);
        //���ͼƬ
        ImageIcon imge = new ImageIcon("d:/Beauty.gif");
        //ͼƬ��С����
        Image img = imge.getImage().getScaledInstance(80, 20, Image.SCALE_DEFAULT);
        //��������ͼƬ
        imge.setImage(img);
        lbl.setIcon(imge);

        btn.setText("JButton");


        //������
//		this.add(lbl);
//		this.add(btn);

        //���������
        panl.add(lbl);
        panl.add(btn);
        panl.add(jCheckBox);
        panl.add(jCheckBox1);
        panl.add(jCheckBox2);
        panl.add(jCheckBox3);
        //�������뵱ǰ����
        this.add(panl);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JFrameTest3().setVisible(true);
    }
}
