package DemoDay0917;

import DemoDay0914.MyJFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class Test7 extends MyJFrame {
    //�����б�
    private JList list;
    private JScrollPane spnl;//���б���ӵ������
    private DefaultListModel model;
    private JButton button;
    public Test7() {
        this.setLayout(null);
        button=new JButton("��ť");
        //����1
        //list=new JList();
        //������
        /*String strs[]=new String[]{"A","B","C"};
        list=new JList(strs);*/

        //������ʹ��model���
        model=new DefaultListModel();
        //���Ԫ��
        model.addElement("A");
        model.addElement("B");
        model.addElement("C");
        model.addElement("D");
        model.addElement("E");
        model.addElement("F");
        model.addElement("G");
        list=new JList(model);
/*        //����������е�Ԫ��
        model.clear();*/
/*        //�Ƴ�ĳһ��
        model.remove(0);//�Ƴ�ָ���ĵ�һ��*/
/*         //�����������Ƴ�
        model.removeElement("C");*/
/*        //�ж�ĳЩ�����Ƿ������JList��
        System.out.println(model.contains("Z"));*/
/*         //����������ȡ������
        System.out.println(model.getElementAt(2));*/
/*        //�޸�ѡ��Ĳ���
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//��ѡ��Ч��*/


    /*  //������
        Vector v=new Vector();
        v.add("A");
        v.add("B");
        v.add("C");
        v.add("D");
        list=new JList(v);*/

    button.setBounds(300,300,100,30);

        spnl=new JScrollPane(list);
        spnl.setBounds(20,20,250,300);
      //  button.add(list);
        button.addActionListener(new myActionListener());
        this.add(button);
        this.add(spnl);
    }

    private class myActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
           /* //��ȡ�¼�Դ
            Object obj = e.getSource();
            //�ж��Ƿ���JMenuItem
            if(obj instanceof JButton) {
                JButton jButton = (JButton) obj;

                if(jButton.getModel().getActionCommand().equals(model.getElementAt(2)){
                    JOptionPane.showMessageDialog(null, model.getElementAt(2));
                }else {
                    JOptionPane.showMessageDialog(null, model.getElementAt(3));
                }
            }*/
           //��ȡ����ֵ
           /* JOptionPane.showMessageDialog(null,list.getSelectedIndex());*/
            //��ȡֵ��д��
      JOptionPane.showMessageDialog(null,list.getSelectedValue());
            //������ȡ����������߶��ֵ������
            int[] indexs = list.getSelectedIndices();//������ö����������ʾ
            String str="";
            for (int i = 0; i <indexs.length ; i++) {
                str+=indexs[i]+"  ";
            }
            JOptionPane.showMessageDialog(null,str);

            Object[] values = list.getSelectedValues();//������ö��ֵ����ʾ
            for (int i = 0; i <values.length ; i++) {
                str+=values[i]+"  ";
            }
            JOptionPane.showMessageDialog(null,str);
        }

    }
    public static void main(String[] args) {

        new Test7().setVisible(true);
    }
}
