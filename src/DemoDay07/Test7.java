package DemoDay07;

import java.sql.*;
import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) throws Exception {
        //加载驱动
        Class.forName("oracle.jdbc.driver.OracleDriver");
        //创建连接
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "tom", "123456");
        //创建处理器对象
        //使用序列语句
        Statement stmt = conn.createStatement();
        //创建sql文
        //创建控制台输入
        //查询stu表中每个字段的名称和数据类型
        String  sql1="select * from STU";
        PreparedStatement pstmt = conn.prepareStatement(sql1);//预处理器
        ResultSet rs = pstmt.executeQuery();
      //  ResultSet rs=stmt.executeQuery(sql1);
        ResultSetMetaData metaData = rs.getMetaData();
        //先获取得到一共有多少列的记录数
        int columnCount = metaData.getColumnCount();
        //使用循环遍历
        for (int i = 1; i <=columnCount ; i++) {//从第一列开始
            //获取列名称:这两个一样
            System.out.println(metaData.getColumnName(i));
            System.out.println(metaData.getColumnLabel(i));
            //获取列的数据类型
            System.out.println(metaData.getColumnTypeName(i)+"\n");
        }
        /*    for (int i = 0; i <columnCount ; i++) {
            System.out.println(metaData.getColumnName(i+1));
            System.out.println(metaData.getColumnTypeName(i+1));
        }*/

        rs.close();
        stmt.close();
        conn.close();


    }
}
