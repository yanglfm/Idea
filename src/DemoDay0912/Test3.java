package DemoDay0912;

import javax.swing.*;
import java.awt.*;

public class Test3 extends JFrame {
    //标签或者控件属性
    private JLabel lbl;

    private JButton btn;

    private JPanel panl;
    private JComboBox cbox;

    //组合按钮或可编辑字段和下拉列表的组件。 用户可以根据用户的请求从下拉列表中选择一个值。
    // 如果使组合框可编辑，则组合框包含用户可以键入值的可编辑字段。
    private JTextField textField;
    // JTextField是一个轻量级组件，允许编辑单行文本。
    private JRadioButton jRadioButton;

    //单选按钮的实现 - 可以选择或取消选择的项目，并将其状态显示给用户。
    //密码框
    private JPasswordField pwd;//它也是一种文本框
    //下拉列表框
    private JCheckBox cbx;

    public Test3() {
        this.setTitle("这是我自定义的窗体");
        this.setSize(500, 200);
        this.setLocation(500, 200);
        //组件初始化
        lbl = new JLabel("这是文本标签：");
        btn = new JButton();
        panl = new JPanel();
       // cbox = new JComboBox();
        textField = new JTextField();

        cbox=new JComboBox<>();
        //添加子项
 cbox.addItem("A");


        //方法4 创建模型组件：这个可以通过后续加上其他的元素
      //  cbox=new

  //利用构造方法设置文本框的长度

 pwd = new JPasswordField(10);
        pwd.setText("123456");
        //设置密码框中的字符形式
        pwd.setEchoChar('*');
        //textField.addActionListener();
        //添加图片
       // ImageIcon imge = new ImageIcon("d:/Beauty.gif");
        //图片大小设置
      ///  Image img = imge.getImage().getScaledInstance(50, 35, Image.SCALE_DEFAULT);
       // textField.setText("这是文本框");
        //设置文本框的列数
        textField.setColumns(20);
        //获取文本框中的值
        System.out.println(textField.getText());
        System.out.println(pwd.getText());

   //设置文本是否可以编辑
        textField.setEditable(false);//不可以编辑
        //设置文本组件是否可用
        textField.setEnabled(false);//用于呈现数据，但是数据不可被编辑


/*

        //重新设置图片
        imge.setImage(img);
        lbl.setIcon(imge);
        btn.setText("JButton");

        //面板添加组件
        panl.add(lbl);
        panl.add(btn);
        panl.add(textField);
        panl.add(pwd);
        //将面板放入当前窗体
        this.add(panl);

        //设置文本框中只能录入20个字符
      //  textField.setDocument(new MyDocument(20));//Document:找到实现类PlainDocument
       // pwd.setDocument(new MyDocument(10));//设置密码框的长度
*/

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Test3().setVisible(true);
    }
}
