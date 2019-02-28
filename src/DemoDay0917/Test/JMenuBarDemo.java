package DemoDay0917.Test;

import DemoDay0914.MyJFrame;

import javax.swing.*;
import java.awt.*;

public class JMenuBarDemo extends MyJFrame {
    //״̬���ж�
    //�����˵�����
    private JMenuBar menuBar;
    //��Ӳ˵���
    private JMenu menuFile;
    private JMenu menuEdit;
    private JMenu menuFormat;
    private JMenu menuHelp;
    private JMenu menuView;

    //�Ӳ˵�
    private JMenuItem itemClose;
    private JMenuItem itemSave;
    private JMenuItem itemImport;
    private JMenuItem itemClass;
    private JMenuItem itemProject;
    private JMenuItem itemPackage;

    public JMenuBarDemo() {
        this.setLayout(new FlowLayout());
        menuBar = new JMenuBar();
        menuFile = new JMenu("�ļ�(F)");
        menuEdit = new JMenu("�༭(E)");
        menuFormat = new JMenu("��ʽ(O)");
        menuView=new JMenu("�鿴(V)");
        menuHelp = new JMenu("����(H)");
        //ʵ����item
        itemClose = new JMenuItem("close");
        itemSave = new JMenuItem("save");
        itemImport = new JMenuItem("import");
        itemClass = new JMenuItem("class");
        itemProject = new JMenuItem("project");
        itemPackage = new JMenuItem("package");
        //�½��������
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
