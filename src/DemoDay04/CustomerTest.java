package DemoDay04;

import java.lang.reflect.Constructor;
public class CustomerTest {
    public static void main(String[] args) throws Exception {
        //通过反射机制得到Customer类
        Class c = Class.forName("DemoDay04.Customer");
        //得获得构造参数数组
      /*  Constructor[] con = c.getDeclaredConstructors();
        for (Constructor cons : con) {
            cons.setAccessible(true);
            //实例化有参构造
            Object customer = cons.newInstance("张三", 20);
            System.out.println(customer);
        }*/
        Constructor con = c.getDeclaredConstructor(String.class, int.class);
        Object o = con.newInstance("张三", 20);
        System.out.println(o);
    }

}