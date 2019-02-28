package DemoDay0917.homework;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JListDemo1 extends MyJFrame {
    //设置列表
    private JList jList1;
    private JList jList2;
    private JButton jButtonUp;
    private JButton jButtonDown;
    private JButton jButtonLeft;
    private JButton jButtonRight;

    private JScrollPane spnl1;
    private JScrollPane spnl2;
    private DefaultListModel model1, model2;

    public JListDemo1() {

        this.setTitle("JListDemo");

        this.setLayout(null);

        jButtonUp = new JButton("UP");
        jButtonDown = new JButton("DOWN");
        jButtonLeft = new JButton("LEFT");
        jButtonRight = new JButton("RIGHT");
        model1 = new DefaultListModel();
        model2 = new DefaultListModel();
        //添加元素
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
        //将列表添加到面板上
        spnl1 = new JScrollPane(jList1);
        spnl2 = new JScrollPane(jList2);

        spnl1.setBounds(100, 20, 100, 200);
        spnl2.setBounds(280, 20, 100, 200);

        jButtonLeft.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                //Left:从左到右
                if (jList1.getSelectedValue() == null) {
                    JOptionPane.showMessageDialog(null, "未选中任何元素");
                } else {
                    model2.addElement(jList1.getSelectedValue());
                    model1.removeElement(jList1.getSelectedValue());
                }
            }
        });
        jButtonRight.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                //Right：从右到左
                if (jList2.getSelectedValue() == null) {
                    JOptionPane.showMessageDialog(null, "未选中任何元素");
                } else {
                    model1.addElement(jList2.getSelectedValue());
                    model2.removeElement(jList2.getSelectedValue());
                }
            }
        });
        jButtonUp.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                if (jList2.getSelectedIndex() == model2.getSize() - 1) {
                    JOptionPane.showMessageDialog(null, "已经到达最低端了");
                } else {
                    //Up：从下到上
                    Object o = model1.get(jList1.getSelectedIndex());
                    Object o1 = model1.get(jList1.getSelectedIndex() + 1);
                    model1.setElementAt(o, jList1.getSelectedIndex() + 1);
                    model1.setElementAt(o1, jList1.getSelectedIndex());
                    jList1.setSelectedIndex(jList1.getSelectedIndex() + 1);
                }
            }
        });
        jButtonDown.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                if (jList2.getSelectedIndex() == model2.getSize() - 1) {
                    JOptionPane.showMessageDialog(null, "已经到达最低端了");
                } else {
                    //Down：从下到上
                    Object o = model1.get(jList1.getSelectedIndex());
                    Object o1 = model1.get(jList1.getSelectedIndex() + 1);
                    model1.setElementAt(o, jList1.getSelectedIndex() + 1);
                    model1.setElementAt(o1, jList1.getSelectedIndex());
                    jList1.setSelectedIndex(jList1.getSelectedIndex() + 1);
                }
            }
        });

        this.add(jButtonUp);
        this.add(jButtonDown);
        this.add(jButtonLeft);
        this.add(jButtonRight);

        this.add(spnl1);
        this.add(spnl2);

    }



    public static void main(String[] args) {
        new JListDemo1().setVisible(true);
    }
}
