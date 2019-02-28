package DemoDay03.Afternoon.Test;

import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Properties;

public class Homework {
    public static void main(String[] args) throws Exception {
        //加载类
        Class c=Class.forName("java.lang.Integer");
        String simpleName = c.getSimpleName();//获得类名
        //获取所有属性
        System.out.println(Modifier.toString(c.getModifiers()) + "  class  " + simpleName + " {");
        //创建Properties
        Properties p=new Properties();
        //创建文件
        File file=new File("D:\\Idea\\src\\DemoDay03\\Afternoon\\Test\\Integer.properties");
        //创建输入流
        BufferedReader br=new BufferedReader(new FileReader(file));
        //加载文件
        p.load(br);
        Field[]fs=c.getDeclaredFields();
        for (Field f : fs) {
            // 设置所有的修饰符可得
            f.setAccessible(true);
            Class  type=f.getType();
            int i=f.getModifiers();
            String s= Modifier.toString(i);//获取修饰符

           /* System.out.print(s+"\t");
            System.out.print(type.getSimpleName()+"\t");//获取属性字段的数据类型
            System.out.print(f.getName());//获取字段名称
            System.out.print("=");
            System.out.print(p.getProperty(f.getName()));*/
            /*Object o = f.get(new Integer(3));//  表示的是获得在对象new Integer（）     // 其中：Object o = fields[i].get(f)表示的是获取在对象f中属性fields[i]对应的对象中的变量
            System.out.println(o);*/
            System.out.println(f.getName());
            if(f.getName().equals("value")){
                System.out.println(s+"\t"+type.getSimpleName()+"\t"+f.getName()+";");
            }else{
                System.out.println(s+"\t"+type.getSimpleName()+"\t"+f.getName()+"="+p.getProperty(f.getName()));//获取修饰符+属性字段的数据类型+字段名称+properties里面的f.getName()键对应的值
            }

            System.out.println();
        }
        System.out.println("}");
        //关闭流
        br.close();


    }
}
