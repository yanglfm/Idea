package DemoDay0918.homework;

import DemoDay0914.MyJFrame;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

public class ProvinceDemo extends MyJFrame {
    //�����б�
    private JComboBox provinceBox, cityBox;
    //Ĭ��ģ��
    private DefaultComboBoxModel provinceModel, cityModel;

    public ProvinceDemo() {
        this.setTitle("ʡ�ݼ���");
        this.setLayout(null); //��Ϊ�ղ���
        //��ʼ��ģ��
        provinceModel = new DefaultComboBoxModel();
        cityModel = new DefaultComboBoxModel();

        provinceBox = new JComboBox(provinceModel);
        cityBox = new JComboBox(cityModel);
        //���Ԫ��
        provinceModel.addElement("����ʡ");
        provinceModel.addElement("ɽ��ʡ");
        provinceModel.addElement("�㽭ʡ");

        cityModel.addElement("����");
        cityModel.addElement("����");
        cityModel.addElement("�Ͼ�");
        ArrayList<String>list=new ArrayList<>();
        list.add("����");
        list.add("����");



        provinceBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (provinceBox.getSelectedItem().equals(provinceModel.getElementAt(1))) {
                    cityModel.removeAllElements();
                    cityModel.addElement("�ൺ");
                    cityModel.addElement("��̨");
                    cityModel.addElement("����");
                } else if (provinceBox.getSelectedItem().equals(provinceModel.getElementAt(2))) {
                    cityModel.removeAllElements();
                    cityModel.addElement("��");
                    cityModel.addElement("����");
                    cityModel.addElement("����");
                }else if (provinceBox.getSelectedItem().equals(provinceModel.getElementAt(0))){
                    cityModel.removeAllElements();
                    cityModel.addElement("����");
                    cityModel.addElement("����");
                    cityModel.addElement("�Ͼ�");
                }
            }
        });

        provinceBox.setBounds(80, 60, 100, 25);
        cityBox.setBounds(250, 60, 100, 25);
        this.add(provinceBox);
        this.add(cityBox);


    }

    public static void main(String[] args) {
        new ProvinceDemo().setVisible(true);
    }

}
