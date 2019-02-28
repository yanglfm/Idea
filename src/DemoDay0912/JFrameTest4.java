package DemoDay0912;

import javax.swing.*;
import java.awt.*;

public class JFrameTest4 extends JFrame {
    //标签或者控件属性
    private JLabel lbl;

    private JButton btn;

    private JPanel panl;
    private JCheckBox [] jCheckBox;//给个数组



    public JFrameTest4() {
        this.setTitle("这是我自定义的窗体");
        this.setSize(400, 300);

        this.setLocation(500, 200);
        //设置布局
//		this.setLayout(new FlowLayout());

        //组件初始化
        lbl = new JLabel("这是文本标签：");
        btn = new JButton();
        panl = new JPanel();
       jCheckBox=new JCheckBox[4];
       String favs[]=new String[]{"上网","打球","电影","爬树"};
        //数组赋值
        for (int i = 0; i < favs.length; i++) {
            jCheckBox[i]=new JCheckBox(favs[i]);
            panl.add(jCheckBox[i]);
            if (i<3){
                jCheckBox[i].setSelected(true);
            }
        }
        //判断组件是否被选中 判断选中的组件是什么？获取组件对象，获取当前组件对象
      //  Component[] component = this.getContentPane().getComponents();
        Component[] component = panl.getComponents();
        //判断是否是复选组件
        for (Component com : component) {//遍历数组
            if(com instanceof JCheckBox){//判断是否是复选组件
                JCheckBox box=(JCheckBox)com;
                if (box.isSelected()){
                    System.out.println(box.getText());
                }
            }
        }

        //抽象类，单选也是选，复选
        System.out.println();
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
        //将面板放入当前窗体
        this.add(panl);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JFrameTest4().setVisible(true);
    }
}
