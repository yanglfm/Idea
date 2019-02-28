package DemoDay03.Afternoon.Test;

import java.io.FileInputStream;

import java.util.Properties;

public class Employees {
    private int id;
    public int age;
    protected String addr;//用不同的修饰符展示
    boolean isDY;//是否是党员
    //接下来创建配置文件employees.properties:配置文件中不要出现中文，文件路径也不能出现中文

    public static void main(String[] args) throws Exception {//创建测试类
        Properties p=new Properties();//Properties 实际是和map接口一样的，只不过Properties 的key和value存储的是字符串类型，且Key不能重复的，如果
        //如果有重复的则覆盖value的值
        //自己查jdk:Properties
        //第二步：创建输入流，读取文件
        FileInputStream file =new FileInputStream("D:\\Idea\\src\\DemoDay03\\Afternoon\\Test\\employees.properties");
        //将属性文件加载过来
        p.load(file);
        //关闭流
        file.close();
        //需要通过key来拿值
        String s=p.getProperty("classname");
        System.out.println(s);//classname对应的值：DemoDay03.Afternoon.Test.Employees
        //反射机制
        Class c=Class.forName(s);//Class c1=Class.forName("包名.类名");因为s的值就是包名和类名，所以可以直接将s放到Class.forName(s)中;
        //通过加载类，然后创建对象，接下来对对象进行操作
        //
        Object object=c.newInstance();//
        System.out.println(object);//DemoDay03.Afternoon.Test.Employees@1540e19d

    }
}


