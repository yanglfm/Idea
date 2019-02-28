package DemoDay03.Afternoon.Test;

import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Properties;

public class Homework {
    public static void main(String[] args) throws Exception {
        //������
        Class c=Class.forName("java.lang.Integer");
        String simpleName = c.getSimpleName();//�������
        //��ȡ��������
        System.out.println(Modifier.toString(c.getModifiers()) + "  class  " + simpleName + " {");
        //����Properties
        Properties p=new Properties();
        //�����ļ�
        File file=new File("D:\\Idea\\src\\DemoDay03\\Afternoon\\Test\\Integer.properties");
        //����������
        BufferedReader br=new BufferedReader(new FileReader(file));
        //�����ļ�
        p.load(br);
        Field[]fs=c.getDeclaredFields();
        for (Field f : fs) {
            // �������е����η��ɵ�
            f.setAccessible(true);
            Class  type=f.getType();
            int i=f.getModifiers();
            String s= Modifier.toString(i);//��ȡ���η�

           /* System.out.print(s+"\t");
            System.out.print(type.getSimpleName()+"\t");//��ȡ�����ֶε���������
            System.out.print(f.getName());//��ȡ�ֶ�����
            System.out.print("=");
            System.out.print(p.getProperty(f.getName()));*/
            /*Object o = f.get(new Integer(3));//  ��ʾ���ǻ���ڶ���new Integer����     // ���У�Object o = fields[i].get(f)��ʾ���ǻ�ȡ�ڶ���f������fields[i]��Ӧ�Ķ����еı���
            System.out.println(o);*/
            System.out.println(f.getName());
            if(f.getName().equals("value")){
                System.out.println(s+"\t"+type.getSimpleName()+"\t"+f.getName()+";");
            }else{
                System.out.println(s+"\t"+type.getSimpleName()+"\t"+f.getName()+"="+p.getProperty(f.getName()));//��ȡ���η�+�����ֶε���������+�ֶ�����+properties�����f.getName()����Ӧ��ֵ
            }

            System.out.println();
        }
        System.out.println("}");
        //�ر���
        br.close();


    }
}
