package DemoDay07;

import java.sql.*;

public class InsertDeptTest {
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
            //����������
            stmt = conn.createStatement();
            //ִ�в������
            String sql10 = "insert into dept values(50,'IT','China')";
            String sql11 = "insert into dept values(60,'Developmemt','China')";
            String sql12 = "insert into dept values(70,'Technology','China')";
           // stmt.addBatch(sql10);
            stmt.addBatch(sql11);
            stmt.addBatch(sql12);
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
