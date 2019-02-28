package DemoDay0918.homework;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class TimeDemo extends JFrame {
    private JComboBox yearBox, monthBox, dayBox, weekBox;   //�����б�
    private DefaultComboBoxModel yearModel, monthModel, dayModel, weekModel;  //Ĭ��ģ��

    public TimeDemo() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //�ɹر�
        this.setBounds(100, 100, 400, 200);
        this.setTitle("���ڼ���");
        this.setLayout(null);     //��Ϊ�ղ���
        componentInit();   //�����б�ĳ�ʼ��
        yearBox = new JComboBox(yearModel);
        monthBox = new JComboBox(monthModel);
        dayBox = new JComboBox(dayModel);
        weekBox = new JComboBox(weekModel);
        weekBox.setEnabled(false);    //�����������б���Ϊ������
        this.add(yearBox);
        this.add(monthBox);
        this.add(dayBox);
        this.add(weekBox);
        yearBox.setBounds(20, 60, 60, 25);
        monthBox.setBounds(100, 60, 60, 25);
        dayBox.setBounds(180, 60, 60, 25);
        weekBox.setBounds(260, 60, 80, 25);
//��Ӽ�����
        yearBox.addItemListener(new myItemListener());
        monthBox.addItemListener(new myItemListener());
        dayBox.addItemListener(new myItemListener());
        this.setVisible(true);
    }


    //�����б�ĳ�ʼ��
    public void componentInit() {
//1990���1��1���� ����һ      �������б��ʼ��
        yearModel = new DefaultComboBoxModel();
        for (int i = 1990; i <= 2015; i++) {
            yearModel.addElement(i);
        }
//�������б��ʼ��
        monthModel = new DefaultComboBoxModel();
        for (int i = 1; i <= 12; i++) {
            monthModel.addElement(i);
        }
//�������б��ʼ��
        dayModel = new DefaultComboBoxModel();
        for (int i = 1; i <= 31; i++) {
            dayModel.addElement(i);
        }
//���ڼ������б��ʼ��
        weekModel = new DefaultComboBoxModel();
        weekModel.addElement("����һ");
    }

    //������
    private class myItemListener implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
//������
            int index = yearBox.getSelectedIndex();
            int year = 1990 + index;
            int month = Integer.parseInt(monthBox.getSelectedItem().toString());
            int day = 0;
            if (e.getStateChange() == ItemEvent.SELECTED)
//����ı��������б��ѡ��״̬���������������б���ѡ����һ�����ݣ��ͻ�ִ��
            {
//��¼����ѡ������� ��1990-1-1�ж����죬����������������ڼ�
                int allDayNum = 0;
//�����ѡ�ĵ��� �� ��  �� �� �����б�  ����һ�����Ҫ�������  ��ѡ�� ��������һ���� �����ı仯��������ѡ��仯���������ڼ��ı仯��
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
//2 �µĻ�   ����29��
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
//�������  �������֮ǰ�����Ƴ�ģ�������е�����
                    dayModel.removeAllElements();
                    for (int i = 1; i <= day; i++) {
                        dayModel.addElement(i);
                    }
                }
//����Ĳ�������������µ������б�Ĳ������ı��������ı仯������Ļ�������ѡ�������������Ǹ������б� ����ı����ڼ��ı仯
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
                    weekModel.addElement("������");
                } else if (allDayNum % 7 == 1) {
                    weekModel.addElement("����һ");
                } else if (allDayNum % 7 == 2) {
                    weekModel.addElement("���ڶ�");
                } else if (allDayNum % 7 == 3) {
                    weekModel.addElement("������");
                } else if (allDayNum % 7 == 4) {
                    weekModel.addElement("������");
                } else if (allDayNum % 7 == 5) {
                    weekModel.addElement("������");
                } else if (allDayNum % 7 == 6) {
                    weekModel.addElement("������");
                }
            }
        }
    }

    public static void main(String[] args) {
        new TimeDemo().setVisible(true);
    }
}

