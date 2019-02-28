package DemoDay0917;

import DemoDay0914.MyJFrame;

import javax.swing.*;

public class Test4 extends MyJFrame {
    //设置滚动面板
    private JScrollPane spanl;
    //添加文本域
    private JTextArea textArea;
    public Test4(){
        textArea=new JTextArea();//可以空参
       // this.add(textArea);
        spanl=new JScrollPane(textArea);//不可以空参
       //更改滚动面板策略:每一种策略后面是怎么用的
        spanl=new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);//纵向不显示，横向总是显示
       //使用策略后让文本域显示
        spanl.getViewport().add(textArea);
        this.add(spanl);
    }



    public static void main(String[] args) {
        new Test4().setVisible(true);
    }
}
