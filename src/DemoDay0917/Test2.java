package DemoDay0917;

import DemoDay0914.MyJFrame;

import javax.swing.*;
import java.awt.event.WindowEvent;

public class Test2 extends MyJFrame {

    public Test2() {

    }

    protected void processWindowEvent(WindowEvent e) {
        //public int getID():�����¼����͡�
        if (e.getID() == e.WINDOW_CLOSING) {
            //�����Ի���
            int i = JOptionPane.showConfirmDialog(null, "�Ƿ�Ҫ�رյ�ǰ����", "�رմ�����ʾ", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null);
            if (i == JOptionPane.YES_OPTION) {
                super.processWindowEvent(e);
            }
        }
    }


    public static void main(String[] args) {
        new Test2().setVisible(true);
    }
}