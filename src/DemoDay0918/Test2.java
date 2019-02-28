package DemoDay0918;

import DemoDay0914.MyJFrame;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test2 extends MyJFrame {
    //�и���壬���������壬�����ǿ������ģ�ֻ�з�����������ܿ���
    //�������
    private JTabbedPane tab;
    private JPanel pnl1;
    private JPanel pnl2;
    private JPanel pnl3;
    private JPanel pnl4;
    private JButton button;
    private JComboBox jComboBox;

    public Test2() {
        //��һ������ʾ:ҳ�����ֵ�λ�ã��ڶ�������ʾҳ�����õĲ���
        this.setLayout(null);
        tab = new JTabbedPane(JTabbedPane.TOP, JTabbedPane.WRAP_TAB_LAYOUT);
        pnl1 = new JPanel();
        jComboBox=new JComboBox(new String []{"YELLOW","RED","GREEN","PINK"});


        pnl1.setBackground(Color.YELLOW);

        pnl2 = new JPanel();
        pnl2.setBackground(Color.RED);
        pnl3 = new JPanel();
        pnl3.setBackground(Color.GREEN);
        pnl4 = new JPanel();
        pnl4.setBackground(Color.PINK);

        button=new JButton("��ť");
        //�����嵽ѡ���
        pnl2.add(button);
        tab.add("YELLOW", pnl1);
        tab.add("RED", pnl2);
        tab.add("GREEN", pnl3);
        tab.add("PINK", pnl4);
    /*    //����ѡ��ҳ��
        tab.setSelectedIndex(2);
        tab.setSelectedComponent(pnl2);
        //��ȡѡ�����
        System.out.println(tab.getSelectedIndex());*/
       // tab.setSelectedComponent(pnl2);
        //�������ӵ�������
        //���¼�
        //1.��ȡָ�������
        // 2.Ȼ�������ӡָ�����������ж��ٸ��������

        //��ȡָ�������
        Component component = tab.getComponentAt(1);
        //ǿ������ת��
        JPanel pnl=(JPanel)component;
        //��ȡ������µ�������Ԫ��
        Component[] components = pnl.getComponents();
        //�����ʲôԪ��
        System.out.println(components.length);
        //
        for (Component component1 : components) {
            System.out.println(component1);

            //��ȡ��ť�ϵ��ı�
            if(component1 instanceof JButton){
                System.out.println(((JButton) component1).getText());//������������İ�ť�Ļ�����Ҫ�����쳣
            }
        }
        tab.setBounds(10,20,300,200);
        jComboBox.setBounds(350,150,80,50);
        jComboBox.addActionListener(new myActionListener());
        tab.addChangeListener(new myChangeListener());
        this.add(tab);
        this.add(jComboBox);


    }
    private class myActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            tab.setSelectedIndex(jComboBox.getSelectedIndex());
        }
    }

    private class myChangeListener implements ChangeListener{

        @Override
        public void stateChanged(ChangeEvent e) {//�ı��¼����ı��ʱ����ʲô����
            //��ȡ�ڼ��������±�
       /*  //   JOptionPane.showMessageDialog(null,tab.getSelectedIndex());
            System.out.println(tab.getSelectedComponent());
            Component selectedComponent = tab.getSelectedComponent();
            Component[] components = tab.getComponents();
            for (Component component : components) {
                System.out.println(component);*/
            }

        }
    public static void main(String[] args) {
        new Test2().setVisible(true);
    }
    }



