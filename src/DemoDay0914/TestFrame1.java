package DemoDay0914;

import Base.BaseJFrame;
import DemoDay03.Test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TestFrame1 extends BaseJFrame {
    private JButton button;//声明一个按钮


    public TestFrame1() {
        super(300, 300, "这是一个测试");
        this.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
            }

            @Override
            public void windowClosing(WindowEvent e) {

            }

            @Override
            public void windowClosed(WindowEvent e) {

            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });
    }

    @Override
    public void initViews() {
        button = new JButton();//实例化

    }

    @Override
    public void initSet() {//设置属性
        setLayout(null);//设置空布局
        button.setBounds(50,100,150,50);
        button.setText("开始");

    }

    @Override
    public void initAdd() {//添加进入组件
        add(button);

    }

    @Override
    public void initEvents() {
        button.addActionListener(new bottonEvents());
    }

    //在点击按钮的时候，文字内容被改变，同时背景颜色也要改变
    //开始--》暂停 背景色 red 改图片：图片的大小与面板一样大小？？？？作业：
    //暂停--》结束 绿色
    //结束--》开始 黄色
  /*  @Override
    public void initEvents() {//匿名内部类
        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button.setBackground(Color.white);
                button.setFont(new Font("Dialog",Font.PLAIN,12));
                button.setText("暂停");
                button.setBackground(new Color(241,1,128));
                button.setBorder(null);
                button.setBounds(0,100,300,40);
            }
        });

    }*/
   // ActionListener实现类
    public class bottonEvents implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            button.setBackground(Color.white);
            button.setFont(new Font("Dialog",Font.PLAIN,12));
            button.setText("暂停");
            button.setBackground(new Color(241,1,128));
            button.setBorder(null);
            button.setBounds(0,100,300,40);
        }

    }

    public static void main(String[] args) {
       /* TestFrame frame = new TestFrame();
        frame.setSize(300, 300);
        frame.setTitle("这是一个测试");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);*/
        //new BaseJFrame().Frame(new TestFrame(),300,300,"这是一个测试");

       /*
        首先，我们来分析一下，创建一个组件需要几个步骤
        声明  private JButton button;
        实例化  button = new JButton();
        设置属性  button.setBounds(50,100,150,50);
        添加进组件  this.add(button);*/
        new TestFrame1();
    }
}

