package DemoDay07;

import java.sql.*;

public class InsertEmpTest {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            //��������
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:orcl";
            String username = "tom";
            String password = "123456";
            //��ȡ���������
            conn = DriverManager.getConnection(url, username, password);
            //ִ�в������
           // String sql1 = "insert into emp values(1001,'Suzhou','Manager',7369,to_date(to_char(sysdate,'YYYY/MM/DD'),'yyyy-mm-dd'),1000,100,50)";
            String sql2 = "insert into emp values(1002,'Hangzhou','Manager',7369,to_date(to_char(sysdate,'YYYY/MM/DD'),'yyyy-mm-dd'),800,100,50)";
            String sql3 = "insert into emp values(1003,'Shanghai','Manager',7369,to_date(to_char(sysdate,'YYYY/MM/DD'),'yyyy-mm-dd'),900,100,50)";
            String sql4 = "insert into emp values(1004,'Wuhan','Manager',7369,to_date(to_char(sysdate,'YYYY/MM/DD'),'yyyy-mm-dd'),1000,100,50)";
            String sql5 = "insert into emp values(1005,'Chengdu','Manager',7369,to_date(to_char(sysdate,'YYYY/MM/DD'),'yyyy-mm-dd'),800,100,60)";
            String sql6 = "insert into emp values(1006,'Tianjing','Manager',7369,to_date(to_char(sysdate,'YYYY/MM/DD'),'yyyy-mm-dd'),900,100,60)";
            String sql7 = "insert into emp values(1007,'Xian','Manager',7369,to_date(to_char(sysdate,'YYYY/MM/DD'),'yyyy-mm-dd'),1000,100,70)";
            String sql8 = "insert into emp values(1008,'Shenzhen','Manager',7369,to_date(to_char(sysdate,'YYYY/MM/DD'),'yyyy-mm-dd'),800,100,70)";
           // String sql9 = "insert into emp values(1009,'Yunnan','Manager',7369,to_date(to_char(sysdate,'YYYY/MM/DD'),'yyyy-mm-dd'),900,100,70)";
            //stmt.addBatch(sql1);
            stmt.addBatch(sql2);
            stmt.addBatch(sql3);
            stmt.addBatch(sql4);
            stmt.addBatch(sql5);
            stmt.addBatch(sql6);
            stmt.addBatch(sql7);
            stmt.addBatch(sql8);
            //stmt.addBatch(sql9);
            int[] count = stmt.executeBatch();
            System.out.println(count.length);
           /* String sql4="select * from  EMP";//�鿴emp��
            PreparedStatement ps = conn.prepareStatement(sql4);//����1�����ڣ�����2���������ݵĲ���//java.sql.BatchUpdateException: �������г��ִ���: ORA-00001: Υ��ΨһԼ������ (TOM.PK_EMP)*/
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