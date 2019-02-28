package DemoDay0917;

import DemoDay0914.MyJFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Test3 extends  MyJFrame {
    //状态的判断
    //声明菜单条件
    private JMenuBar menuBar;
    //添加菜单向
    private JMenu menuFile;
    private JMenu menuEdit;
    private JMenu menuSource;
    private JMenu menuNew;

    //子菜单
    private JMenuItem itemClose;
    private JMenuItem itemSave;
    private JMenuItem itemImport;
    private JMenuItem itemClass;
    private JMenuItem itemProject;
    private JMenuItem itemPackage;

    private JCheckBox chk;//复选框
    public Test3() {
        this.setLayout(new FlowLayout());

        chk=new JCheckBox("换行");

        menuBar=new JMenuBar();
        menuFile=new JMenu("文件");
        menuEdit=new JMenu("编辑");
        menuSource=new JMenu("源码");
        menuNew=new JMenu("新建");
        //实例化item
        itemClose=new JMenuItem("close");
        itemSave=new JMenuItem("save");
        itemImport=new JMenuItem("import");
        itemClass=new JMenuItem("class");
        itemProject=new JMenuItem("project");
        itemPackage=new JMenuItem("package");
        //新建添加子项
        menuNew.add(itemClass);

        menuNew.add(itemProject);
        //添加分割线
        menuNew.addSeparator();
        menuNew.add(itemClass);
        //添加复选框
        menuNew.add(chk);


        //二级菜单的制作
        menuFile.add(menuNew);
        menuFile.add(itemImport);
        menuFile.add(itemClose);

        //设定JMenuItem的快捷键
        itemSave.setAccelerator(KeyStroke.getKeyStroke('S'));

        //设定组合键alt+i
        itemImport.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I,KeyEvent.ALT_MASK));

        //热键设置
        menuFile.setMnemonic('f');



        menuBar.add(menuFile);
     //   menuBar.add(menuNew);
        menuBar.add(menuSource);
        menuBar.add(menuEdit);
        //绑定事件
        itemImport.addMouseListener(new myMouseListener());
        this.setJMenuBar(menuBar);


    }
    private class myMouseListener implements MouseListener {
        @Override
        public void mouseClicked(MouseEvent e) {
          /*System.out.println("我被点击了！");*/
            //获取事件源
            Object obj = e.getSource();
            //判断是否是JMenuItem
            if(obj instanceof JMenuItem){
                JMenuItem item=(JMenuItem)obj;
                if (item.getText().equals(itemClass.getText())){
                    JOptionPane.showMessageDialog(null,itemClass.getText());
                }
            }


        }

        @Override
        public void mousePressed(MouseEvent e) {
            //System.out.println("鼠标按下");//就是鼠标按住的时候提示

        }

        @Override
        public void mouseReleased(MouseEvent e) {
            //  System.out.println("鼠标弹起【释放】");;

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            //代表鼠标进入面板来了，就提示鼠标进入
            // System.out.println("鼠标进入");

        }

        @Override
        public void mouseExited(MouseEvent e) {
            //代表鼠标退出，当你移出这个范围时提示
            //  System.out.println("鼠标退出");

        }
    }
    public static void main(String[] args) {
        new Test3().setVisible(true);
    }

}
