package DemoDay07;

import java.sql.*;

public class UpdateEmpTest {
    public static void main(String[] args) {
        Connection conn=null;
        PreparedStatement pstmt =null;
        try {
            //��������
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:orcl";
            String username = "tom";
            String password = "123456";
            //��ȡ���������
            conn = DriverManager.getConnection(url, username, password);
            //ִ���޸����:����Ա���ı���޸�н��
            String sql1="update emp set sal=2000 where empno=7369";
            //ִ���޸����
            //Ԥ����
            pstmt = conn.prepareStatement(sql1);
            int i = pstmt.executeUpdate();
            if(i>0){
                System.out.println("�޸ĳɹ�");
            }else{
                System.out.println("�޸�ʧ��");
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
