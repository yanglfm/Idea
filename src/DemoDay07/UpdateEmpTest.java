package DemoDay07;

import java.sql.*;

public class UpdateEmpTest {
    public static void main(String[] args) {
        Connection conn=null;
        PreparedStatement pstmt =null;
        try {
            //加载驱动
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:orcl";
            String username = "tom";
            String password = "123456";
            //获取程序的连接
            conn = DriverManager.getConnection(url, username, password);
            //执行修改语句:根据员工的编号修改薪资
            String sql1="update emp set sal=2000 where empno=7369";
            //执行修改语句
            //预处理
            pstmt = conn.prepareStatement(sql1);
            int i = pstmt.executeUpdate();
            if(i>0){
                System.out.println("修改成功");
            }else{
                System.out.println("修改失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                pstmt.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

    }
}
