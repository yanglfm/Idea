package DemoDay07;

import java.sql.*;

public class Test9 {
    public static void main(String[] args) throws Exception {
        //加载驱动
        Class.forName("oracle.jdbc.driver.OracleDriver");
        //创建连接
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "tom", "123456");

        //插入语句
        String sql="select  * from BANK";//根据数据库里面数据字段列来确定select* 里面的具体哪一列要到数据库里面去找
        //预处理的插入方式
        PreparedStatement pstmt = conn.prepareStatement(sql);
        //返回结果集
        ResultSet rs = pstmt.executeQuery();
        while(rs.next()){
            System.out.println(rs.getInt(2));
        }
        conn.close();

    }
}
