package DemoDay07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

public class Test10 {
    public static void main(String[] args) throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        //��������
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "tom", "123456");
        //����������
        Statement stmt = conn.createStatement();
        //ִ���޸����
        String sql1="update bank set balance=800 where username='jack'";
        //ɾ�����
        String sql2="delete from bank where username='jack' ";
        //�������
        String  sql3="insert into bank(username,balance) values('ZHANGSAN',1800)";
        //���������

       // String  sql4="insert into stu(birthday) values (to_date(to_char(sysdate,'yyyy/mm/dd'),'yyyy/mm/dd'))";
        stmt.addBatch(sql1);
        stmt.addBatch(sql2);
        stmt.addBatch(sql3);
      //  stmt.addBatch(sql4);
        //ִ��������
        int[] count = stmt.executeBatch();
        System.out.println(count.length);
    }
}
