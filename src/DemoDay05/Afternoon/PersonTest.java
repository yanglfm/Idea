package DemoDay05.Afternoon;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class PersonTest {
    public static void main(String[] args) throws Exception {
        //����һ�������ļ���������ָ��·����a.txt��
        OutputStream op=new FileOutputStream("src/a.txt");
        //ͨ�������������о���Ĳ���
        ObjectOutputStream opt=new ObjectOutputStream(op);
        //д����������
        opt.writeObject(new Person("����",20));
        //�ر���
        opt.close();
        System.out.println("ok");
    }
}
