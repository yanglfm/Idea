package DemoDay04;

public class DateDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        //加载类
        Class c = Class.forName("java.util.Date");
        Class superclass = c.getSuperclass();//获取父类
        System.out.println("父类名："+superclass.getSimpleName());
        Class[] interfaces = c.getInterfaces();//获取父接口
        System.out.print("父接口名：");
        for (Class inter : interfaces) {
            System.out.print(inter.getSimpleName()+"\t");
        }
    }
}
