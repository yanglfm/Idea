package DemoDay03.Afternoon.Test;

import java.io.FileInputStream;

import java.util.Properties;

public class Employees {
    private int id;
    public int age;
    protected String addr;//�ò�ͬ�����η�չʾ
    boolean isDY;//�Ƿ��ǵ�Ա
    //���������������ļ�employees.properties:�����ļ��в�Ҫ�������ģ��ļ�·��Ҳ���ܳ�������

    public static void main(String[] args) throws Exception {//����������
        Properties p=new Properties();//Properties ʵ���Ǻ�map�ӿ�һ���ģ�ֻ����Properties ��key��value�洢�����ַ������ͣ���Key�����ظ��ģ����
        //������ظ����򸲸�value��ֵ
        //�Լ���jdk:Properties
        //�ڶ�������������������ȡ�ļ�
        FileInputStream file =new FileInputStream("D:\\Idea\\src\\DemoDay03\\Afternoon\\Test\\employees.properties");
        //�������ļ����ع���
        p.load(file);
        //�ر���
        file.close();
        //��Ҫͨ��key����ֵ
        String s=p.getProperty("classname");
        System.out.println(s);//classname��Ӧ��ֵ��DemoDay03.Afternoon.Test.Employees
        //�������
        Class c=Class.forName(s);//Class c1=Class.forName("����.����");��Ϊs��ֵ���ǰ��������������Կ���ֱ�ӽ�s�ŵ�Class.forName(s)��;
        //ͨ�������࣬Ȼ�󴴽����󣬽������Զ�����в���
        //
        Object object=c.newInstance();//
        System.out.println(object);//DemoDay03.Afternoon.Test.Employees@1540e19d

    }
}


