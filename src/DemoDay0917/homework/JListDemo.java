package DemoDay0917.homework;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JListDemo extends MyJFrame {
    //�����б�
    private JList jList1;
    private JList jList2;
    private JButton jButtonUp;
    private JButton jButtonDown;
    private JButton jButtonLeft;
    private JButton jButtonRight;

    private JScrollPane spnl1;
    private JScrollPane spnl2;
    private DefaultListModel model1, model2;

    public JListDemo() {

        this.setTitle("JListDemo");

        this.setLayout(null);

        jButtonUp = new JButton("UP");
        jButtonDown = new JButton("DOWN");
        jButtonLeft = new JButton("LEFT");
        jButtonRight = new JButton("RIGHT");
        model1 = new DefaultListModel();
        model2 = new DefaultListModel();
        //���Ԫ��
        model1.addElement("A");
        model1.addElement("B");
        model1.addElement("C");
        model1.addElement("D");
        jList1 = new JList(model1);

        model2.addElement("E");
        model2.addElement("F");
        model2.addElement("G");
        jList2 = new JList(model2);


        jButtonUp.setBounds(50, 300, 100, 30);
        jButtonDown.setBounds(150, 300, 100, 30);
        jButtonLeft.setBounds(250, 300, 100, 30);
        jButtonRight.setBounds(350, 300, 100, 30);
        //���б���ӵ������
        spnl1 = new JScrollPane(jList1);
        spnl2 = new JScrollPane(jList2);

        spnl1.setBounds(100, 20, 100, 200);
        spnl2.setBounds(280, 20, 100, 200);

        jButtonRight.addActionListener(new myActionListenerLeft());
        jButtonLeft.addActionListener(new myActionListenerRight());
        jButtonUp.addActionListener(new myActionListenerUp());
        jButtonDown.addActionListener(new myActionListenerDown());

        this.add(jButtonUp);
        this.add(jButtonDown);
        this.add(jButtonLeft);
        this.add(jButtonRight);

        this.add(spnl1);
        this.add(spnl2);

    }

    private class myActionListenerLeft implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //Left:������
            if (jList1.getSelectedValue() == null) {
                JOptionPane.showMessageDialog(null, "δѡ���κ�Ԫ��");
            } else {
                model2.addElement(jList1.getSelectedValue());
                model1.removeElement(jList1.getSelectedValue());
            }
        }
    }

    private class myActionListenerRight implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //Right�����ҵ���
            if (jList2.getSelectedValue() == null) {
                JOptionPane.showMessageDialog(null, "δѡ���κ�Ԫ��");
            } else {
                model1.addElement(jList2.getSelectedValue());
                model2.removeElement(jList2.getSelectedValue());
            }
        }
    }

    private class myActionListenerDown implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (jList1.getSelectedValue() == null) {
                JOptionPane.showMessageDialog(null, "δѡ���κ�Ԫ��");
            }else if (jList1.getSelectedIndex() == model1.getSize() - 1) {
                JOptionPane.showMessageDialog(null, "�Ѿ�������Ͷ���");
            } else {
                //Down�����ϵ���
                // getSelectedIndex():������С��ѡ����Ԫ������; ���б��н�ѡ�񵥸���Ŀʱ��ѡ��
                Object o = model1.get(jList1.getSelectedIndex());//��ȡ��ǰѡ�е�Ԫ��
                Object o1 = model1.get(jList1.getSelectedIndex() + 1);//��ȡ��ǰѡ�е�Ԫ�ص�����һ��Ԫ��
                model1.setElementAt(o, jList1.getSelectedIndex() + 1);//������ָ������� index�����������ָ����Ԫ�ء�
                model1.setElementAt(o1, jList1.getSelectedIndex());//��������һ��Ԫ�ص�indexΪ��ǰѡ��Ԫ�ص�λ��
                jList1.setSelectedIndex(jList1.getSelectedIndex() + 1);//
            }
        }
    }

    private class myActionListenerUp implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //Up�����µ���
            if (jList1.getSelectedValue() == null) {
                JOptionPane.showMessageDialog(null, "δѡ���κ�Ԫ��");
            }else if (jList1.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "�Ѿ����������");
            } else {
                //
                Object o = model1.get(jList1.getSelectedIndex());
                Object o1 = model1.get(jList1.getSelectedIndex() - 1);
                model1.setElementAt(o, jList1.getSelectedIndex() - 1);
                model1.setElementAt(o1, jList1.getSelectedIndex());
                jList1.setSelectedIndex(jList1.getSelectedIndex() - 1);
                //setSelectedIndex(int index)
                // ѡ�񵥸���Ԫ��
               /* public void setSelectedIndex(int index)ѡ�񵥸���Ԫ�� ����������������ڻ����ģ�ʹ�С����ִ���κβ����� ����һ����ѡ��ģ����ʹ��setSelectionInterval�ķ��㷽���� �й���δ���С��0ֵ����ϸ��Ϣ���������ѡģ�����0 ��
                ����
                index - Ҫѡ��ĵ�Ԫ�������
                ����ѡ�е�����*/
            }
        }
    }

    public static void main(String[] args) {
        new JListDemo().setVisible(true);
    }
}
