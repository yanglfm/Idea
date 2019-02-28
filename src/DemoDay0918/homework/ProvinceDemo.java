package DemoDay0918.homework;

import DemoDay0914.MyJFrame;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

public class ProvinceDemo extends MyJFrame {
    //下拉列表
    private JComboBox provinceBox, cityBox;
    //默认模型
    private DefaultComboBoxModel provinceModel, cityModel;

    public ProvinceDemo() {
        this.setTitle("省份级联");
        this.setLayout(null); //设为空布局
        //初始化模型
        provinceModel = new DefaultComboBoxModel();
        cityModel = new DefaultComboBoxModel();

        provinceBox = new JComboBox(provinceModel);
        cityBox = new JComboBox(cityModel);
        //添加元素
        provinceModel.addElement("江苏省");
        provinceModel.addElement("山东省");
        provinceModel.addElement("浙江省");

        cityModel.addElement("苏州");
        cityModel.addElement("无锡");
        cityModel.addElement("南京");
        ArrayList<String>list=new ArrayList<>();
        list.add("苏州");
        list.add("无锡");



        provinceBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (provinceBox.getSelectedItem().equals(provinceModel.getElementAt(1))) {
                    cityModel.removeAllElements();
                    cityModel.addElement("青岛");
                    cityModel.addElement("烟台");
                    cityModel.addElement("济南");
                } else if (provinceBox.getSelectedItem().equals(provinceModel.getElementAt(2))) {
                    cityModel.removeAllElements();
                    cityModel.addElement("金华");
                    cityModel.addElement("杭州");
                    cityModel.addElement("温州");
                }else if (provinceBox.getSelectedItem().equals(provinceModel.getElementAt(0))){
                    cityModel.removeAllElements();
                    cityModel.addElement("苏州");
                    cityModel.addElement("无锡");
                    cityModel.addElement("南京");
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
