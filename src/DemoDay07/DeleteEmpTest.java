package DemoDay07;

import java.sql.*;

public class DeleteEmpTest {
    public static void main(String[] args) {
        Connection conn=null;
        PreparedStatement pstmt=null;
        try {
            //加载驱动
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:orcl";
            String username = "tom";
            String password = "123456";
            //获取程序的连接
            conn = DriverManager.getConnection(url, username, password);
            //删除语句
            String sql1 = "delete from EMP where EMPNO=7902";
            //预处理的方式
            pstmt =conn.prepareStatement(sql1);
            //返回处理结果
            boolean flag = pstmt.execute();
            System.out.println(flag);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                pstmt.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }


    }
}
