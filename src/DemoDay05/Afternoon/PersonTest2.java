package DemoDay05.Afternoon;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class PersonTest2 {
    public static void main(String[] args) throws Exception {
        //反序列化读取文件中的内容
        //创建读取输入流
        InputStream in=new FileInputStream("src/a.txt");
        //创建字符数组，就简单理解缓冲内容区域
        byte []bys=new byte[10];//一般为1024
        //长度的属性
        int len=-1;//表示没有了
        //创建反序列化
        ObjectInputStream o=new ObjectInputStream(in);
        //读取内容
        Person p = (Person) o.readObject();
        System.out.println(p);
        //关闭流
        o.close();

    }
}
