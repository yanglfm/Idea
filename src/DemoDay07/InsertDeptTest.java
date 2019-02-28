package DemoDay07;

import java.sql.*;

public class InsertDeptTest {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            //加载驱动
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:orcl";
            String username = "tom";
            String password = "123456";
            //获取程序的连接
            conn = DriverManager.getConnection(url, username, password);
            //创建处理器
            stmt = conn.createStatement();
            //执行插入语句
            String sql10 = "insert into dept values(50,'IT','China')";
            String sql11 = "insert into dept values(60,'Developmemt','China')";
            String sql12 = "insert into dept values(70,'Technology','China')";
           // stmt.addBatch(sql10);
            stmt.addBatch(sql11);
            stmt.addBatch(sql12);
            int[] count = stmt.executeBatch();
            System.out.println(count.length);
           /* String sql4="select * from  EMP";//查看emp表
            PreparedStatement ps = conn.prepareStatement(sql4);//问题1：日期，问题2：多条数据的插入//java.sql.BatchUpdateException: 批处理中出现错误: ORA-00001: 违反唯一约束条件 (TOM.PK_EMP)*/
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

    }
}
