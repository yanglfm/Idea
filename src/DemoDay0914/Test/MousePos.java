package DemoDay0914.Test;

import Base.BaseJFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.MouseInfo;
import java.util.Timer;
import java.util.TimerTask;

public class MousePos extends BaseJFrame {
    private JLabel label_x, label_y;
    private java.util.Timer timer;

    public MousePos() {
        super(300, 300, "获取鼠标详情");
    }

    @Override
    public void initViews() {
        label_x = new JLabel();
        label_y = new JLabel();
        timer = new Timer();
    }

    @Override
    public void initSet() {
        setLayout(null);
        label_x.setBounds(20, 20, 100, 50);
        label_x.setText("x坐标：");

        label_y.setBounds(20, 90, 100, 50);
        label_y.setText("y坐标：");
    }

    @Override
    public void initAdd() {
        add(label_x);
        add(label_y);
    }

    @Override
    public void initEvents() {
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Point point = MouseInfo.getPointerInfo().getLocation();
                label_x.setText("x坐标：" + point.x);
                label_y.setText("y坐标：" + point.y);
            }
        }, 10, 10);
    }

    public static void main(String[] args) {
        new MousePos();
    }
}
