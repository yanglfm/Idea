package DemoDay05.Afternoon;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class PersonTest {
    public static void main(String[] args) throws Exception {
        //建立一个输入文件对象流到指定路径下a.txt中
        OutputStream op=new FileOutputStream("src/a.txt");
        //通过对象流来进行具体的操作
        ObjectOutputStream opt=new ObjectOutputStream(op);
        //写入具体的内容
        opt.writeObject(new Person("张三",20));
        //关闭流
        opt.close();
        System.out.println("ok");
    }
}
