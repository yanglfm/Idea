package DemoDay07;

import java.sql.*;

public class DeleteEmpTest {
    public static void main(String[] args) {
        Connection conn=null;
        PreparedStatement pstmt=null;
        try {
            //��������
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:orcl";
            String username = "tom";
            String password = "123456";
            //��ȡ���������
            conn = DriverManager.getConnection(url, username, password);
            //ɾ�����
            String sql1 = "delete from EMP where EMPNO=7902";
            //Ԥ����ķ�ʽ
            pstmt =conn.prepareStatement(sql1);
            //���ش�����
            boolean flag = pstmt.execute();
            System.out.println(flag);
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
