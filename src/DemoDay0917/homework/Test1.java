package DemoDay0917.homework;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Test1 {//鼠标上下移动
    public static void main(String[] args) {
        ListFrame f = new ListFrame();
        f.setSize(600, 400);
        f.setTitle("Test");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

class ListFrame extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private int first;
    private int sec;

    public ListFrame() {
        JPanel panel = new JPanel();
        this.getContentPane().add(panel, BorderLayout.CENTER);

        final DefaultListModel  m = new DefaultListModel ();
        m.addElement("A");
        m.addElement("B");
        m.addElement("C");
        final JList list = new JList(m);

        list.addMouseListener(new MouseListener() {

            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub


            }

            public void mouseEntered(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            public void mouseExited(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            public void mousePressed(MouseEvent e) {
                // TODO Auto-generated method stub
                first = list.locationToIndex(e.getPoint());
            }

            public void mouseReleased(MouseEvent e) {
                // TODO Auto-generated method stub
                sec = list.locationToIndex(e.getPoint());
                if ( sec != -1) {
                    if ( first != sec ) {
                        String s1 = m.getElementAt(first).toString();
                        String s2 = m.getElementAt(sec).toString();
                        m.setElementAt(s1, sec);
                        m.setElementAt(s2, first);

                        list.clearSelection();
                    }
                }
            }
        });
        panel.add(list);
    }

}
