package DemoDay07;

import oracle.jdbc.driver.OracleTypes;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;

public class QueryEmpTest3 {
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
            callstmt = conn.prepareCall("{call p_findByDeptid(?,?,?)}");

            //注入参数
            callstmt.setInt(1, 7499);
            //注册输出参数
            callstmt.registerOutParameter(2, OracleTypes.VARCHAR);
            callstmt.registerOutParameter(3, OracleTypes.DOUBLE);

            //执行存储过程
            callstmt.execute();
            //获取参数
            String ename = callstmt.getString(2);
            Double sal= callstmt.getDouble(3);

            System.out.println(ename+"\t\t"+sal);

        } catch (ClassNotFoundException e) {
            // java.lang.ClassNotFoundException: oracle.jdbc.driver.OracleDriver 驱动找不到
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
