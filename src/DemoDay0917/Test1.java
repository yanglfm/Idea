package DemoDay0917;

import javax.swing.*;

public class Test1 {
    public static void main(String[] args) {
        String [] strs=new String[]{"A","B","C"};
        int i = JOptionPane.showOptionDialog(null, "消息", "标题", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, strs, strs[0]);
        int i1 = JOptionPane.showConfirmDialog(null, i);

    }
}
