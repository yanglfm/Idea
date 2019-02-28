package DemoDay07;

import java.sql.*;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) throws Exception {
        //加载驱动
        Class.forName("oracle.jdbc.driver.OracleDriver");
        //创建连接
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "tom", "123456");
        //创建处理器对象
        Statement stmt = conn.createStatement();
        //创建sql文
        //创建控制台输入
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入用户名");
        String str=sc.next();
        System.out.println("请输入修改的金额");
        int i=sc.nextInt();
        /*System.out.println("请输入用户名");
        String empno=sc.next();
        System.out.println("请输入修改的金额");
        int sal=sc.nextInt();
        String sql3="update emp set sal="+sal+"whee empno="+empno;*/
        String sql1="update bank set balance='"+i+"' where username='" +str+ "'";//根据录入的数据修改相应的值
        String sql2="select USERNAME,BALANCE from BANK";
        //执行where Name='" + name + "'"
        int executeUpdate = stmt.executeUpdate(sql1);//这个是执行更新的语句
        //执行
        ResultSet rs = stmt.executeQuery(sql2);//执行插入数据
        while(rs.next()){
            String username = rs.getString(1);
            int balance = rs.getInt(2);
            System.out.println(username+"---"+balance);
        }
        rs.close();
        stmt.close();
        conn.close();

    }
}
