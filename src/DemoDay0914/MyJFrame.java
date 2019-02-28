package DemoDay0914;

import javax.swing.*;

public class MyJFrame extends JFrame {
    public MyJFrame() {
        //一次完成设定大小和坐标
        this.setBounds(400, 300, 500, 400);
        this.setTitle("自定义窗口");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
