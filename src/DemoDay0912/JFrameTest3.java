package DemoDay0912;

import javax.swing.*;
import java.awt.*;

public class JFrameTest3 extends JFrame {
    //标签或者控件属性
    private JLabel lbl;

    private JButton btn;

    private JPanel panl;
    private JCheckBox jCheckBox;
    private JCheckBox jCheckBox1;
    private JCheckBox jCheckBox2;
    private JCheckBox jCheckBox3;

    public JFrameTest3() {
        this.setTitle("这是我自定义的窗体");
        this.setSize(400, 300);

        this.setLocation(500, 200);
        //设置布局
//		this.setLayout(new FlowLayout());

        //组件初始化
        lbl = new JLabel("这是文本标签：");
        btn = new JButton();
        panl = new JPanel();
        jCheckBox = new JCheckBox("旅游");
        jCheckBox1 = new JCheckBox("购物");
        jCheckBox2 = new JCheckBox("爬山");
        jCheckBox3 = new JCheckBox("跑步");
        jCheckBox.setSelected(true);
        jCheckBox1.setSelected(true);
        jCheckBox2.setSelected(true);
        //添加图片
        ImageIcon imge = new ImageIcon("d:/Beauty.gif");
        //图片大小设置
        Image img = imge.getImage().getScaledInstance(80, 20, Image.SCALE_DEFAULT);
        //重新设置图片
        imge.setImage(img);
        lbl.setIcon(imge);

        btn.setText("JButton");


        //添加组件
//		this.add(lbl);
//		this.add(btn);

        //面板添加组件
        panl.add(lbl);
        panl.add(btn);
        panl.add(jCheckBox);
        panl.add(jCheckBox1);
        panl.add(jCheckBox2);
        panl.add(jCheckBox3);
        //将面板放入当前窗体
        this.add(panl);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JFrameTest3().setVisible(true);
    }
}
