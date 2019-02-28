package DemoDay0918.homework;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class TimeDemo extends JFrame {
    private JComboBox yearBox, monthBox, dayBox, weekBox;   //下拉列表
    private DefaultComboBoxModel yearModel, monthModel, dayModel, weekModel;  //默认模型

    public TimeDemo() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //可关闭
        this.setBounds(100, 100, 400, 200);
        this.setTitle("日期级联");
        this.setLayout(null);     //设为空布局
        componentInit();   //下拉列表的初始化
        yearBox = new JComboBox(yearModel);
        monthBox = new JComboBox(monthModel);
        dayBox = new JComboBox(dayModel);
        weekBox = new JComboBox(weekModel);
        weekBox.setEnabled(false);    //将日期下拉列表设为不可用
        this.add(yearBox);
        this.add(monthBox);
        this.add(dayBox);
        this.add(weekBox);
        yearBox.setBounds(20, 60, 60, 25);
        monthBox.setBounds(100, 60, 60, 25);
        dayBox.setBounds(180, 60, 60, 25);
        weekBox.setBounds(260, 60, 80, 25);
//添加监听器
        yearBox.addItemListener(new myItemListener());
        monthBox.addItemListener(new myItemListener());
        dayBox.addItemListener(new myItemListener());
        this.setVisible(true);
    }


    //下拉列表的初始化
    public void componentInit() {
//1990年的1月1号是 星期一      年下拉列表初始化
        yearModel = new DefaultComboBoxModel();
        for (int i = 1990; i <= 2015; i++) {
            yearModel.addElement(i);
        }
//月下拉列表初始化
        monthModel = new DefaultComboBoxModel();
        for (int i = 1; i <= 12; i++) {
            monthModel.addElement(i);
        }
//天下拉列表初始化
        dayModel = new DefaultComboBoxModel();
        for (int i = 1; i <= 31; i++) {
            dayModel.addElement(i);
        }
//星期几下拉列表初始化
        weekModel = new DefaultComboBoxModel();
        weekModel.addElement("星期一");
    }

    //监听器
    private class myItemListener implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
//年月日
            int index = yearBox.getSelectedIndex();
            int year = 1990 + index;
            int month = Integer.parseInt(monthBox.getSelectedItem().toString());
            int day = 0;
            if (e.getStateChange() == ItemEvent.SELECTED)
//如果改变了下拉列表的选择状态，就是你在下拉列表中选择了一个数据，就会执行
            {
//记录你所选择的天数 到1990-1-1有多少天，可以算出那天是星期几
                int allDayNum = 0;
//如果你选的的是 年 和  月 的 下拉列表  （这一点很重要，年和月  的选择 控制着这一个月 天数的变化，天数的选择变化控制着星期几的变化）
                if (e.getSource() == yearBox || e.getSource() == monthBox) {
                    switch (month) {
                        case 1:
                        case 3:
                        case 5:
                        case 7:
                        case 8:
                        case 10:
                        case 12:
                            day = 31;
                            break;
                        case 2:
//2 月的话   闰年29天
                            if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
                                day = 29;
                            } else {
                                day = 28;
                            }
                            break;
                        default:
                            day = 30;
                            break;
                    }
//添加数据  添加数据之前，先移除模型里所有的数据
                    dayModel.removeAllElements();
                    for (int i = 1; i <= day; i++) {
                        dayModel.addElement(i);
                    }
                }
//上面的操作仅仅是年和月的下拉列表的操作，改变着天数的变化。这里的话不论你选的是年月日哪那个下拉列表 都会改变星期几的变化
                for (int i = 1990; i < 2050; i++) {
                    if (i % 400 == 0 || i % 4 == 0 && i % 100 != 0) {
                        allDayNum += 366;
                    } else {
                        allDayNum += 365;
                    }
                }
                for (int i = 1; i < 12; i++) {
                    switch (i) {
                        case 2:
                            if (year % 400 == 0 && year % 100 != 0 || year % 4 == 0) {
                                allDayNum += 29;
                            } else {
                                allDayNum += 28;
                            }
                            break;
                        case 4:
                        case 6:
                        case 9:
                        case 11:
                            allDayNum += 30;
                            break;
                        default:
                            allDayNum += 31;
                            break;
                    }
                }
                int day1 = dayBox.getSelectedIndex() + 1;
                allDayNum += day1;
//System.out.println(allDayNum+"........");
                weekModel.removeAllElements();
                if (allDayNum % 7 == 0) {
                    weekModel.addElement("星期日");
                } else if (allDayNum % 7 == 1) {
                    weekModel.addElement("星期一");
                } else if (allDayNum % 7 == 2) {
                    weekModel.addElement("星期二");
                } else if (allDayNum % 7 == 3) {
                    weekModel.addElement("星期三");
                } else if (allDayNum % 7 == 4) {
                    weekModel.addElement("星期四");
                } else if (allDayNum % 7 == 5) {
                    weekModel.addElement("星期五");
                } else if (allDayNum % 7 == 6) {
                    weekModel.addElement("星期六");
                }
            }
        }
    }

    public static void main(String[] args) {
        new TimeDemo().setVisible(true);
    }
}

