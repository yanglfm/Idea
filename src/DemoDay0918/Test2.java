package DemoDay0918;

import DemoDay0914.MyJFrame;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test2 extends MyJFrame {
    //切割面板，本身就是面板，本身是看不见的，只有放了子组件才能看见
    //申明组件
    private JTabbedPane tab;
    private JPanel pnl1;
    private JPanel pnl2;
    private JPanel pnl3;
    private JPanel pnl4;
    private JButton button;
    private JComboBox jComboBox;

    public Test2() {
        //第一参数表示:页卡出现的位置，第二参数表示页卡布置的策略
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

        button=new JButton("按钮");
        //添加面板到选项卡中
        pnl2.add(button);
        tab.add("YELLOW", pnl1);
        tab.add("RED", pnl2);
        tab.add("GREEN", pnl3);
        tab.add("PINK", pnl4);
    /*    //设置选中页卡
        tab.setSelectedIndex(2);
        tab.setSelectedComponent(pnl2);
        //获取选项卡索引
        System.out.println(tab.getSelectedIndex());*/
       // tab.setSelectedComponent(pnl2);
        //将面板添加到窗体中
        //绑定事件
        //1.获取指定的组件
        // 2.然后将输出打印指定组件面板上有多少个组件对象

        //获取指定的组件
        Component component = tab.getComponentAt(1);
        //强制类型转换
        JPanel pnl=(JPanel)component;
        //获取该组件下的所有子元素
        Component[] components = pnl.getComponents();
        //输出是什么元素
        System.out.println(components.length);
        //
        for (Component component1 : components) {
            System.out.println(component1);

            //获取按钮上的文本
            if(component1 instanceof JButton){
                System.out.println(((JButton) component1).getText());//如果加了其他的按钮的话，需要捕获异常
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
        public void stateChanged(ChangeEvent e) {//改变事件，改变的时候做什么事情
            //获取第几块面变的下标
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



