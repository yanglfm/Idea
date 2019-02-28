package DemoDay03.Afternoon.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class FieldTest {
    public static void main(String[] args) throws Exception {
        //������
        Class c=Class.forName("java.lang.Integer");
        //��ȡ�����ֶ�Field
      /*  Field[]fs=c.getFields();
        System.out.println(fs.length);
        System.out.println(fs[0].getName());*/
        //��ȡ��������
        Field[]fs =  c.getDeclaredFields();
        for (Field field:fs){
            //��ȡ�ֶ�����
            System.out.println(field.getName());
            //��ȡ�����ֶε���������
            Class type=field.getType();
            System.out.println(type.getName());
            System.out.println(type.getSimpleName());//ͬ��һ����Ч��

            //��ȡ���η�
            int i=field.getModifiers();
            System.out.println(i);
            //����modifier��ת��iֵ
            String s= Modifier.toString(i);
            System.out.println(s);
            System.out.println();

        }

    }
}
