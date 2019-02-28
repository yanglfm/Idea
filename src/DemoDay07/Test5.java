package DemoDay07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test5 {
    public static void main(String[] args) throws Exception {
        //��������
        Class.forName("oracle.jdbc.driver.OracleDriver");
        //��������
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "tom", "123456");
        //��������������
        Statement stmt = conn.createStatement();
        //����sql��

        String sql1="update bank set balance =800 where username='jack'";
        String sql2="select USERNAME,BALANCE from BANK";
        //ִ��
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
