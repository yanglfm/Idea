package Exam.Test;

import DemoDay0914.MyJFrame;
import DemoDay2.DemoDay2.Test.DemoDay2.Homework.User;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Vector;

public class JTablePageTest extends MyJFrame {
    private int currentPage=1;
    private int pageSize=2;
    private int lastPage;
    JTable table =null;
    DefaultTableModel dtm=null;
    JScrollPane jsp=null;
    JTablePageTest jTablePageTest=null;
    List list,list1;
    JButton button1=null;
   IUserDao dao;

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getLastPage() {
        return lastPage;
    }

    public void setLastPage(int lastPage) {
        this.lastPage = lastPage;
    }

    public JTablePageTest(){
        dao=new UserDaoImpl();
        list=dao.findAllUser();
        if (list.size()%pageSize==0){
            setLastPage(list.size()/getPageSize());
        }else{
            setLastPage(list.size()/getPageSize()+1);
        }
        Object[] columnNames={"USERID", "USERNAME", "PASSWORD", "TEL", "ISADMIN"};
        dtm=new DefaultTableModel(columnNames,0);
        table=new JTable(dtm);
        jsp=new JScrollPane();
        jsp.setViewportView(table);
        getContentPane().add(jsp);
        setTitle("分页演示");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        showTable(currentPage);
        JPanel panel=new JPanel();
        getContentPane().add(panel, BorderLayout.SOUTH);

        JButton button=new JButton("首页");
        button.addActionListener(new MyTable());
        button.setActionCommand("首页");
        panel.add(button);
        button1=new JButton("上一页");
        button1.addActionListener(new MyTable());
        panel.add(button1);
        JButton button2 = new JButton("下一页");
        button2.addActionListener(new MyTable());
        panel.add(button2);
        JButton button3 = new JButton("末页");
        button3.addActionListener(new MyTable());
        panel.add(button3);
        setVisible(true);

    }
    public void showTable(int currentPage){
        dtm.setRowCount(0);//清楚原有行
        setCurrentPage(currentPage);
        list1=dao.findUsers(currentPage,pageSize);
        for (int row = 0; row <list1.size() ; row++) {//获得数据
            Vector v=new Vector();//集合
            Users user=(Users) list1.get(row);
            v.add(user.getUserid());//数据
            v.add(user.getUsername());
            v.add(user.getPassword());
            v.add(user.getTel());
            v.add(user.getIsAdmin());
            dtm.addRow(v);
        }
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        table.setSelectionBackground(Color.YELLOW);
        table.setSelectionForeground(Color.RED);
        table.setRowHeight(20);
    }
    class MyTable implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("首页")){//该字符串标识此事件的命令
                showTable(1);
            }
            if (e.getActionCommand().equals("上一页")){
                if (getCurrentPage()<=1){
                    setCurrentPage(2);
                }
                showTable(getCurrentPage()-1);
            }
            if (e.getActionCommand().equals("下一页")){
                if (getCurrentPage()<getLastPage()){
                    showTable(getCurrentPage()+1);
                }else {
                    showTable(getLastPage());
                }
            }
            if (e.getActionCommand().equals("末页")){
                showTable(getLastPage());
            }
        }
    }


    public static void main(String[] args) {
        new JTablePageTest();
    }

}
