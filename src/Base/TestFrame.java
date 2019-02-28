package Base;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestFrame extends BaseJFrame {
    private JButton button;//声明一个按钮

    public TestFrame() {
        super(300, 300, "这是一个测试");
    }

    @Override
    public void initViews() {
        button = new JButton();//实例化

    }

    @Override
    public void initSet() {//设置属性
        setLayout(null);//设置空布局
        button.setBounds(50,100,150,50);
        button.setText("这是一个按钮");
    }

    @Override
    public void initAdd() {//添加进入组件
        add(button);

    }

    @Override
    public void initEvents() {//匿名内部类
        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button.setBackground(Color.white);
                button.setFont(new Font("Dialog",Font.PLAIN,12));
                button.setText("我也太美啦");
                button.setBackground(new Color(241,1,128));
                button.setBorder(null);
                button.setBounds(0,100,300,40);
            }
        });

    }
  /*  //ActionListener实现类
    public class bottonEvents implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            button.setBackground(Color.white);
            button.setFont(new Font("Dialog",Font.PLAIN,12));
            button.setText("我也太美啦");
            button.setBackground(new Color(241,1,128));
            button.setBorder(null);
            button.setBounds(0,100,300,40);
        }
    }
*/
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
        new TestFrame();
    }
}

