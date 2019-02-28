package DemoDay0920;

import DemoDay0914.MyJFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameTransmit extends MyJFrame {
    private JButton jButton;
    private JTextField jTextField;

    public JButton getjButton() {
        return jButton;
    }

    public void setjButton(JButton jButton) {
        this.jButton = jButton;
    }

    public JTextField getjTextField() {
        return jTextField;
    }

    public void setjTextField(JTextField jTextField) {
        this.jTextField = jTextField;
    }

    public JFrameTransmit() {
        jButton = new JButton("°´Å¥");
        jTextField=new JTextField("123456");

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new JFrameTwo(JFrameTransmit.this).setVisible(true);
                JFrameTransmit.this.setVisible(false);
            }
        });
        this.add(jTextField);
        this.add(jButton);
    }


    public static void main(String[] args) {
        new JFrameTransmit().setVisible(true);
    }
}

class JFrameTwo extends MyJFrame {
    private JLabel jLabel;
    public JFrameTwo(JFrameTransmit jFrame) {
        jLabel = new JLabel(jFrame.getjTextField().getText()+jFrame.getjButton().getText());
        this.add(jLabel);
    }
}
