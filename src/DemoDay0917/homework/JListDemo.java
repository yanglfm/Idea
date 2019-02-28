package DemoDay0917.homework;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JListDemo extends MyJFrame {
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

    public JListDemo() {

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
            //Left:从左到右
            if (jList1.getSelectedValue() == null) {
                JOptionPane.showMessageDialog(null, "未选中任何元素");
            } else {
                model2.addElement(jList1.getSelectedValue());
                model1.removeElement(jList1.getSelectedValue());
            }
        }
    }

    private class myActionListenerRight implements ActionListener {

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
    }

    private class myActionListenerDown implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (jList1.getSelectedValue() == null) {
                JOptionPane.showMessageDialog(null, "未选中任何元素");
            }else if (jList1.getSelectedIndex() == model1.getSize() - 1) {
                JOptionPane.showMessageDialog(null, "已经到达最低端了");
            } else {
                //Down：从上到下
                // getSelectedIndex():返回最小的选定单元格索引; 在列表中仅选择单个项目时的选择。
                Object o = model1.get(jList1.getSelectedIndex());//获取当前选中的元素
                Object o1 = model1.get(jList1.getSelectedIndex() + 1);//获取当前选中的元素的下面一个元素
                model1.setElementAt(o, jList1.getSelectedIndex() + 1);//设置在指定的组件 index这个名单的是指定的元素。
                model1.setElementAt(o1, jList1.getSelectedIndex());//设置下面一个元素的index为当前选中元素的位置
                jList1.setSelectedIndex(jList1.getSelectedIndex() + 1);//
            }
        }
    }

    private class myActionListenerUp implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //Up：从下到上
            if (jList1.getSelectedValue() == null) {
                JOptionPane.showMessageDialog(null, "未选中任何元素");
            }else if (jList1.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "已经到达最顶端了");
            } else {
                //
                Object o = model1.get(jList1.getSelectedIndex());
                Object o1 = model1.get(jList1.getSelectedIndex() - 1);
                model1.setElementAt(o, jList1.getSelectedIndex() - 1);
                model1.setElementAt(o1, jList1.getSelectedIndex());
                jList1.setSelectedIndex(jList1.getSelectedIndex() - 1);
                //setSelectedIndex(int index)
                // 选择单个单元格。
               /* public void setSelectedIndex(int index)选择单个单元格。 如果给定的索引大于或等于模型大小，则不执行任何操作。 这是一种在选择模型上使用setSelectionInterval的方便方法。 有关如何处理小于0值的详细信息，请参阅所选模型类的0 。
                参数
                index - 要选择的单元格的索引
                设置选中的索引*/
            }
        }
    }

    public static void main(String[] args) {
        new JListDemo().setVisible(true);
    }
}
