package DemoDay0912;

import javax.swing.*;
import java.awt.*;

public class JFrameTest4 extends JFrame {
    //��ǩ���߿ؼ�����
    private JLabel lbl;

    private JButton btn;

    private JPanel panl;
    private JCheckBox [] jCheckBox;//��������



    public JFrameTest4() {
        this.setTitle("�������Զ���Ĵ���");
        this.setSize(400, 300);

        this.setLocation(500, 200);
        //���ò���
//		this.setLayout(new FlowLayout());

        //�����ʼ��
        lbl = new JLabel("�����ı���ǩ��");
        btn = new JButton();
        panl = new JPanel();
       jCheckBox=new JCheckBox[4];
       String favs[]=new String[]{"����","����","��Ӱ","����"};
        //���鸳ֵ
        for (int i = 0; i < favs.length; i++) {
            jCheckBox[i]=new JCheckBox(favs[i]);
            panl.add(jCheckBox[i]);
            if (i<3){
                jCheckBox[i].setSelected(true);
            }
        }
        //�ж�����Ƿ�ѡ�� �ж�ѡ�е������ʲô����ȡ������󣬻�ȡ��ǰ�������
      //  Component[] component = this.getContentPane().getComponents();
        Component[] component = panl.getComponents();
        //�ж��Ƿ��Ǹ�ѡ���
        for (Component com : component) {//��������
            if(com instanceof JCheckBox){//�ж��Ƿ��Ǹ�ѡ���
                JCheckBox box=(JCheckBox)com;
                if (box.isSelected()){
                    System.out.println(box.getText());
                }
            }
        }

        //�����࣬��ѡҲ��ѡ����ѡ
        System.out.println();
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
        //�������뵱ǰ����
        this.add(panl);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JFrameTest4().setVisible(true);
    }
}
