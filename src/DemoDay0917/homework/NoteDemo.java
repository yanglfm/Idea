package DemoDay0917.homework;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class NoteDemo extends MyJFrame {
    //�����˵���
    private JMenuBar menuBar;

    //������˵�
    private JMenu menuFile;
    private JMenu menuEdit;
    private JMenu menuFormat;
    private JMenu menuView;
    private JMenu menuHelp;

    //�Ӳ˵�
    //�ļ��Ӳ˵�
    private JMenuItem itemNew;
    private JMenuItem itemOpen;
    private JMenuItem itemSave;
    private JMenuItem itemSaveAs;
    private JMenuItem itemPageSet;
    private JMenuItem itemPrint;
    private JMenuItem itemExit;

    //�༭�Ӳ˵�
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

    //��ʽ�Ӳ˵�
    private JMenuItem itemWordWrap;
    private JMenuItem itemFont;

    //�鿴�Ӳ˵�
    private JMenuItem itemStatusBar;

    //�����Ӳ˵�
    private JMenuItem itemHelp;
    private JMenuItem itemAbout;


    public NoteDemo() {
        this.setTitle("���±�");
        this.setLayout(new FlowLayout());
        menuBar = new JMenuBar();
        menuFile = new JMenu("�ļ�(F)");
        menuEdit = new JMenu("�༭(E)");
        menuFormat = new JMenu("��ʽ(O)");
        menuView = new JMenu("�鿴(V)");
        menuHelp = new JMenu("����(H)");

        //�ļ����Ӳ˵�
        //ʵ����item
        itemNew = new JMenuItem("�½�(N)");
        itemOpen = new JMenuItem("��(O)...");
        itemSave = new JMenuItem("����(S)");
        itemSaveAs = new JMenuItem("���Ϊ(A)...");
        itemPageSet = new JMenuItem("ҳ������(U)...");
        itemPrint = new JMenuItem("��ӡ(P)...");
        itemExit = new JMenuItem("�˳�(X)");

        //ʵ�����༭�Ӳ˵�
        itemRevocation = new JMenuItem("����(U)");
        itemCut = new JMenuItem("����(T)");
        itemCopy = new JMenuItem("����(C)");
        itemPaste = new JMenuItem("ճ��(P)");
        itemDelete = new JMenuItem("ɾ��(L)");
        itemFind = new JMenuItem("����(F)...");
        itemFindNext = new JMenuItem("������һ��(N)");
        itemReplace = new JMenuItem("�滻(R)...");
        itemGoto = new JMenuItem("ת��(G)...");
        itemSelectAll = new JMenuItem("ȫѡ(A)");
        itemDate = new JMenuItem("ʱ��/����(D)");

        itemWordWrap = new JMenuItem("�Զ�����(W)");
        itemFont = new JMenuItem("����(F)...");

        itemStatusBar = new JMenuItem("״̬��(S)");

        itemHelp = new JMenuItem("�鿴����(H)");
        itemAbout = new JMenuItem("���ڼ��±�(A)");


        //�ļ��������
        menuFile.add(itemNew);
        menuFile.add(itemOpen);
        menuFile.add(itemSave);
        menuFile.add(itemSaveAs);
        //��ӷָ���
        menuFile.addSeparator();
        menuFile.add(itemPageSet);
        menuFile.add(itemPrint);
        menuFile.addSeparator();
        menuFile.add(itemExit);

        //�༭�������
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


        //��ʽ�������
        menuFormat.add(itemWordWrap);
        menuFormat.add(itemFont);

        //�鿴�������
        menuView.add(itemStatusBar);

        //�����������
        menuHelp.add(itemHelp);
        menuHelp.addSeparator();
        menuHelp.add(itemAbout);


        //���JMenuItem����ϼ�
        itemNew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_MASK));
        itemOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_MASK));
        itemSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_MASK));
        itemPrint.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, KeyEvent.CTRL_MASK));

        //�༭�Ӳ˵�����ϼ�����
        itemRevocation.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, KeyEvent.CTRL_MASK));
        itemCut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, KeyEvent.CTRL_MASK));
        itemCopy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_MASK));
        itemPaste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, KeyEvent.CTRL_MASK));

        itemFind.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, KeyEvent.CTRL_MASK));

        itemReplace.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, KeyEvent.CTRL_MASK));
        itemGoto.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, KeyEvent.CTRL_MASK));
        itemSelectAll.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, KeyEvent.CTRL_MASK));
        //�趨JMenuItem�Ŀ�ݼ�
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
