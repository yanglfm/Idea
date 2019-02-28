package DemoDay0917.homework;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class NoteDemo extends MyJFrame {
    //声明菜单条
    private JMenuBar menuBar;

    //添加主菜单
    private JMenu menuFile;
    private JMenu menuEdit;
    private JMenu menuFormat;
    private JMenu menuView;
    private JMenu menuHelp;

    //子菜单
    //文件子菜单
    private JMenuItem itemNew;
    private JMenuItem itemOpen;
    private JMenuItem itemSave;
    private JMenuItem itemSaveAs;
    private JMenuItem itemPageSet;
    private JMenuItem itemPrint;
    private JMenuItem itemExit;

    //编辑子菜单
    private JMenuItem itemRevocation;
    private JMenuItem itemCut;
    private JMenuItem itemCopy;
    private JMenuItem itemPaste;
    private JMenuItem itemDelete;
    private JMenuItem itemFind;
    private JMenuItem itemFindNext;
    private JMenuItem itemReplace;
    private JMenuItem itemGoto;
    private JMenuItem itemSelectAll;
    private JMenuItem itemDate;

    //格式子菜单
    private JMenuItem itemWordWrap;
    private JMenuItem itemFont;

    //查看子菜单
    private JMenuItem itemStatusBar;

    //帮助子菜单
    private JMenuItem itemHelp;
    private JMenuItem itemAbout;


    public NoteDemo() {
        this.setTitle("记事本");
        this.setLayout(new FlowLayout());
        menuBar = new JMenuBar();
        menuFile = new JMenu("文件(F)");
        menuEdit = new JMenu("编辑(E)");
        menuFormat = new JMenu("格式(O)");
        menuView = new JMenu("查看(V)");
        menuHelp = new JMenu("帮助(H)");

        //文件的子菜单
        //实例化item
        itemNew = new JMenuItem("新建(N)");
        itemOpen = new JMenuItem("打开(O)...");
        itemSave = new JMenuItem("保存(S)");
        itemSaveAs = new JMenuItem("另存为(A)...");
        itemPageSet = new JMenuItem("页面设置(U)...");
        itemPrint = new JMenuItem("打印(P)...");
        itemExit = new JMenuItem("退出(X)");

        //实例化编辑子菜单
        itemRevocation = new JMenuItem("撤销(U)");
        itemCut = new JMenuItem("剪切(T)");
        itemCopy = new JMenuItem("复制(C)");
        itemPaste = new JMenuItem("粘贴(P)");
        itemDelete = new JMenuItem("删除(L)");
        itemFind = new JMenuItem("查找(F)...");
        itemFindNext = new JMenuItem("查找下一个(N)");
        itemReplace = new JMenuItem("替换(R)...");
        itemGoto = new JMenuItem("转到(G)...");
        itemSelectAll = new JMenuItem("全选(A)");
        itemDate = new JMenuItem("时间/日期(D)");

        itemWordWrap = new JMenuItem("自动换行(W)");
        itemFont = new JMenuItem("字体(F)...");

        itemStatusBar = new JMenuItem("状态栏(S)");

        itemHelp = new JMenuItem("查看帮助(H)");
        itemAbout = new JMenuItem("关于记事本(A)");


        //文件添加子项
        menuFile.add(itemNew);
        menuFile.add(itemOpen);
        menuFile.add(itemSave);
        menuFile.add(itemSaveAs);
        //添加分割线
        menuFile.addSeparator();
        menuFile.add(itemPageSet);
        menuFile.add(itemPrint);
        menuFile.addSeparator();
        menuFile.add(itemExit);

        //编辑添加子项
        menuEdit.add(itemRevocation);
        menuEdit.addSeparator();
        menuEdit.add(itemCut);
        menuEdit.add(itemCopy);
        menuEdit.add(itemPaste);
        menuEdit.add(itemDelete);
        menuEdit.addSeparator();
        menuEdit.add(itemFind);
        menuEdit.add(itemFindNext);
        menuEdit.add(itemReplace);
        menuEdit.add(itemGoto);
        menuEdit.addSeparator();
        menuEdit.add(itemSelectAll);
        menuEdit.add(itemDate);


        //格式添加子项
        menuFormat.add(itemWordWrap);
        menuFormat.add(itemFont);

        //查看添加子项
        menuView.add(itemStatusBar);

        //帮助添加子项
        menuHelp.add(itemHelp);
        menuHelp.addSeparator();
        menuHelp.add(itemAbout);


        //添加JMenuItem的组合键
        itemNew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_MASK));
        itemOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_MASK));
        itemSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_MASK));
        itemPrint.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, KeyEvent.CTRL_MASK));

        //编辑子菜单的组合键设置
        itemRevocation.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, KeyEvent.CTRL_MASK));
        itemCut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, KeyEvent.CTRL_MASK));
        itemCopy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_MASK));
        itemPaste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, KeyEvent.CTRL_MASK));

        itemFind.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, KeyEvent.CTRL_MASK));

        itemReplace.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, KeyEvent.CTRL_MASK));
        itemGoto.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, KeyEvent.CTRL_MASK));
        itemSelectAll.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, KeyEvent.CTRL_MASK));
        //设定JMenuItem的快捷键
        itemDelete.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0));
        itemFindNext.setAccelerator(KeyStroke.getKeyStroke("F3"));
        itemDate.setAccelerator(KeyStroke.getKeyStroke("F5"));

        menuBar.add(menuFile);
        menuBar.add(menuEdit);
        menuBar.add(menuFormat);
        menuBar.add(menuView);
        menuBar.add(menuHelp);

        this.setJMenuBar(menuBar);

    }


    public static void main(String[] args) {
        new NoteDemo().setVisible(true);
    }
}
