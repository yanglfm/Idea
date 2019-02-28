package DemoDay0921.ui;

import DemoDay0914.MyJFrame;
import DemoDay0921.bean.Users;
import DemoDay0921.dao.IUserDao;
import DemoDay0921.dao.impl.UserDaoImpl;

import javax.swing.*;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.List;

public class JTableDemo extends MyJFrame {
    //表格组件
    private JTable table;
    //表格模型
    private JScrollPane scrollPane;
    private DefaultTableModel model;
    //右键菜单
    private JPopupMenu popupMenu;
    private JMenuItem itemNew;
    private JMenuItem itemDel;
    private JMenuItem itemInfo;
    private JMenu  menuModify;
    private JMenuItem itemTrue;
    private JMenuItem itemFalse;
    private IUserDao dao;

    public JTableDemo() {


    }
    public void JTableDemo(){
        System.out.println("1");
    }
    public void  init() {
        model = new DefaultTableModel();
        //使用模型构建表格
        table = new JTable(model) {
            @Override
            public boolean isCellEditable(int row, int column) {
                if (column<4){
                    return false;
                }else {
                    return true;
                }
            }
        };
        table.setSelectionBackground(Color.PINK);
        //设定表个选中模式
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        //对其文本
        //这个columnClass的渲染器
        ((DefaultTableCellRenderer)table.getDefaultRenderer(Object.class)).setHorizontalAlignment(JLabel.CENTER);
        //将表格放入滚动面板
        scrollPane=new JScrollPane(table);
        popupMenu=new JPopupMenu();
        itemDel=new JMenuItem("删除");
        itemNew=new JMenuItem("新增");
        itemInfo=new JMenuItem("详细信息");
        menuModify=new JMenu("修改");
        itemTrue=new JMenuItem("True");
        itemFalse=new JMenuItem("False");
        menuModify.add(itemTrue);
        menuModify.add(itemFalse);

        //将所有自选项添加到右键菜单中
        popupMenu.add(itemNew);
        popupMenu.add(itemDel);
        popupMenu.add(menuModify);
        popupMenu.add(itemInfo);
        //绑定右键菜单
        table.setComponentPopupMenu(popupMenu);
        this.add(scrollPane);
    }
    private void bindDate(){
        //数据源实例化
        dao=new UserDaoImpl();
        //调用方法
        List<Users> users = dao.findAllUser();
        //创建用户数组：用于存放用户的信息
        Object[][]userArray=new Object[users.size()][5];
        //循环遍历，进行数组内容赋值
        for (int i = 0; i <userArray.length ; i++) {
            userArray[i][0]=users.get(i).getUserid();//public E get(int index)返回此列表中指定位置的元素。
            userArray[i][1]=users.get(i).getUsername();
            userArray[i][2]=users.get(i).getPassword();
            userArray[i][3]=users.get(i).getTel();
            userArray[i][4]=users.get(i).getIsAdmin();
        }
        //创建标题数组
        Object[] columnNames = {"USERID", "USERNAME", "PASSWORD", "TEL", "ISADMIN"};
        //为表格添加数据
        model.setDataVector(userArray,columnNames);
    }

    private void bindListener(){
        itemTrue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JMenuItem item=(JMenuItem) e.getSource();
                //判断是否选中
                if(table.getSelectedRowCount()!=0){
                    if (item.getText().equals(itemTrue.getText())){

                    }

                }
            }
            private void change(String isAdmin){
                //选中行的姓名
                String username = table.getValueAt(table.getSelectedRow(), 1).toString();
                //根据姓名查找用户对象
                Users user = dao.findByUserName(username);
                //修改值
                user.setIsAdmin(isAdmin);
            }
        });

        itemFalse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        popupMenu.addPopupMenuListener(new PopupMenuListener() {
            @Override
            public void popupMenuWillBecomeVisible(PopupMenuEvent e) {
                //先设定两个子组件都是可见的
                itemTrue.setVisible(true);
                itemFalse.setVisible(true);
                //判断是否选中
                if(table.getSelectedRowCount()!=0){
                    //获取选中行
                    String isAdmin = table.getValueAt(table.getSelectedRow(), 4).toString();
                    if (isAdmin.equals("True")){
                        itemTrue.setVisible(false);
                    }else {
                        itemFalse.setVisible(false);
                    }
                }

            }

            @Override
            public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {

            }

            @Override
            public void popupMenuCanceled(PopupMenuEvent e) {

            }
        });
    }


    public static void main(String[] args) throws IOException {
       new  JTableDemo().setVisible(true);
    }
}
