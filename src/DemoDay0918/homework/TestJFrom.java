/*
 * Created by JFormDesigner on Tue Sep 18 18:47:59 CST 2018
 */

package DemoDay0918.homework;

import javax.swing.*;
import java.awt.*;

/**
 * @author unknown
 */
public class TestJFrom extends JFrame {
    public static void main(String[] args) {
        new TestJFrom();
    }

    public TestJFrom() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        textField1 = new JTextField();
        label2 = new JLabel();
        passwordField1 = new JPasswordField();
        label3 = new JLabel();
        comboBox1 = new JComboBox<>();
        comboBox2 = new JComboBox<>();
        comboBox3 = new JComboBox<>();
        label4 = new JLabel();
        label5 = new JLabel();
        checkBox1 = new JCheckBox();
        label6 = new JLabel();
        label7 = new JLabel();
        checkBox2 = new JCheckBox();
        checkBox3 = new JCheckBox();
        checkBox4 = new JCheckBox();
        textField2 = new JTextField();
        textField3 = new JTextField();
        button1 = new JButton();
        button2 = new JButton();
        radioButton2 = new JRadioButton();
        radioButton3 = new JRadioButton();

        //======== this ========
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("\u7528\u6237\u540d");
        contentPane.add(label1);
        label1.setBounds(170, 85, 46, 34);
        contentPane.add(textField1);
        textField1.setBounds(240, 90, 180, 30);

        //---- label2 ----
        label2.setText("\u5bc6\u7801");
        contentPane.add(label2);
        label2.setBounds(180, 125, 70, 34);
        contentPane.add(passwordField1);
        passwordField1.setBounds(240, 127, 180, 30);

        //---- label3 ----
        label3.setText("\u6027\u522b");
        contentPane.add(label3);
        label3.setBounds(180, 185, 36, 34);

        //---- comboBox1 ----
        comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
            "1995",
            "1996",
            "1997",
            "1998"
        }));
        contentPane.add(comboBox1);
        comboBox1.setBounds(240, 235, 75, comboBox1.getPreferredSize().height);

        //---- comboBox2 ----
        comboBox2.setModel(new DefaultComboBoxModel<>(new String[] {
            "1",
            "2",
            "3",
            "4",
            "5",
            "6",
            "7",
            "8",
            "9",
            "10",
            "11",
            "12"
        }));
        contentPane.add(comboBox2);
        comboBox2.setBounds(330, 235, 75, 30);

        //---- comboBox3 ----
        comboBox3.setModel(new DefaultComboBoxModel<>(new String[] {
            "1",
            "2",
            "3",
            "4",
            "5",
            "6",
            "7",
            "8",
            "9",
            "10",
            "11",
            "12",
            "13",
            "14",
            "15",
            "16",
            "17",
            "18",
            "19",
            "20",
            "21",
            "22",
            "23",
            "24",
            "25",
            "26",
            "27",
            "28",
            "29",
            "30",
            "31"
        }));
        contentPane.add(comboBox3);
        comboBox3.setBounds(415, 235, 75, 30);

        //---- label4 ----
        label4.setText("\u751f\u65e5");
        contentPane.add(label4);
        label4.setBounds(180, 235, 26, 34);

        //---- label5 ----
        label5.setText("   \u5174\u8da3\u7231\u597d");
        contentPane.add(label5);
        label5.setBounds(145, 275, 75, 34);

        //---- checkBox1 ----
        checkBox1.setText("\u5531\u6b4c");
        contentPane.add(checkBox1);
        checkBox1.setBounds(new Rectangle(new Point(240, 285), checkBox1.getPreferredSize()));

        //---- label6 ----
        label6.setText("\u90ae\u7bb1");
        contentPane.add(label6);
        label6.setBounds(180, 325, 35, label6.getPreferredSize().height);

        //---- label7 ----
        label7.setText("\u624b\u673a\u53f7\u7801");
        contentPane.add(label7);
        label7.setBounds(new Rectangle(new Point(160, 375), label7.getPreferredSize()));

        //---- checkBox2 ----
        checkBox2.setText("\u8df3\u821e");
        contentPane.add(checkBox2);
        checkBox2.setBounds(310, 285, 70, checkBox2.getPreferredSize().height);

        //---- checkBox3 ----
        checkBox3.setText("\u6e9c\u51b0");
        contentPane.add(checkBox3);
        checkBox3.setBounds(380, 285, 60, checkBox3.getPreferredSize().height);

        //---- checkBox4 ----
        checkBox4.setText("\u62f3\u51fb");
        contentPane.add(checkBox4);
        checkBox4.setBounds(455, 285, 65, checkBox4.getPreferredSize().height);
        contentPane.add(textField2);
        textField2.setBounds(240, 370, 180, 30);
        contentPane.add(textField3);
        textField3.setBounds(240, 320, 180, 30);

        //---- button1 ----
        button1.setText("\u63d0\u4ea4");
        contentPane.add(button1);
        button1.setBounds(new Rectangle(new Point(240, 445), button1.getPreferredSize()));

        //---- button2 ----
        button2.setText("\u53d6\u6d88");
        contentPane.add(button2);
        button2.setBounds(new Rectangle(new Point(370, 445), button2.getPreferredSize()));

        //---- radioButton2 ----
        radioButton2.setText("\u7537");
        contentPane.add(radioButton2);
        radioButton2.setBounds(new Rectangle(new Point(245, 195), radioButton2.getPreferredSize()));

        //---- radioButton3 ----
        radioButton3.setText("\u5973");
        contentPane.add(radioButton3);
        radioButton3.setBounds(new Rectangle(new Point(330, 195), radioButton3.getPreferredSize()));

        { // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        setSize(550, 550);
        setLocationRelativeTo(null);

        //---- buttonGroup2 ----
        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(radioButton2);
        buttonGroup2.add(radioButton3);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JTextField textField1;
    private JLabel label2;
    private JPasswordField passwordField1;
    private JLabel label3;
    private JComboBox<String> comboBox1;
    private JComboBox<String> comboBox2;
    private JComboBox<String> comboBox3;
    private JLabel label4;
    private JLabel label5;
    private JCheckBox checkBox1;
    private JLabel label6;
    private JLabel label7;
    private JCheckBox checkBox2;
    private JCheckBox checkBox3;
    private JCheckBox checkBox4;
    private JTextField textField2;
    private JTextField textField3;
    private JButton button1;
    private JButton button2;
    private JRadioButton radioButton2;
    private JRadioButton radioButton3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
