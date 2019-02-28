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
    //������
    private JTable table;
    //���ģ��
    private JScrollPane scrollPane;
    private DefaultTableModel model;
    //�Ҽ��˵�
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
        //ʹ��ģ�͹������
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
        //�趨���ѡ��ģʽ
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        //�����ı�
        //���columnClass����Ⱦ��
        ((DefaultTableCellRenderer)table.getDefaultRenderer(Object.class)).setHorizontalAlignment(JLabel.CENTER);
        //��������������
        scrollPane=new JScrollPane(table);
        popupMenu=new JPopupMenu();
        itemDel=new JMenuItem("ɾ��");
        itemNew=new JMenuItem("����");
        itemInfo=new JMenuItem("��ϸ��Ϣ");
        menuModify=new JMenu("�޸�");
        itemTrue=new JMenuItem("True");
        itemFalse=new JMenuItem("False");
        menuModify.add(itemTrue);
        menuModify.add(itemFalse);

        //��������ѡ����ӵ��Ҽ��˵���
        popupMenu.add(itemNew);
        popupMenu.add(itemDel);
        popupMenu.add(menuModify);
        popupMenu.add(itemInfo);
        //���Ҽ��˵�
        table.setComponentPopupMenu(popupMenu);
        this.add(scrollPane);
    }
    private void bindDate(){
        //����Դʵ����
        dao=new UserDaoImpl();
        //���÷���
        List<Users> users = dao.findAllUser();
        //�����û����飺���ڴ���û�����Ϣ
        Object[][]userArray=new Object[users.size()][5];
        //ѭ�������������������ݸ�ֵ
        for (int i = 0; i <userArray.length ; i++) {
            userArray[i][0]=users.get(i).getUserid();//public E get(int index)���ش��б���ָ��λ�õ�Ԫ�ء�
            userArray[i][1]=users.get(i).getUsername();
            userArray[i][2]=users.get(i).getPassword();
            userArray[i][3]=users.get(i).getTel();
            userArray[i][4]=users.get(i).getIsAdmin();
        }
        //������������
        Object[] columnNames = {"USERID", "USERNAME", "PASSWORD", "TEL", "ISADMIN"};
        //Ϊ����������
        model.setDataVector(userArray,columnNames);
    }

    private void bindListener(){
        itemTrue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JMenuItem item=(JMenuItem) e.getSource();
                //�ж��Ƿ�ѡ��
                if(table.getSelectedRowCount()!=0){
                    if (item.getText().equals(itemTrue.getText())){

                    }

                }
            }
            private void change(String isAdmin){
                //ѡ���е�����
                String username = table.getValueAt(table.getSelectedRow(), 1).toString();
                //�������������û�����
                Users user = dao.findByUserName(username);
                //�޸�ֵ
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
                //���趨������������ǿɼ���
                itemTrue.setVisible(true);
                itemFalse.setVisible(true);
                //�ж��Ƿ�ѡ��
                if(table.getSelectedRowCount()!=0){
                    //��ȡѡ����
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
