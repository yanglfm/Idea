package DemoDay0918;

import DemoDay0914.MyJFrame;

import javax.swing.*;

public class Exam1 extends MyJFrame {
    //两个窗口之间的传递，跟传个对象差不多，实例化，然后设置为可视化
    //数据库中的表呈现到
    //把数据塞到JTable，把数据塞到客户端中
    //点击鼠标右键弹出菜单，有的可用，有的不可用，需要绑定另外一些事件
    //内容选中与否，在监听事件一栏中，根据你选择的
    //组件初始化
    private JTable table;
    private JScrollPane panel;
    public Exam1(){
       /* //方法1
        table=new JTable(4,4);//几行几列
        //根据索引坐标设定值
        table.setValueAt("123456",1,2);
        table.setValueAt(12.63,1,3);//因为是Object类型，所以可以添加任何类型的数据
        //获取第几行第几列的值
        System.out.println(table.getValueAt(1,2));*/
       //方法2
        //设置标题列
       Object[] columnNames=new Object[]{"name","age","sex","isAdmin"};//设置列名
        //设置行的内容
        Object[][]rowDate=new Object[3][4];//二维数组的行数必须要写，列数可以不写
       //给每一行赋值
        rowDate[0]=new Object[]{"张三","20","男",true};//都可以接受
        rowDate[1]=new Object[]{"李四","21","男",false};//都可以接受
        rowDate[2]=new Object[]{"莉莉","23","女",false};//都可以接受
       //表格实例化
        table = new JTable(rowDate, columnNames);//没有标题列
        panel=new JScrollPane(table);//直接实例化就加上table，才会显示（√）
       // panel.add(table);
        //如何显示标题列，并不是加JPanel

        this.add(panel);

        //this.add(table);
    }

    public static void main(String[] args) {
        new Exam1().setVisible(true);
    }

}
