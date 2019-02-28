package DemoDay03.Afternoon.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        //类加载
        Class c1=Class.forName("java.util.Date");//进入Date类
        Object obj=c1.newInstance();//创建实例，可以用obj接受
        Date date=(Date)obj;
        if(obj instanceof Date){//判断obj是否属于Date类
            System.out.println(new SimpleDateFormat("yyyy-MM-dd hh: mm :ss").format(date));
        }
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh: mm :ss");
        System.out.println(sdf.format(date));
    }
}
