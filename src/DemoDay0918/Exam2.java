package DemoDay0918;

import DemoDay0914.MyJFrame;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Exam2 extends MyJFrame {
    //��������֮��Ĵ��ݣ������������࣬ʵ������Ȼ������Ϊ���ӻ�
    //���ݿ��еı���ֵ�
    //����������JTable�������������ͻ�����
    //�������Ҽ������˵����еĿ��ã��еĲ����ã���Ҫ������һЩ�¼�
    //����ѡ������ڼ����¼�һ���У�������ѡ���
    //�����ʼ��
    private JTable table;
    private JScrollPane panel;
    private DefaultTableModel model;

    public Exam2() {
       /* //����1
        table=new JTable(4,4);//���м���
        //�������������趨ֵ
        table.setValueAt("123456",1,2);
        table.setValueAt(12.63,1,3);//��Ϊ��Object���ͣ����Կ�������κ����͵�����
        //��ȡ�ڼ��еڼ��е�ֵ
        System.out.println(table.getValueAt(1,2));*/
        //����2
  /*      //���ñ�����
       Object[] columnNames=new Object[]{"name","age","sex","isAdmin"};//��������
        //�����е�����
        Object[][]rowDate=new Object[3][4];//��ά�������������Ҫд���������Բ�д
       //��ÿһ�и�ֵ
        rowDate[0]=new Object[]{"����","20","��",true};//�����Խ���
        rowDate[1]=new Object[]{"����","21","��",false};//�����Խ���
        rowDate[2]=new Object[]{"����","23","Ů",false};//�����Խ���
       //���ʵ����
        table = new JTable(rowDate, columnNames);//û�б�����
        panel=new JScrollPane(table);//ֱ��ʵ�����ͼ���table���Ż���ʾ���̣�
       // panel.add(table);
        //�����ʾ�����У������Ǽ�JPanel*/

        //����4
        //���ñ�����
        Object[] columnNames = new Object[]{"name", "age", "sex", "isAdmin"};//��������
        //�����е�����
        Object[][] rowDate = new Object[3][4];//��ά�������������Ҫд���������Բ�д
        //��ÿһ�и�ֵ
        rowDate[0] = new Object[]{"����", "20", "��", true};//�����Խ���
        rowDate[1] = new Object[]{"����", "21", "��", false};//�����Խ���
        rowDate[2] = new Object[]{"����", "23", "Ů", false};
        //ʹ��ģ��������к�ֵ
        model = new DefaultTableModel(rowDate, columnNames);
        table = new JTable(model) {
            @Override
            public boolean isCellEditable(int row, int column) {
                /*System.out.println(row+"  "+column);

                return super.isCellEditable(row, column);*/
           /*     //����ȫ�����ɱ༭
                return false;*/
               /* //����ǰ3�в����޸�
                if (column < 3) {
                    return false;
                }else{
                    return true;
                }*/
                //����ǰ���в����Ա༭
                if (row < 2) {
                    return false;
                } else {
                    return true;
                }

            }

            @Override
            public Class<?> getColumnClass(int column) {
                return table.getValueAt(0, column).getClass();//�ı��ʽ
            }
        };
        //{}//��������

       /* table.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

                System.out.println( table.getSelectedRow()+"   "+table.getSelectedColumn());
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });*/
      /*  //������ñ�����ɫ
        table.setBackground(Color.LIGHT_GRAY);*/
        //����������ʽ
        //���߰�
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        // String[] font = toolkit.getFontList();
        table.setFont(new Font("����", Font.BOLD, 16));//ǰ�������壬���氡��
        //ָ��ѡ���е���ɫ
        table.setSelectionBackground(Color.PINK);//ѡ�е�ʱ����pink��ɫ
        //ѡ���е�ǰ��ɫ
        table.setSelectionForeground(Color.GREEN);//ѡ���е��������ɫ����ײɫ
        //�����и�
        table.setRowHeight(20);
       /* //ȥ������
        table.setShowGrid(false);//����ʾ�����߾�û��*/
        //������������ɫ
        table.setGridColor(Color.BLACK);
        //�ı����ݶ���
        DefaultTableCellRenderer renderer =(DefaultTableCellRenderer) table.getDefaultRenderer(Object.class);//������������ʲô�������ݶ������ȥ
        renderer.setHorizontalAlignment(JLabel.CENTER);//�ı����ж���

        //��ֹ��ק��ͷ
        table.getTableHeader().setReorderingAllowed(false);
        //��ֹ��ק��ͷ�Ŀ�ȣ���
        table.getTableHeader().setResizingAllowed(false);

        //���±���е���������
        rowDate[0] = new Object[]{"����", "20", "��", true};
        model.setDataVector(rowDate,columnNames);//ͨ��ģ���ٴ�����

        //�����������Լ�Ū

        //������������table
        panel = new JScrollPane(table);
        this.add(panel);

        //this.add(table);
    }

    public static void main(String[] args) {
        new Exam2().setVisible(true);//��������
    }

}
