package DemoDay0917;

import DemoDay0914.MyJFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Test3 extends  MyJFrame {
    //״̬���ж�
    //�����˵�����
    private JMenuBar menuBar;
    //��Ӳ˵���
    private JMenu menuFile;
    private JMenu menuEdit;
    private JMenu menuSource;
    private JMenu menuNew;

    //�Ӳ˵�
    private JMenuItem itemClose;
    private JMenuItem itemSave;
    private JMenuItem itemImport;
    private JMenuItem itemClass;
    private JMenuItem itemProject;
    private JMenuItem itemPackage;

    private JCheckBox chk;//��ѡ��
    public Test3() {
        this.setLayout(new FlowLayout());

        chk=new JCheckBox("����");

        menuBar=new JMenuBar();
        menuFile=new JMenu("�ļ�");
        menuEdit=new JMenu("�༭");
        menuSource=new JMenu("Դ��");
        menuNew=new JMenu("�½�");
        //ʵ����item
        itemClose=new JMenuItem("close");
        itemSave=new JMenuItem("save");
        itemImport=new JMenuItem("import");
        itemClass=new JMenuItem("class");
        itemProject=new JMenuItem("project");
        itemPackage=new JMenuItem("package");
        //�½��������
        menuNew.add(itemClass);

        menuNew.add(itemProject);
        //��ӷָ���
        menuNew.addSeparator();
        menuNew.add(itemClass);
        //��Ӹ�ѡ��
        menuNew.add(chk);


        //�����˵�������
        menuFile.add(menuNew);
        menuFile.add(itemImport);
        menuFile.add(itemClose);

        //�趨JMenuItem�Ŀ�ݼ�
        itemSave.setAccelerator(KeyStroke.getKeyStroke('S'));

        //�趨��ϼ�alt+i
        itemImport.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I,KeyEvent.ALT_MASK));

        //�ȼ�����
        menuFile.setMnemonic('f');



        menuBar.add(menuFile);
     //   menuBar.add(menuNew);
        menuBar.add(menuSource);
        menuBar.add(menuEdit);
        //���¼�
        itemImport.addMouseListener(new myMouseListener());
        this.setJMenuBar(menuBar);


    }
    private class myMouseListener implements MouseListener {
        @Override
        public void mouseClicked(MouseEvent e) {
          /*System.out.println("�ұ�����ˣ�");*/
            //��ȡ�¼�Դ
            Object obj = e.getSource();
            //�ж��Ƿ���JMenuItem
            if(obj instanceof JMenuItem){
                JMenuItem item=(JMenuItem)obj;
                if (item.getText().equals(itemClass.getText())){
                    JOptionPane.showMessageDialog(null,itemClass.getText());
                }
            }


        }

        @Override
        public void mousePressed(MouseEvent e) {
            //System.out.println("��갴��");//������갴ס��ʱ����ʾ

        }

        @Override
        public void mouseReleased(MouseEvent e) {
            //  System.out.println("��굯���ͷš�");;

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            //����������������ˣ�����ʾ������
            // System.out.println("������");

        }

        @Override
        public void mouseExited(MouseEvent e) {
            //��������˳��������Ƴ������Χʱ��ʾ
            //  System.out.println("����˳�");

        }
    }
    public static void main(String[] args) {
        new Test3().setVisible(true);
    }

}
