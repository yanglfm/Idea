package DemoDay0917;

import DemoDay0914.MyJFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class Test7 extends MyJFrame {
    //设置列表
    private JList list;
    private JScrollPane spnl;//将列表添加到面板上
    private DefaultListModel model;
    private JButton button;
    public Test7() {
        this.setLayout(null);
        button=new JButton("按钮");
        //方法1
        //list=new JList();
        //方法二
        /*String strs[]=new String[]{"A","B","C"};
        list=new JList(strs);*/

        //方法三使用model添加
        model=new DefaultListModel();
        //添加元素
        model.addElement("A");
        model.addElement("B");
        model.addElement("C");
        model.addElement("D");
        model.addElement("E");
        model.addElement("F");
        model.addElement("G");
        list=new JList(model);
/*        //清空里面所有的元素
        model.clear();*/
/*        //移除某一项
        model.remove(0);//移除指定的第一项*/
/*         //根据内容来移除
        model.removeElement("C");*/
/*        //判断某些内容是否包含在JList中
        System.out.println(model.contains("Z"));*/
/*         //根据索引获取所得项
        System.out.println(model.getElementAt(2));*/
/*        //修改选择的策略
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//单选的效果*/


    /*  //方法四
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
           /* //获取事件源
            Object obj = e.getSource();
            //判断是否是JMenuItem
            if(obj instanceof JButton) {
                JButton jButton = (JButton) obj;

                if(jButton.getModel().getActionCommand().equals(model.getElementAt(2)){
                    JOptionPane.showMessageDialog(null, model.getElementAt(2));
                }else {
                    JOptionPane.showMessageDialog(null, model.getElementAt(3));
                }
            }*/
           //获取索引值
           /* JOptionPane.showMessageDialog(null,list.getSelectedIndex());*/
            //获取值的写法
      JOptionPane.showMessageDialog(null,list.getSelectedValue());
            //连续获取多个索引或者多个值？？？
            int[] indexs = list.getSelectedIndices();//连续获得多个索引并显示
            String str="";
            for (int i = 0; i <indexs.length ; i++) {
                str+=indexs[i]+"  ";
            }
            JOptionPane.showMessageDialog(null,str);

            Object[] values = list.getSelectedValues();//连续获得多个值并显示
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
