package DemoDay0917.Test;

import DemoDay0914.MyJFrame;

import javax.swing.*;
import java.awt.*;

public class JMenuBarDemo extends MyJFrame {
    //状态的判断
    //声明菜单条件
    private JMenuBar menuBar;
    //添加菜单向
    private JMenu menuFile;
    private JMenu menuEdit;
    private JMenu menuFormat;
    private JMenu menuHelp;
    private JMenu menuView;

    //子菜单
    private JMenuItem itemClose;
    private JMenuItem itemSave;
    private JMenuItem itemImport;
    private JMenuItem itemClass;
    private JMenuItem itemProject;
    private JMenuItem itemPackage;

    public JMenuBarDemo() {
        this.setLayout(new FlowLayout());
        menuBar = new JMenuBar();
        menuFile = new JMenu("文件(F)");
        menuEdit = new JMenu("编辑(E)");
        menuFormat = new JMenu("格式(O)");
        menuView=new JMenu("查看(V)");
        menuHelp = new JMenu("帮助(H)");
        //实例化item
        itemClose = new JMenuItem("close");
        itemSave = new JMenuItem("save");
        itemImport = new JMenuItem("import");
        itemClass = new JMenuItem("class");
        itemProject = new JMenuItem("project");
        itemPackage = new JMenuItem("package");
        //新建添加子项
        menuHelp.add(itemClass);
        menuHelp.add(itemProject);
        menuHelp.add(itemClass);


        menuBar.add(menuFile);
        menuBar.add(menuHelp);
        menuBar.add(menuFormat);
        menuBar.add(menuEdit);
        this.setJMenuBar(menuBar);

    }

    public static void main(String[] args) {
        new JMenuBarDemo().setVisible(true);
    }

}
