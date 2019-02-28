package DemoDay07;

import java.sql.*;

public class QueryEmpTest {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt=null;
        try {
            //加载驱动
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:orcl";
            String username = "tom";
            String password = "123456";
            //获取程序的连接
            conn = DriverManager.getConnection(url, username, password);
            //查询语句
            String sql1 = "select * from EMP";
            //预处理的查询方式
            pstmt =conn.prepareStatement(sql1);
            //返回结果集
            ResultSet rs = pstmt.executeQuery();
            System.out.println("empno"+"\t\t"+"empname"+"\t\t"+"job"+"\t\t"+"hiredate"+"\t\t"+"salary"+"\t\t"+"deptno");
            while(rs.next()){
                System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getDate(5)+"\t\t"+rs.getDouble(6)+"\t\t"+rs.getInt(8));
            }
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
