package DemoDay0912;

import javax.swing.*;
import java.awt.*;

public class Test3 extends JFrame {
    //��ǩ���߿ؼ�����
    private JLabel lbl;

    private JButton btn;

    private JPanel panl;
    private JComboBox cbox;

    //��ϰ�ť��ɱ༭�ֶκ������б������� �û����Ը����û�������������б���ѡ��һ��ֵ��
    // ���ʹ��Ͽ�ɱ༭������Ͽ�����û����Լ���ֵ�Ŀɱ༭�ֶΡ�
    private JTextField textField;
    // JTextField��һ�����������������༭�����ı���
    private JRadioButton jRadioButton;

    //��ѡ��ť��ʵ�� - ����ѡ���ȡ��ѡ�����Ŀ��������״̬��ʾ���û���
    //�����
    private JPasswordField pwd;//��Ҳ��һ���ı���
    //�����б��
    private JCheckBox cbx;

    public Test3() {
        this.setTitle("�������Զ���Ĵ���");
        this.setSize(500, 200);
        this.setLocation(500, 200);
        //�����ʼ��
        lbl = new JLabel("�����ı���ǩ��");
        btn = new JButton();
        panl = new JPanel();
       // cbox = new JComboBox();
        textField = new JTextField();

        cbox=new JComboBox<>();
        //�������
 cbox.addItem("A");


        //����4 ����ģ��������������ͨ����������������Ԫ��
      //  cbox=new

  //���ù��췽�������ı���ĳ���

 pwd = new JPasswordField(10);
        pwd.setText("123456");
        //����������е��ַ���ʽ
        pwd.setEchoChar('*');
        //textField.addActionListener();
        //���ͼƬ
       // ImageIcon imge = new ImageIcon("d:/Beauty.gif");
        //ͼƬ��С����
      ///  Image img = imge.getImage().getScaledInstance(50, 35, Image.SCALE_DEFAULT);
       // textField.setText("�����ı���");
        //�����ı��������
        textField.setColumns(20);
        //��ȡ�ı����е�ֵ
        System.out.println(textField.getText());
        System.out.println(pwd.getText());

   //�����ı��Ƿ���Ա༭
        textField.setEditable(false);//�����Ա༭
        //�����ı�����Ƿ����
        textField.setEnabled(false);//���ڳ������ݣ��������ݲ��ɱ��༭


/*

        //��������ͼƬ
        imge.setImage(img);
        lbl.setIcon(imge);
        btn.setText("JButton");

        //���������
        panl.add(lbl);
        panl.add(btn);
        panl.add(textField);
        panl.add(pwd);
        //�������뵱ǰ����
        this.add(panl);

        //�����ı�����ֻ��¼��20���ַ�
      //  textField.setDocument(new MyDocument(20));//Document:�ҵ�ʵ����PlainDocument
       // pwd.setDocument(new MyDocument(10));//���������ĳ���
*/

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Test3().setVisible(true);
    }
}
