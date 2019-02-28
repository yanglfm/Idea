package DemoDay04;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AccpTeacher {
    private String name;

    private int age;

    public AccpTeacher() {
        name = "无名氏";
        age = 22;
    }

    public AccpTeacher(String name,int age) {
        this.name = name;
        this.age = 22;
    }

    public String toString() {
        return "名字是:" + name;
    }

    public String toString(int age, String name) {
        this.name = name;
        this.age = age;
        return "名字是:" + name + "；年龄是：" + age;
    }
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        // 通过构造方法实例化一个类;本例是一个有参数的构造函数，并且构造函数可以为private修饰
        Class[] argtype = new Class[] { String.class };//代表构造方法的参数类型数组
        Object[] argparam = new Object[] { "张三" };//代表构造方法的参数值数组
        Class classType = Class.forName(AccpTeacher.class.getName());
        Constructor constructor = classType.getDeclaredConstructor(argtype); //获得构造方法，argtype是参数类型数组，我们这里代表的是参数只有一个String类型
        constructor.setAccessible(true);// 访问私有构造函数,Spring可以配置私有的属性和方法，其实就是用到的这里
        Object accpTeacher2 = constructor.newInstance(argparam);
        System.out.println(accpTeacher2);
    }
}
