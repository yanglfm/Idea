package DemoDay0918;

import DemoDay0914.MyJFrame;

import javax.swing.*;

public class Exam1 extends MyJFrame {
    //��������֮��Ĵ��ݣ������������࣬ʵ������Ȼ������Ϊ���ӻ�
    //���ݿ��еı���ֵ�
    //����������JTable�������������ͻ�����
    //�������Ҽ������˵����еĿ��ã��еĲ����ã���Ҫ������һЩ�¼�
    //����ѡ������ڼ����¼�һ���У�������ѡ���
    //�����ʼ��
    private JTable table;
    private JScrollPane panel;
    public Exam1(){
       /* //����1
        table=new JTable(4,4);//���м���
        //�������������趨ֵ
        table.setValueAt("123456",1,2);
        table.setValueAt(12.63,1,3);//��Ϊ��Object���ͣ����Կ�������κ����͵�����
        //��ȡ�ڼ��еڼ��е�ֵ
        System.out.println(table.getValueAt(1,2));*/
       //����2
        //���ñ�����
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
        //�����ʾ�����У������Ǽ�JPanel

        this.add(panel);

        //this.add(table);
    }

    public static void main(String[] args) {
        new Exam1().setVisible(true);
    }

}
