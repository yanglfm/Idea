package DemoDay03.Afternoon.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws Exception {
        //��һ�����������󣺴������������ļ�����
        Properties p=new Properties();//Properties ʵ���Ǻ�map�ӿ�һ���ģ�ֻ����Properties ��key��value�洢�����ַ������ͣ���Key�����ظ��ģ����
        //������ظ����򸲸�value��ֵ
        //�Լ���jdk:Properties
        //�ڶ�������������������ȡ�ļ�
        FileInputStream file =new FileInputStream("D:\\Idea\\src\\DemoDay03\\Afternoon\\Test\\dbinfo.properties");
        //�������ļ����ع���
        p.load(file);
        //�ر���
        file.close();
        //��Ҫͨ��key����ֵ
        String driver=p.getProperty("driver");
        String url=p.getProperty("url");

        System.out.println(driver);

    }
}
