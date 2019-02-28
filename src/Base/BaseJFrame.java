package Base;

import javax.swing.*;

public abstract class BaseJFrame extends JFrame {

    public abstract void initViews();//ʵ�����ؼ�

    public abstract void initSet();//��������

    public abstract void initAdd();//������

    public abstract void initEvents();//�¼�����

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
