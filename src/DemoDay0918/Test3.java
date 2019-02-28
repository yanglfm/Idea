package DemoDay0918;

import DemoDay0914.MyJFrame;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Test3 extends MyJFrame {
    //切割面板，本身就是面板，本身是看不见的，只有放了子组件才能看见
    //申明组件
    private JTabbedPane tab;
    private JPanel pnl1;
    private JPanel pnl2;
    private JPanel pnl3;
    private JPanel pnl4;
    private JButton button;
    private JComboBox jComboBox;

    public Test3() {
        //第一参数表示:页卡出现的位置，第二参数表示页卡布置的策略
        this.setLayout(null);
      //  tab = new JTabbedPane(JTabbedPane.TOP, JTabbedPane.WRAP_TAB_LAYOUT);
        //布局方式改变
        tab=new JTabbedPane();
        pnl1 = new JPanel();
        jComboBox=new JComboBox(new String []{"---请选择---","YELLOW","RED","GREEN","PINK"});


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

        /*//获取指定的组件
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
        }*/
        //对tab窗体的大小重新绑定
        tab.setBounds(20,20,250,250);
        jComboBox.setBounds(350,150,80,50);

        //绑定jcomboBox的监听器

      //  jComboBox.addActionListener(new myActionListener());
        jComboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                //获取下来列表的索引值
                int index = jComboBox.getSelectedIndex();
                if (index!=0){
                    //改变选中的tab页卡索引
                    tab.setSelectedIndex(index-1);
                }
            }
        });
        tab.addChangeListener(new myChangeListener());

        //添加到当前实例的窗体上
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
        new Test3().setVisible(true);
    }
    }



