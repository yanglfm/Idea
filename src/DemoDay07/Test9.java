package DemoDay07;

import java.sql.*;

public class Test9 {
    public static void main(String[] args) throws Exception {
        //��������
        Class.forName("oracle.jdbc.driver.OracleDriver");
        //��������
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "tom", "123456");

        //�������
        String sql="select  * from BANK";//�������ݿ����������ֶ�����ȷ��select* ����ľ�����һ��Ҫ�����ݿ�����ȥ��
        //Ԥ����Ĳ��뷽ʽ
        PreparedStatement pstmt = conn.prepareStatement(sql);
        //���ؽ����
        ResultSet rs = pstmt.executeQuery();
        while(rs.next()){
            System.out.println(rs.getInt(2));
        }
        conn.close();

    }
}
