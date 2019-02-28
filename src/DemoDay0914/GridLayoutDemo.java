package DemoDay0914;

import javax.swing.*;
import java.awt.*;

public class GridLayoutDemo extends JFrame {
    private JButton btns[];
    public GridLayoutDemo(){
        this.setBounds(400,300,500,500);
        this.setTitle("网格布局");
        this.setLayout(new GridLayout(4,3));//4行三列
        //初始化
        btns=new JButton[12];
        for (int i = 0; i <btns.length ; i++) {
            btns[i]=new JButton(""+(i+1));
            this.add(btns[i]);
        }




        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    public static void main(String[] args) {
        new GridLayoutDemo().setVisible(true);
    }
}
