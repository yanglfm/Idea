package Base;

import javax.swing.*;

public abstract class BaseJFrame extends JFrame {

    public abstract void initViews();//实例化控件

    public abstract void initSet();//设置属性

    public abstract void initAdd();//添加组件

    public abstract void initEvents();//事件处理

    public BaseJFrame(int x, int y, String name) {
        this.setSize(x, y);
        this.setTitle(name);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        initViews();
        initSet();
        initAdd();
        initEvents();

        this.setVisible(true);
    }

  /*  public void Frame(JFrame frame, int x, int y, String name) {
        frame.setSize(x, y);
        frame.setTitle(name);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }*/

}
