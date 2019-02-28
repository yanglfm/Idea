package DemoDay07;

import oracle.jdbc.OracleTypes;


import java.sql.*;

public class Test11 {
    public static void main(String[] args) throws Exception {

        Class.forName("oracle.jdbc.driver.OracleDriver");
        //创建连接
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "tom", "123456");
       //创建存储预处理器 带有输出参数
        CallableStatement callstmt = conn.prepareCall("{call p_findByDName(?,?)}");
        //注入参数
        callstmt.setString(1,"SALES");
        //注册输出参数
        callstmt.registerOutParameter(2, OracleTypes.CURSOR);
        // 执行存储过程
        callstmt.execute();
        //带回结果
        ResultSet rs = (ResultSet)callstmt.getObject(2);
        while(rs.next()){
           // String  ename =rs.getString();
            Double sal=rs.getDouble(2);
            System.out.println(sal);
        }


    }
}
