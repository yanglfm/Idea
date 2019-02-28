package com.lsh.com.lsh.util;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginDialog extends  JDialog {

    private final JPanel contentPanel = new JPanel();
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;

    private static final int DIALOG_WIDTH=414;
    private static final int DIALOG_HEIGHT=340;
    private static final int DIALOG_HEIGHT_EXTEND=573;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        /*try
        {
            org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
        }
        catch(Exception e)
        {
            //TODO exception
            System.out.println("º”‘ÿÏ≈≤ ∆§∑Ù ß∞‹£°");
        }*/
        try {
            LoginDialog dialog = new LoginDialog();
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            dialog.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Create the dialog.
     */
    public LoginDialog() {
        setAlwaysOnTop(true);
        setResizable(false);
        setBounds(400, 100, DIALOG_WIDTH,DIALOG_HEIGHT);
        getContentPane().setLayout(new BorderLayout());
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        getContentPane().add(contentPanel, BorderLayout.CENTER);
        contentPanel.setLayout(null);

        //…Ë÷√æ”÷–
        //setLocation(WindowXY.getXY(LoginDialog.this.getSize()));

        JButton btnNewButton = new JButton("◊¢ ≤·");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if(LoginDialog.this.getHeight()==DIALOG_HEIGHT_EXTEND){
                    LoginDialog.this.setSize(DIALOG_WIDTH,DIALOG_HEIGHT);
                }
                else{
                    LoginDialog.this.setSize(DIALOG_WIDTH,DIALOG_HEIGHT_EXTEND);
                }
            }
        });
        btnNewButton.setBounds(53, 224, 93, 23);
        contentPanel.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("µ« ¬º");
        btnNewButton_1.setBounds(190, 224, 93, 23);
        contentPanel.add(btnNewButton_1);

        textField = new JTextField();
        textField.setBounds(133, 147, 150, 25);
        contentPanel.add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setBounds(133, 182, 150, 25);
        contentPanel.add(textField_1);
        textField_1.setColumns(10);

        JLabel lblNewLabel = new JLabel("”  œ‰");
        lblNewLabel.setBounds(53, 151, 54, 15);
        contentPanel.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("√‹ ¬Î");
        lblNewLabel_1.setBounds(53, 194, 54, 15);
        contentPanel.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("New label");
        lblNewLabel_2.setBounds(0, 0, 360, 136);
        ImageIcon icon=new ImageIcon(LoginDialog.class.getResource("D:/07.jpg"));
        icon=ImageScale.getImage(icon, lblNewLabel_2.getWidth(), lblNewLabel_2.getHeight());
        lblNewLabel_2.setIcon((icon));
        contentPanel.add(lblNewLabel_2);

        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(null, "\u6CE8\u518C\u7528\u6237", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panel.setBounds(12, 259, 336, 221);
        contentPanel.add(panel);
        panel.setLayout(null);

        JLabel lblNewLabel_3 = new JLabel("”  œ‰");
        lblNewLabel_3.setBounds(41, 29, 55, 18);
        panel.add(lblNewLabel_3);

        JLabel lblNewLabel_4 = new JLabel("—È÷§¬Î");
        lblNewLabel_4.setBounds(41, 85, 55, 18);
        panel.add(lblNewLabel_4);

        JLabel lblNewLabel_5 = new JLabel("√‹ ¬Î");
        lblNewLabel_5.setBounds(41, 115, 55, 18);
        panel.add(lblNewLabel_5);

        JLabel label = new JLabel("»∑»œ√‹¬Î");
        label.setBounds(41, 145, 55, 18);
        panel.add(label);

        textField_2 = new JTextField();
        textField_2.setBounds(123, 22, 150, 25);
        panel.add(textField_2);
        textField_2.setColumns(10);

        textField_3 = new JTextField();
        textField_3.setBounds(123, 80, 150, 25);
        panel.add(textField_3);
        textField_3.setColumns(10);

        textField_4 = new JTextField();
        textField_4.setBounds(123, 113, 150, 25);
        panel.add(textField_4);
        textField_4.setColumns(10);

        textField_5 = new JTextField();
        textField_5.setBounds(123, 145, 150, 25);
        panel.add(textField_5);
        textField_5.setColumns(10);

        JButton btnNewButton_2 = new JButton("∑¢ÀÕ—È÷§¬Î");
        btnNewButton_2.setBounds(123, 52, 83, 23);
        panel.add(btnNewButton_2);

        JButton btnNewButton_3 = new JButton("»° œ˚");
        btnNewButton_3.setBounds(51, 182, 83, 27);
        panel.add(btnNewButton_3);

        JButton btnNewButton_4 = new JButton("»∑ »œ");
        btnNewButton_4.setBounds(190, 182, 83, 27);
        panel.add(btnNewButton_4);
    }
}
