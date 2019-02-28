package DemoDay07;

import java.sql.*;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        Connection conn = null;
        Statement stmt=null;
        ResultSet rs=null;
        PreparedStatement ps=null;
            //加载驱动
            Class.forName("oracle.jdbc.driver.OracleDriver");//采用这个写法好处是只加载一次

            //获取程序的连接
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","tom","123456");

            //插入语句
            //创建处理器对象
            stmt = conn.createStatement();
            //创建sql文
            //创建修改
            System.out.println("请输入用户名:");
            String str1=sc.next();
            System.out.println("请输入修改的金额");
            int i=sc.nextInt();
            String sql5="update bank set balance=? where username=?";
            //创建删除
            //String sql7="delete from bank where user ";
            ps=conn.prepareStatement(sql5);
            ps.setString(1,str1);
            ps.setInt(2,i);
            //查询语句
            String sql6="select username,balance  from BANK";
            //执行
            stmt.executeUpdate(sql5);

            rs = stmt.executeQuery(sql6);

        while (rs.next()){
                //如果为true 代表结果集中还有数据
                //数据中的每一列该怎么获取，
                // 通过每一列的数据类型来使用getXX方法 根据字段名 来获取该列的数据
                String username = rs.getString(1);
                int password = rs.getInt(2);
                System.out.println("username "+username +"\t password:"+password);

            }

rs.close();
                stmt.close();
                conn.close();



    }
}
