package DemoDay04;

import java.lang.reflect.Constructor;
public class CustomerTest {
    public static void main(String[] args) throws Exception {
        //ͨ��������Ƶõ�Customer��
        Class c = Class.forName("DemoDay04.Customer");
        //�û�ù����������
      /*  Constructor[] con = c.getDeclaredConstructors();
        for (Constructor cons : con) {
            cons.setAccessible(true);
            //ʵ�����вι���
            Object customer = cons.newInstance("����", 20);
            System.out.println(customer);
        }*/
        Constructor con = c.getDeclaredConstructor(String.class, int.class);
        Object o = con.newInstance("����", 20);
        System.out.println(o);
    }

}