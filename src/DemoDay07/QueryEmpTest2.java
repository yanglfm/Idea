package DemoDay07;

import oracle.jdbc.driver.OracleTypes;

import java.sql.*;


public class QueryEmpTest2 {

    public static void main(String[] args) {
        Connection conn = null;
        CallableStatement callstmt=null;
        try {
            //加载驱动
            Class.forName("oracle.jdbc.driver.OracleDriver");

            String url="jdbc:oracle:thin:@localhost:1521:orcl";
            String username="tom";
            String password="123456";
            //获取程序的连接
            conn = DriverManager.getConnection(url, username, password);

            //创建存储预处理器 带有输出参数
            callstmt = conn.prepareCall("{call p_findByDName(?,?)}");

            //注入参数:根据输入的部门名称查询员工信息
            callstmt.setString(1, "SALES");
            //注册输出参数
            callstmt.registerOutParameter(2, OracleTypes.CURSOR);
            //执行存储过程
            callstmt.execute();
            //带回结果
            ResultSet rs = (ResultSet) callstmt.getObject(2);
            System.out.println( "ename"+ "\t\t" +"sal");
            while(rs.next())
                System.out.println(rs.getString(1) + "\t\t" + rs.getDouble(2));

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }finally {
            try {
                //资源关闭
                callstmt.close();
                conn.close();
            } catch (SQLException e) {
                // TODO 自动生成的 catch 块
                e.printStackTrace();
            }
        }
    }
}
