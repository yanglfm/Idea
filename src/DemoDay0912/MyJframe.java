package DemoDay0912;

import javax.swing.*;
import java.awt.*;

public class MyJframe extends JFrame {
    //�̳�������ôʵ�֣���װ�ɷ�������װ����
    //���߳�һ���ĵ�������������һ���̳�Thread�࣬һ��ʵ�ֽӿ�
    //���췽����ʵ����

    //dao
    public MyJframe(){
        this.setTitle("�������Զ���Ĵ���");//this���õ�ǰʵ������
        this.setSize(500,200);
        this.setLocation(500,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    //�¼�����

    public static void main(String[] args) {
       /* //ʵ����������� �Զ���
        MyJframe frm=new MyJframe();
        frm.setSize(300,200);
        frm.setLocation(new Point(300,400));
        frm.setVisible(true);*/
       //
       new MyJframe().setVisible(true);

    }

}
