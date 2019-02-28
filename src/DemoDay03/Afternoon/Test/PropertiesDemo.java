package DemoDay03.Afternoon.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws Exception {
        //第一步：创建对象：创建属性配置文件对象
        Properties p=new Properties();//Properties 实际是和map接口一样的，只不过Properties 的key和value存储的是字符串类型，且Key不能重复的，如果
        //如果有重复的则覆盖value的值
        //自己查jdk:Properties
        //第二步：创建输入流，读取文件
        FileInputStream file =new FileInputStream("D:\\Idea\\src\\DemoDay03\\Afternoon\\Test\\dbinfo.properties");
        //将属性文件加载过来
        p.load(file);
        //关闭流
        file.close();
        //需要通过key来拿值
        String driver=p.getProperty("driver");
        String url=p.getProperty("url");

        System.out.println(driver);

    }
}
