package DemoDay0917;

import javax.swing.*;

public class GuiP {
    private JPanel panel1;
    private JList list_left;
    private JList list_right;
    private JButton btn_left;
    private JButton btn_right;
    private JButton UPButton;
    private JButton DOWNButton;
    private DefaultListModel left_model, right_model;

    public GuiP() {
        left_model = (DefaultListModel) list_left.getModel();
        right_model = (DefaultListModel) list_right.getModel();

        btn_left.addActionListener(e -> {
            if (list_right.getSelectedValue() == null) {
                JOptionPane.showMessageDialog(null, "你没有选中元素");
            } else {
                left_model.addElement(list_right.getSelectedValue());
                right_model.remove(list_right.getSelectedIndex());
            }
        });
        btn_right.addActionListener(e -> {
            if (list_left.getSelectedValue() == null) {
                JOptionPane.showMessageDialog(null, "你没有选中元素");
            } else {
                right_model.addElement(list_left.getSelectedValue());
                left_model.remove(list_left.getSelectedIndex());
            }
        });
        UPButton.addActionListener(e -> {
            if (list_right.getSelectedValue() == null) {
                JOptionPane.showMessageDialog(null, "你没有选中元素");
            } else if (list_right.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "已经是最顶端");
            } else {
                Object o = right_model.get(list_right.getSelectedIndex());
                Object up_obj = right_model.get(list_right.getSelectedIndex() - 1);
                right_model.setElementAt(o, list_right.getSelectedIndex() - 1);
                right_model.setElementAt(up_obj, list_right.getSelectedIndex());
                list_right.setSelectedIndex(list_right.getSelectedIndex() - 1);
            }
        });

        DOWNButton.addActionListener(e -> {
            if (list_right.getSelectedValue() == null) {
                JOptionPane.showMessageDialog(null, "你没有选中元素");
            } else if (list_right.getSelectedIndex() == right_model.getSize() - 1) {
                JOptionPane.showMessageDialog(null, "已经是最底端");
            } else {
                Object o = right_model.get(list_right.getSelectedIndex());
                Object up_obj = right_model.get(list_right.getSelectedIndex() + 1);
                right_model.setElementAt(o, list_right.getSelectedIndex() + 1);
                right_model.setElementAt(up_obj, list_right.getSelectedIndex());
                list_right.setSelectedIndex(list_right.getSelectedIndex() + 1);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GuiP");
        frame.setContentPane(new GuiP().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
