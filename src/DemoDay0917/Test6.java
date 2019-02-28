package DemoDay0917;

import DemoDay0914.MyJFrame;

import javax.swing.*;

public class Test6 extends MyJFrame {
    //设置滚动面板
    private JSplitPane jplit;
    //添加文本域
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JScrollPane spanl1;
    private JScrollPane spanl2;

    public Test6() {
        textArea1 = new JTextArea("第一文本域");//可以空参
        textArea2 = new JTextArea("第二文本域");
        spanl1 = new JScrollPane(textArea1);
        spanl2 = new JScrollPane(textArea2);

        //实例化切割面板
        jplit = new JSplitPane(JSplitPane.VERTICAL_SPLIT, true, spanl1, spanl2);//垂直切//// 割
        //设置分割线的位置
        jplit.setDividerLocation(150);
        //设置切割线体的宽度
        jplit.setDividerSize(1);//分割线的最小宽度：-1
        //添加组件
        this.add(jplit);
    }


    public static void main(String[] args) {

        new Test6().setVisible(true);
    }
}
