package Base;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestFrame extends BaseJFrame {
    private JButton button;//����һ����ť

    public TestFrame() {
        super(300, 300, "����һ������");
    }

    @Override
    public void initViews() {
        button = new JButton();//ʵ����

    }

    @Override
    public void initSet() {//��������
        setLayout(null);//���ÿղ���
        button.setBounds(50,100,150,50);
        button.setText("����һ����ť");
    }

    @Override
    public void initAdd() {//��ӽ������
        add(button);

    }

    @Override
    public void initEvents() {//�����ڲ���
        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button.setBackground(Color.white);
                button.setFont(new Font("Dialog",Font.PLAIN,12));
                button.setText("��Ҳ̫����");
                button.setBackground(new Color(241,1,128));
                button.setBorder(null);
                button.setBounds(0,100,300,40);
            }
        });

    }
  /*  //ActionListenerʵ����
    public class bottonEvents implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            button.setBackground(Color.white);
            button.setFont(new Font("Dialog",Font.PLAIN,12));
            button.setText("��Ҳ̫����");
            button.setBackground(new Color(241,1,128));
            button.setBorder(null);
            button.setBounds(0,100,300,40);
        }
    }
*/
    public static void main(String[] args) {
       /* TestFrame frame = new TestFrame();
        frame.setSize(300, 300);
        frame.setTitle("����һ������");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);*/
        //new BaseJFrame().Frame(new TestFrame(),300,300,"����һ������");

       /*
        ���ȣ�����������һ�£�����һ�������Ҫ��������
        ����  private JButton button;
        ʵ����  button = new JButton();
        ��������  button.setBounds(50,100,150,50);
        ��ӽ����  this.add(button);*/
        new TestFrame();
    }
}

