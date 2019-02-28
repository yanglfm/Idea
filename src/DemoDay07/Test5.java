package DemoDay07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test5 {
    public static void main(String[] args) throws Exception {
        //加载驱动
        Class.forName("oracle.jdbc.driver.OracleDriver");
        //创建连接
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "tom", "123456");
        //创建处理器对象
        Statement stmt = conn.createStatement();
        //创建sql文

        String sql1="update bank set balance =800 where username='jack'";
        String sql2="select USERNAME,BALANCE from BANK";
        //执行
        int i = stmt.executeUpdate(sql1);
        if(i>0){
            System.out.println("ok");
        }
        //
        ResultSet rs = stmt.executeQuery(sql2);
        while(rs.next()){
            String username = rs.getString(1);
            int balance = rs.getInt(2);
            System.out.println(username+"---"+balance);
        }
        rs.close();
        stmt.close();
        conn.close();

    }
}
