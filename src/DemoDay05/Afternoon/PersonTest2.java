package DemoDay05.Afternoon;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class PersonTest2 {
    public static void main(String[] args) throws Exception {
        //�����л���ȡ�ļ��е�����
        //������ȡ������
        InputStream in=new FileInputStream("src/a.txt");
        //�����ַ����飬�ͼ���⻺����������
        byte []bys=new byte[10];//һ��Ϊ1024
        //���ȵ�����
        int len=-1;//��ʾû����
        //���������л�
        ObjectInputStream o=new ObjectInputStream(in);
        //��ȡ����
        Person p = (Person) o.readObject();
        System.out.println(p);
        //�ر���
        o.close();

    }
}
